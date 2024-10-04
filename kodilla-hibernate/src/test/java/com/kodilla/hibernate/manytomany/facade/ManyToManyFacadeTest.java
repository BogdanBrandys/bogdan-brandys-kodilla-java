package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
@Transactional
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
        Company uber = new Company("Uber");
        companyDao.save(uber);
        int uberId = uber.getId();
        Company sony = new Company("Sony");
        companyDao.save(sony);
        int sonyId = sony.getId();
        //search employee
        Employee johnSmesthy = new Employee("John", "Smesthy");
        employeeDao.save(johnSmesthy);
        int johnSmesthyId = johnSmesthy.getId();
        Employee janeJones = new Employee("Jane", "Jones");
        employeeDao.save(janeJones);
        int janeSmithId = janeJones.getId();
        //When
        List<Company> companyResults = null;
        List<Employee> employeeResults = null;
        try {
            companyResults = facade.searchCompany("ber");
        } catch (ProcessingException e) {
            // business exception - should be handled in real application
        }
        try {
            employeeResults = facade.searchEmployee("es");
        } catch (ProcessingException e) {
            // business exception - should be handled in real application
        }
        //Then
        assertEquals(1, companyResults.size());
        assertEquals(2, employeeResults.size());
        System.out.println(employeeResults);
        //Clean up
        companyDao.deleteById(uberId);
        companyDao.deleteById(sonyId);
        employeeDao.deleteById(johnSmesthyId);
        employeeDao.deleteById(janeSmithId);
    }

}