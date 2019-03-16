package group3b;

public class Student implements Human{

    //this is the sub class to human
    //Instead of using a super class, we are now using an interface for question 2

    //this is good open closed principle, if we wanted to add a lecturer we could implement human to already have the name, surname and gender

    private String name;
    private String surname;
    private String gender;
    private int year;

    public Student(){

    }

    public Student(int year, String name, String surname, String gender){

        this.year = year;
        this.name = name;
        this.surname = surname;
        this.gender = gender;

    }


    @Override
    public String getName(){

        return name;

    }
    @Override
    public String getSurname(){

        return surname;

    }
    @Override
    public void setName(String value){

        this.name = value;

    }
    @Override
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

    public void setYear(int year){

        this.year = year;

    }

    public int getYear(){

        return year;

    }


}
