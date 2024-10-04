package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManyToManyFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(ManyToManyFacade.class);
    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;
    @Autowired
    public ManyToManyFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }
    public List<Company> searchCompany(final String prefix) throws ProcessingException {
        LOGGER.info("Searching Company with prefix: " + prefix);
        List<Company> result = companyDao.retrieveCompaniesWithDefinedCharacters(prefix);
        if (result.isEmpty()) {
            LOGGER.error(ProcessingException.NO_VALUE_ERROR);
            throw new ProcessingException(ProcessingException.NO_VALUE_ERROR);
        }
        System.out.println("There is a company with prefix: " + prefix + " Company: " + result.get(0).getName());
        return result;
    }
    public List<Employee> searchEmployee(final String lastname) throws ProcessingException {
        LOGGER.info("Searching Employee with lastname: " + lastname);
        List<Employee> result = employeeDao.retrieveEmployeesWithDefinedCharacters(lastname);
        if (result.isEmpty()) {
            LOGGER.error(ProcessingException.NO_VALUE_ERROR);
            throw new ProcessingException(ProcessingException.NO_VALUE_ERROR);
        }
        System.out.println("There is a employee with prefix: " + lastname + " Employee: " + result.get(0).getLastname());
        return result;
    }
}
