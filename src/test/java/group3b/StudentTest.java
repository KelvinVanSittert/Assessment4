package group3b;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void getName() {

        Student student = new Student("Name", "Surname", "Male");

        assertEquals("Name", student.getName());
    }

    @Test
    public void setName() {

        Student student = new Student("Name", "Surname", "Male");
        student.setName("change");

        assertEquals("Name", student.getName());
    }

    @Test
    public void getSurname() {

        Student student = new Student("Name", "Surname", "Male");

        assertEquals("Surname", student.getSurname());
    }

    @Test
    public void setSurname() {

        Student student = new Student("Name", "Surname", "Male");
        student.setSurname("change");

        assertEquals("Name", student.getSurname());
    }

    @Test
    public void getGender() {

        Student student = new Student("Name", "Surname", "Male");

        assertEquals("Male", student.getGender());
    }

    @Test
    public void setGender() {

        Student student = new Student("Name", "Surname", "Male");
        student.setGender("Female");

        assertEquals("Female", student.getGender());
    }
}