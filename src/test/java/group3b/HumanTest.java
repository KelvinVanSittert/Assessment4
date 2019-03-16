package group3b;

import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {

    @Test
    public void setGender() {

        Human human = new Human();
        human.setGender("Female");
        assertEquals("Female", human.getGender());
    }

    @Test
    public void getGender() {

        Human human = new Human("Female");
        assertEquals("Female", human.getGender());

    }
}