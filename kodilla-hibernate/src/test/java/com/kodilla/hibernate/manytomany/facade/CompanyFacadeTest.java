package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyFacadeTest {
    private static Logger LOGGER = LoggerFactory.getLogger(CompanyFacadeTest.class);
    @Autowired
    private CompanyFacade companyFacade;
    @Autowired
    private CompanyDao companyDao;

    @Test
    public void searchCompanyByNameFragmentTest() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();

        List<Company> searchedCompany = companyFacade.searchCompanyWithAnyLetters("sof");
        //CleanUp
        try {
            Assert.assertEquals("Software Machine",searchedCompany.get(0).getName());
        }finally {
            companyDao.delete(softwareMachineId);
        }
    }
    @Test
    public void searchEmployeeWithNameFragmentTest() {
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Company softwareMachine = new Company("Software Machine");
        softwareMachine.getEmployees().add(johnSmith);
        softwareMachine.getEmployees().add(stephanieClarckson);
        johnSmith.getCompanies().add(softwareMachine);
        stephanieClarckson.getCompanies().add(softwareMachine);
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();

        List<Employee> searchedEmployee = companyFacade.findEmployeeWithLastNameFragment("smi");
//        List<Employee> searchedLastnameList = employeeDao.searchEmployeeWithLastName("Smith");
        try {
            LOGGER.info("Testing assert equals");
            Assert.assertEquals("Smith",searchedEmployee.get(0).getLastname());
        }finally {
            companyDao.delete(softwareMachineId);
        }

    }
}