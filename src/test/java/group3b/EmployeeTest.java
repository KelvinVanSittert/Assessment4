package group3b;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    public void getName() {

        Employee employee = new Employee("Name", "Surname", "Male");

        assertEquals("Name", employee.getName());
    }

    @Test
    public void setName() {

        Employee employee = new Employee("Name", "Surname", "Male");
        employee.setName("change");

        assertEquals("change", employee.getName());
    }

    @Test
    public void getSurname() {

        Employee employee = new Employee("Name", "Surname", "Male");

        assertEquals("Surname", employee.getSurname());
    }

    @Test
    public void setSurname() {

        Employee employee = new Employee("Name", "Surname", "Male");
        employee.setSurname("change");

        assertEquals("change", employee.getSurname());
    }

    @Test
    public void getGender() {

        Employee employee = new Employee("Name", "Surname", "Male");

        assertEquals("Male", employee.getGender());
    }

    @Test
    public void setGender() {

        Employee employee = new Employee("Name", "Surname", "Male");
        employee.setGender("Female");

        assertEquals("Female", employee.getGender());
    }
}