import java.util.*;

/**
 * Created by butter on 16-10-19.
 */
public class WorldConut {

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("input English please: ");
        Set words = tokenSet(console.nextLine());
        System.out.printf("%d %s \n", words.size(), words);
    }

    static Set tokenSet(String s) {
        String[] tokens = s.split(" ");
        return new HashSet(Arrays.asList(tokens));
    }
}
