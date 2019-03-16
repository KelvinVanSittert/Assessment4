package group3b;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SayYesDoMathEatFoodTest {

    @Test
    public void sayYes() {
        SayYesDoMathEatFood sayYesDoMathEatFood = new SayYesDoMathEatFood();
        assertEquals("Yes", sayYesDoMathEatFood.sayYes());
    }

    @Test
    public void doMath() {
        SayYesDoMathEatFood sayYesDoMathEatFood = new SayYesDoMathEatFood();
        assertEquals("1 + 1 = 2", sayYesDoMathEatFood.doMath());
    }

    @Test
    public void eatFood() {
        SayYesDoMathEatFood sayYesDoMathEatFood = new SayYesDoMathEatFood();
        assertEquals("This food is really nice", sayYesDoMathEatFood.eatFood());
    }
}