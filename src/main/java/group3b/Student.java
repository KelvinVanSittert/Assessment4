package group3b;

public class Student implements Human{

    //this is the sub class to human
    //Instead of using a super class, we are now using an interface for question 2

    private String name;
    private String surname;
    private String gender;

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

        this.surname = value;

    }

    @Override
    public void setGender(String gender){

        this.gender = gender;

    }

    @Override
    public String getGender(){

        return gender;

    }


}
