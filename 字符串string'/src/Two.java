/**
 * Created by butter on 16-11-6.
 */
public class Two {

//    @Override
//    public String toString() {
//        return String.format("Two's address:%s\n", this);
//    }
//
//    public static void main(String[] args) {
//        List<Two> v = new ArrayList<Two>();
//
//        for (int i = 0; i < 10; i++) {
//            v.add(new Two());
//
//        }
//        System.out.println(v);
//    }
    public static void main(String[] args) {
        Two t = new Two();
        System.out.println(t);
    }



    @Override
    public String toString() {
        return String.format("adress : %s", super.toString());
    }
}
