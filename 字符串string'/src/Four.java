/**
 * Created by butter on 16-11-7.
 */
public class Four extends Exception {


    public Four(String errMess, int x, int y) {
        super(String.format("(%d, %d) %s\n", x, y, errMess));
    }

    public static void main(String[] args) {
        try {
            throw new Four("Memery Error",123, 456);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
