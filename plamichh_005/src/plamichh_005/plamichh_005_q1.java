package plamichh_005;

public class plamichh_005_q1 {

	public static void print(char a) {
		System.out.println("The character is " + a);
	}

	public static void print(int b) {
		System.out.println("The integer is " + b);
	}

	public static void print(String c) {
		System.out.println("The string is " + c);
	}

	public static void print(double d) {
		System.out.println("The double is " + d);
	}

	public static void print(boolean e) {
		System.out.println("The boolean is " + e);
	}

	static class Test {
		public static void main(String args[]) {
			plamichh_005_q1 obj = new plamichh_005_q1();
			obj.print(3);
			obj.print('f');
			obj.print(4 < 3);
			obj.print(9.81);
			obj.print("great");

		}
	}

}
