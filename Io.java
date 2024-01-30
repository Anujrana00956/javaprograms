
import java.io.*;

class Io {
    public static void main(String args[]) throws IOException {
        DataInputStream in = new DataInputStream(System.in);
        int a, b, c;

        System.out.println("enter the first number");
        a = Integer.parseInt(in.readLine());

        System.out.println("enter the Second number");
        b = Integer.parseInt(in.readLine());
        c = a + b;

        System.out.println("total sum is" + c);
        in.close();
    }

}