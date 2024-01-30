
import java.util.*;

public class Lon {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, tatm, avg;
        System.out.println("enter the Marks of students");

        m1 = s.nextLong();
        m2 = s.nextLong();
        m3 = s.nextLong();
        m4 = s.nextLong();
        m5 = s.nextLong();
        m6 = s.nextLong();
        m7 = s.nextLong();
        m8 = s.nextLong();
        m9 = s.nextLong();
        m10 = s.nextLong();
        tatm = m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10;
        avg = tatm / 10;
        System.out.println("the area is" + tatm);
        System.out.println("the area is" + avg);
        s.close();
    }

}
