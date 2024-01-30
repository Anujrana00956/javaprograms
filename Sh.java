import java.util.*;
public class Sh {
    public static void main(String[] args) {
        short num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number you want: ");
        num = in.nextShort();

        System.out.println("Output value: " + (num * (num + 2)) / 2);
        in.close();
    }
}