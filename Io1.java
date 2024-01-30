import java.io.DataInputStream;

class Io1 {
	public static void main(String args[]) {
		DataInputStream in = new DataInputStream(System.in);
		int a, b, c;
		try {
			System.out.println("enter the first number");
			a = Integer.parseInt(in.readLine());

			System.out.println("enter the Second number");
			b = Integer.parseInt(in.readLine());
			c = a + b;

			System.out.println("total sum is" + c);
		} catch (Exception e) {

			System.out.println("not valid");
		}
	}
}