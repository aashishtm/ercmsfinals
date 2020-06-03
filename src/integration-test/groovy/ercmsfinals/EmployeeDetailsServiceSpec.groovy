package ercmsfinals

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class EmployeeDetailsServiceSpec extends Specification {

    EmployeeDetailsService employeeDetailsService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new EmployeeDetails(...).save(flush: true, failOnError: true)
        //new EmployeeDetails(...).save(flush: true, failOnError: true)
        //EmployeeDetails employeeDetails = new EmployeeDetails(...).save(flush: true, failOnError: true)
        //new EmployeeDetails(...).save(flush: true, failOnError: true)
        //new EmployeeDetails(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //employeeDetails.id
    }

    void "test get"() {
        setupData()

        expect:
        employeeDetailsService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<EmployeeDetails> employeeDetailsList = employeeDetailsService.list(max: 2, offset: 2)

        then:
        employeeDetailsList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        employeeDetailsService.count() == 5
    }

    void "test delete"() {
        Long employeeDetailsId = setupData()

        expect:
        employeeDetailsService.count() == 5

        when:
        employeeDetailsService.delete(employeeDetailsId)
        sessionFactory.currentSession.flush()

        then:
        employeeDetailsService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        EmployeeDetails employeeDetails = new EmployeeDetails()
        employeeDetailsService.save(employeeDetails)

        then:
        employeeDetails.id != null
    }
}
