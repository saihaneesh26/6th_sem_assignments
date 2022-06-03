import java.util.Scanner;
public class Client {
	public void prepareBeverage() {
		Beverage b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter choice of beverage:\n1.Coffee.\n2.Tea");
		int ch = s.nextInt();
		if(ch==1) {
			b = new Coffee();
		}
		else {
			b = new Tea();
		}
		System.out.println("Preparing Beverage...");
		b.prepare();
		s.close();
	}
	public static void main(String args[]) {
		Client c = new Client();
		c.prepareBeverage();
	}
}
