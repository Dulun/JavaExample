/**
 * Created by butter on 16-10-16.
 */
public class Fish implements Swimmer{
    protected String name;
    public Fish(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    @Override public void swim(){
        System.out.println("swimming");
    }

}
