package group3b;

public class Human {

    //this will be our super class

    private String gender;

    Human(){

    }

    Human(String gender){

        this.gender = gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

}
