import java.util.*;

public class Are {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.println("enter the sides of square");
        a = s.nextInt();
        int area = a * a;
        System.out.println("the area is" + area);
        s.close();
    }

}
