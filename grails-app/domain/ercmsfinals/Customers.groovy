package ercmsfinals


class Customers {
    String fullName
    String address
    String email
    Long phone
    Employee employeeid
    Date dateCreated
    Date lastUpdated

    static constraints = {
        email(email: true, nullable: false, unique: true, blank: false)
        phone(nullable: false, blank: false)
    }
}
