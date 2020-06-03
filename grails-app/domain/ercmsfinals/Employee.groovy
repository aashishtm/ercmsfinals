package ercmsfinals

class Employee {

    String fullName
    String address
    String email
    Long phone
    String userType = GlobalConfig.USER_TYPE.REGULAR_MEMBER
    String password
    Boolean isActive = true


    Date dateCreated
    Date lastUpdated

    static constraints = {
        email(email: true, nullable: false, unique: true, blank: false)
        password(blank: false)
        phone(nullable: false, blank: false)
    }
}
