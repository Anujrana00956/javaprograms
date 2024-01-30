
import java.util.*;

public class In {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r;
        System.out.println("enter the length and bredth");
        r = s.nextInt();
        int b = s.nextInt();
        int a = r * b;
        System.out.println("the area is" + a);
        s.close();
    }

}
