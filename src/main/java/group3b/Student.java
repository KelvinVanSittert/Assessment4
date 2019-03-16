package group3b;

public class Student extends Human{

    //this is the sub class to human

    private String name;
    private String surname;

    public Student(){

    }

    public Student(String name, String surname, String gender){

        this.name = name;
        this.surname = surname;
        setGender(gender);

    }

    public String getName(){

        return name;

    }

    public String getSurname(){

        return surname;

    }

    public void setName(String value){

        this.name = value;

    }

    public void setSurname(String value){

        this.surname = surname;

    }




}
