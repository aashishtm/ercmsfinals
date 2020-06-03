package ercmsfinals

import grails.gorm.services.Service


@Service(Customers)
class AuthService {

    private static final String AUTHORIZED = "AUTHORIZED"

    def setEmployeeAuthorization(Employee employee) {
        def authorization = [isLoggedIn: true, employee: employee]
        AppUtil.getAppSession()[AUTHORIZED] = authorization
    }

    def doLogin(String email, String password){
        password = password
        Employee employee = Employee.findByEmailAndPassword(email, password)
        if (employee){
            setEmployeeAuthorization(employee)
            return true
        }
        return false
    }

    boolean isAuthenticated(){
        def authorization = AppUtil.getAppSession()[AUTHORIZED]
        if (authorization && authorization.isLoggedIn){
            return true
        }
        return false
    }


    def getEmployee(){
        def authorization = AppUtil.getAppSession()[AUTHORIZED]
        return authorization?.employee
    }


    def getEmployeeName(){
        def employee = getEmployee()
        return "${employee.fullName}"
    }

    def getEmployeeId(){
        def employee = getEmployee()
        return "${employee.id}"
    }

    def isAdministratorEmployee(){
        def employee = getEmployee()
        if (employee && employee.userType == GlobalConfig.USER_TYPE.ADMINISTRATOR){
            return true
        }
        return false
    }
}
