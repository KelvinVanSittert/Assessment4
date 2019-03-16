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

        //The bad OCP is in employee, because human has already been made and we do not implement it,
        //so we must make name, surname and gender again
        Employee employee = new Employee("Name", "surname", "male");

        //The good OCP is in Student, because human has already been made and we implement it
        //The good DIP is in student, because you dont rely on concrete classes, you rely on an interface(Human)
        Student student = new Student(year, name, surname, gender);


        //The bad DIP is in dog, you are relying on a concrete class(Animal)
        Dog dog = new Dog();
        dog.canMove();
        dog.bark();





    }


}
