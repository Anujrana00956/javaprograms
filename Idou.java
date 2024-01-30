
import java.util.*;

class Idou {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double r;
        double pi = 3.14;
        System.out.println("enter the radius of circle");
        r = s.nextDouble();
        double a = pi * r * r;
        System.out.println("the area is" + a);
        s.close();
    }

}
