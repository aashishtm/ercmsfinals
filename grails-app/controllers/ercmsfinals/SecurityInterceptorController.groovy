package ercmsfinals


class SecurityInterceptor {

    AuthService authService

    SecurityInterceptor() {
        matchAll().excludes(controller: "employee", action: "save")
                .excludes(controller: "employee", action: "create")
                .excludes(controller: "auth")
    }

    boolean before() {
        if (!authService.isAuthenticated()) {
            redirect(controller: "auth", action: "login")
            return false
        }
        return true
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
