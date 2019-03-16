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
    public void getSurname() {

        Student student = new Student("Name", "Surname", "Male");

        assertEquals("Surname", student.getSurname());
    }

    public void getGender() {

        Student student = new Student("Name", "Surname", "Male");

        assertEquals("Male", student.getGender());
    }
}