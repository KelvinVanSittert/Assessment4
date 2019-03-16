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

        //Encapsulation and Polymorphism and Inheritance
        Student completedStudent = new Student(name, surname, gender);

        //Encapsulation and Polymorphism
        Student emptyStudent = new Student();

    }


}
