package group3b;

/**
 * Hello world!
 *
 */
public class App
{

    public static void main( String[] args )
    {

        String name = "Kelvin";
        String surname = "Van Sittert";
        String gender = "Male";
        int year = 2;

        //Encapsulation and Polymorphism and Inheritance
        Student completedStudent = new Student(year, name, surname, gender);

        //Encapsulation and Polymorphism
        Student emptyStudent = new Student();

        //This is bad because it breaks the single-responsibility principle
        SayYesDoMathEatFood sayYesDoMathEatFood = new SayYesDoMathEatFood();
        sayYesDoMathEatFood.sayYes();
        sayYesDoMathEatFood.eatFood();

        //This is good because each class has one responsibility
        Eat eat = new Eat();
        eat.doEat();





    }


}
