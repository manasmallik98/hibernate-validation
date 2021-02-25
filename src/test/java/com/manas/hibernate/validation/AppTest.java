package com.manas.hibernate.validation;

import static org.junit.Assert.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import com.manas.hibernate.dto.Employee;

/**
 * Unit test for simple App.
 */
public class AppTest {
    App app = new App();
    
    @Test
    public void testValidation() {
    	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aaaa");
    	EntityManager entityManager = entityManagerFactory.createEntityManager();
    	entityManager.getTransaction().begin();
    	Employee e1 = new Employee();
    	e1.setEmployeeEmailId("mallikmanas0gmail.com");
    	e1.setEmployeeId(78);
    	e1.setEmployeeMobileNo(789456);
    	e1.setEmployeeName("manas");
    	assertEquals(e1, app.setEmployee(e1, entityManager));
    }
}
