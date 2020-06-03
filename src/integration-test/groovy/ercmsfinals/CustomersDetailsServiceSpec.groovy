package ercmsfinals

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class CustomersDetailsServiceSpec extends Specification {

    CustomersDetailsService customersDetailsService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new CustomersDetails(...).save(flush: true, failOnError: true)
        //new CustomersDetails(...).save(flush: true, failOnError: true)
        //CustomersDetails customersDetails = new CustomersDetails(...).save(flush: true, failOnError: true)
        //new CustomersDetails(...).save(flush: true, failOnError: true)
        //new CustomersDetails(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //customersDetails.id
    }

    void "test get"() {
        setupData()

        expect:
        customersDetailsService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<CustomersDetails> customersDetailsList = customersDetailsService.list(max: 2, offset: 2)

        then:
        customersDetailsList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        customersDetailsService.count() == 5
    }

    void "test delete"() {
        Long customersDetailsId = setupData()

        expect:
        customersDetailsService.count() == 5

        when:
        customersDetailsService.delete(customersDetailsId)
        sessionFactory.currentSession.flush()

        then:
        customersDetailsService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        CustomersDetails customersDetails = new CustomersDetails()
        customersDetailsService.save(customersDetails)

        then:
        customersDetails.id != null
    }
}
