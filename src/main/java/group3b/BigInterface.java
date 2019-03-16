package group3b;
//this is bad as you dont want a big interface, it makes the project more confusing.
//This is a violation of the interface segregation principle
public interface BigInterface {

    public int add(int a, int b);
    public String name(String name);
    public void tips();
}
