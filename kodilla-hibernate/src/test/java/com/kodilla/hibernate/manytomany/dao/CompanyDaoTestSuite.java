package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
        companyDao.deleteById(softwareMachineId);
        companyDao.deleteById(dataMaestersId);
        companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
        //do nothing
        }
    }

    @Test
    void testRetrieveCompanyWithThreeCharacters() {
        //Given
        Company microsoft = new Company("Microsoft");
        Company apple = new Company("Apple");
        Company nvidia = new Company("Nvidia");
        //When
        companyDao.save(microsoft);
        int microsoftId = microsoft.getId();
        companyDao.save(apple);
        int appleId = apple.getId();
        companyDao.save(nvidia);
        int nvidiaId = nvidia.getId();
        List<Company> result = companyDao.retrieveCompaniesWithDefinedCharacters("Mic");
        //Then
        assertEquals("Microsoft", result.get(0).getName());
        //CleanUp
        try {
            companyDao.deleteById(microsoftId);
            companyDao.deleteById(appleId);
            companyDao.deleteById(nvidiaId);
        } catch (Exception e) {
            //do nothing
        }
    }
        @Test
        void testRetrieveEmployeeWithLastname(){
            //Given
            Employee employee1 = new Employee("Tom", "Cruise");
            Employee employee2 = new Employee("Mark", "Wahlberg");
            Employee employee3 = new Employee("Harrison", "Ford");
            //When
            employeeDao.save(employee1);
            int employee1Id = employee1.getId();
            employeeDao.save(employee2);
            int employee2Id = employee2.getId();
            employeeDao.save(employee3);
            int employee3Id = employee3.getId();
            List<Employee> result = employeeDao.retrieveEmployeesWithDefinedCharacters("Cruise");
            //Then
            assertEquals("Cruise", result.get(0).getLastname());
            //CleanUp
            try {
                employeeDao.deleteById(employee1Id);
                employeeDao.deleteById(employee2Id);
                employeeDao.deleteById(employee3Id);
            } catch (Exception e) {
                //do nothing
            }


    }
}