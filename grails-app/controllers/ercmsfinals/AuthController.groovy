package ercmsfinals

import grails.validation.ValidationException

import static org.springframework.http.HttpStatus.CREATED

class AuthController {

    AuthService authService
    EmployeeService employeeService

    def login() {
        if (authService.isAuthenticated()) {
            redirect(controller: "dashboard", action: "index")
        }
    }

    def create() {
        respond new Employee(params)
    }

    def save(Employee employee) {
        if (employee == null) {
            notFound()
            return
        }

        try {
            employeeService.save(employee)
        } catch (ValidationException e) {
            respond employee.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'employee.label', default: 'Employee'), employee.id])
                redirect employee
            }
            '*' { respond employee, [status: CREATED] }
        }
    }

    def doLogin() {
        if (authService.doLogin(params.email, params.password)) {
            redirect(controller: "dashboard", action: "index")
        } else {
            flash.message = AppUtil.infoMessage("Email Address or Password not Valid.", false)
            redirect(controller: "auth", action: "login")
        }
    }


    def logout() {
        session.invalidate()
        redirect(controller: "auth", action: "login")
    }
}
