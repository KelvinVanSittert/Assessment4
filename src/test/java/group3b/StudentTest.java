package group3b;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void getName() {

        Student student = new Student(2 , "Name", "Surname", "Male");

        assertEquals("Name", student.getName());
    }

    @Test
    public void setName() {

        Student student = new Student(2 ,"Name", "Surname", "Male");
        student.setName("change");

        assertEquals("change", student.getName());
    }

    @Test
    public void getSurname() {

        Student student = new Student(2 ,"Name", "Surname", "Male");

        assertEquals("Surname", student.getSurname());
    }

    @Test
    public void setSurname() {

        Student student = new Student(2 ,"Name", "Surname", "Male");
        student.setSurname("change");

        assertEquals("change", student.getSurname());
    }

    @Test
    public void getGender() {

        Student student = new Student(2 ,"Name", "Surname", "Male");

        assertEquals("Male", student.getGender());
    }

    @Test
    public void setGender() {

        Student student = new Student(2 ,"Name", "Surname", "Male");
        student.setGender("Female");

        assertEquals("Female", student.getGender());
    }

    @Test
    public void setYear(){

        Student student = new Student(2 ,"Name", "Surname", "Male");
        student.setYear(4);

        assertEquals(4, student.getYear());

    }

    @Test
    public void getYear(){

        Student student = new Student(2 ,"Name", "Surname", "Male");

        assertEquals(2, student.getYear());

    }
}
