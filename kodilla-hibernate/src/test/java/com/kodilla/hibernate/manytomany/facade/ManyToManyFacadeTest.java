package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ManyToManyFacadeTest {
    @Autowired
    private ManyToManyFacade facade;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Test
    public void testManyToManyFacade() {
        //Given
        //search company
        Company microsoft = new Company("Microsoft");
        companyDao.save(microsoft);
        int microsoftId = microsoft.getId();
        //search employee
        Employee johnSmith = new Employee("John", "Smith");
        employeeDao.save(johnSmith);
        int johnSmithId = johnSmith.getId();
        //When
        try {
            facade.searchCompany("ros");
        } catch (ProcessingException e) {
            // business exception - should be handled in real application
        }
        try {
            facade.searchEmployee("ole");
        } catch (ProcessingException e) {
            // business exception - should be handled in real application
        }
        //Clean up
        companyDao.deleteById(microsoftId);
        employeeDao.deleteById(johnSmithId);
    }

}