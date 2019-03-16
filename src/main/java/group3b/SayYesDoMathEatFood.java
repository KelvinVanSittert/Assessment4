package group3b;

public class SayYesDoMathEatFood {
//The Single-Responsibility Principle (SRP) not being followed
    public String sayYes(){
        return "Yes";
    }

    public String doMath(){
        return "1 + 1 = 2";
    }

    public String eatFood(){
        return "This food is really nice";
    }

}
