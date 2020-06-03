package ercmsfinals

class UIHelperTagLib {
    static namespace = "UIHelper"

    AuthService authService

    def memberActionMenu = { attrs, body ->
        out << '<li class="nav-item dropdown show">'
        out << g.link(class:"nav-link dropdown-toggle", "data-toggle":"dropdown"){authService.getEmployeeName()}
        out << '<div class="dropdown-menu bg-dark">'
        out << g.link(controller: "auth", action: "logout", class: "dropdown-item"){g.message(code:"logout")}
        out << "</div></li>"
    }

    def getCurrentEmpId = { attrs, body ->
        out<< g.link {authService.getEmployeeId()}
    }

    def mainNavigation = { attrs, body ->
        List navigations = [
                [controller: "dashboard", action: "index", name: "dashboard"],
                [controller: "customers", action: "index", name: "customer"],
        ]

        if(authService.isAdministratorEmployee()){
            navigations.add([controller: "employee", action: "index", name: "employee"])
        }

        navigations.each { menu ->
            out << '<li class="nav-item">'
            out << g.link(controller: menu.controller, action: menu.action, class:"nav-link") { g.message(code: menu.name, args: ['']) }
            out << '</li>'
        }
    }

}
