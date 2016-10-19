/**
 * Created by butter on 16-10-17.
 */
public class FlyingFish extends Fish implements Flyer {

    public FlyingFish(String name){
        super(name);
    }

    public String getName(){
        return this.name;
    }
    @Override
    public void fly(){
        System.out.println("Flying");
    }
}
