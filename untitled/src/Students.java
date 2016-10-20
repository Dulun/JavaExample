import java.util.HashSet;
import java.util.Set;

/**
 * Created by butter on 16-10-19.
 */
class Student {
    private String name;
    private String number;
    Student(String name, String number){
        this.name   = name;
        this.number = number;
    }

    @Override
    public String toString(){
        return String.format("(%s, %s)", name, number);
    }
}

public class Students{
    public static void main(String[] args){
        Set students = new HashSet();
        students.add(new Student("Justin", "23452345"));
        students.add(new Student("Justinn", "234523455"));
        students.add(new Student("Justinnn", "2345234555"));
        System.out.println(students);

        Combine c = new Combine();
        c.methord();
    }
}

class Combine{
    int[] a = new int[] {1, 2, 4};
    int[] b = new int[] {3};
    int[] c = new int[a.length + b.length];
    void methord(){

        int i = 0, j = 0, k = 0;

//        while(i < a.length){
            while( j < b.length && i < a.length){
                if(a[i] < b[j]){
                    c[i+j] = a[i++];
                }
                else{
                    c[i+j] = b[j++];
                }
            }

            while(i < a.length){
                c[i+j] = a[i++];
            }
            while(j < b.length){
                c[i+j] = b[j++];
            }

            for(k = 0; k < c.length; k++){
                System.out.println(c[k]);
            }
//        }
    }
}

