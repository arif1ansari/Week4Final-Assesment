package com.arif.springboot.controller;

import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;

import com.arif.springboot.model.Employee;
import com.arif.springboot.repository.EmployeeRepository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Assert;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeControllerTest {

	@MockBean
	private EmployeeRepository employeeRepository;

	@Autowired
	private EmployeeController employeeController;

	@Test
	public void testCreateEmployee() {
		Employee employee = new Employee();
		employee.setFirstName("firstname");
		employee.setLastName("lastname");
		employee.setEmailId("test@gmail.com");

		Mockito.when(employeeRepository.save(employee)).thenReturn(employee);

		assertThat(employeeController.createEmployee(employee)).isEqualTo(employee);
	}

	@Test
	public void testGetEmployeeById() throws Exception {
		Employee employee = new Employee();
		employee.setId(1L);
		employee.setFirstName("Sharukh");
		employee.setLastName("Khan");
		employee.setEmailId("sk125@gmail.com");
//		Employee tt = employeeRepository.findById(1L).get();

		//Mockito.when(tt).thenReturn(employee);
//		assertThat(employeeController.getEmployeeById((long) 1L)).isEqualTo(employee);
	}

	

    @Test
    public void testGetAllPresentEmployees() throws Exception{
    	Employee employee1 = new Employee();
		employee1.setId(10L);
		employee1.setFirstName("Sharukh");
		employee1.setLastName("Khan");
		employee1.setEmailId("sk125@gmail.com");

		Employee employee2 = new Employee();
		employee2.setId(10L);
		employee2.setFirstName("Ajay");
		employee2.setLastName("Garg");
		employee2.setEmailId("ak@gmail.com");

        List<Employee> empList = new ArrayList<>();
        empList.add(employee1);
        empList.add(employee2);

  //      Mockito.when(employeeRepository.findAll()).thenReturn(empList);
//        assertThat(employeeController.getAllEmployees()).isEqualTo(empList);
    }
    
    
    

    @Test
    public void testDeleteEmployeeById() throws Exception{
    	Employee employee2 = new Employee();
		employee2.setId(10L);
		employee2.setFirstName("Ajay");
		employee2.setLastName("Garg");
		employee2.setEmailId("ak@gmail.com");

  //      Mockito.when(employeeRepository.save(employee2)).thenReturn(employee2);
//        Mockito.when(employeeRepository.findById((long) 105).get()).thenReturn(employee2);
    //    employeeRepository.deleteById(employee2.getId());
        //Mockito.when(employeeRepository.findById((long) 105).get()).thenReturn(employee2);
        //Assert.assertNotEquals(employee2, new Employee());
      //  Assert.assertEquals(employeeController.deleteEmployee((long) 105), false);
    }
    
    @Test
    public void testUpdateEmployee() throws Exception{
     	Employee employee2 = new Employee();
    		employee2.setId(10L);
    		employee2.setFirstName("Ajay");
    		employee2.setLastName("Garg");
    		employee2.setEmailId("ak@gmail.com");
    		employeeRepository.save(employee2);
        //Mockito.when(employeeRepository.findById(10L).get()).thenReturn(employee2);
      //  Employee employee = new Employee();
   //     employee.setEmailId("maran100@msn.com");
     //   Mockito.when(employeeRepository.save(employee2)).thenReturn(employee2);
 //       assertThat(employeeController.updateEmployee(10L, employee)).isEqualTo(employee2);
    }
}


