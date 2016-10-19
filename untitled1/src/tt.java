/**
 * Created by butter on 16-10-12.
 */

import java.util.Scanner;
import static java.lang.System.out;

public class tt {

    public static void main(String[] args){

        ArrayList names = new ArrayList();
        collectNameTo(names);
        out.println("访客名单: ");

        printUpperCase(names);
    }

    static void printUpperCase(ArrayList names) {
        for(int i = 0; i < names.size(); i++){
            String name = (String) names.get(i);
            out.println(name.toUpperCase());
        }
    }

    static void collectNameTo(ArrayList names) {
        Scanner console = new Scanner(System.in);
        while(true){
            out.print("访客名称:");
            String name = console.nextLine();  //读取一行
            //String name = console.next();    //空格分割
            if(name.equals("quit")) {
                break;
            }
            names.add(name);
        }
    }


}
