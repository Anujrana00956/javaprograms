import java.util.*;

public class Byt {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Byte a, b;
        System.out.print("Enter Value of a: ");
        a = in.nextByte();

        System.out.print("Enter Value of b: ");
        b = in.nextByte();

        if (a > b)
            System.out.println("Output: " + a);

        if (b > a)
            System.out.println("Output: " + b);
        if (a == b)
            System.out.println("Output: Both are equal");

        in.close();
    }
}