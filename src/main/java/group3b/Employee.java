package group3b;

public class Employee {

    //This is bad OCP, because human has already been made and we do not implement it

    private String name;
    private String surname;
    private String gender;

    Employee(){

    }

    Employee(String name, String surname, String gender){

        this.name = name;
        this.surname = surname;
        this.gender = gender;

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

    public void setGender(String gender){

        this.gender = gender;

    }

    public String getGender(){

        return gender;

    }
}
