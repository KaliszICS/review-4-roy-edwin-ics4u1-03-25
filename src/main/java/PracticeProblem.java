import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String numberfive = in.nextLine();
		String fivenumberfive = "5" + numberfive;
		System.out.println(Integer.parseInt(fivenumberfive) + 5);
	}

	public static void q2() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		String numberpi = in.nextLine();
		String numberpi2 = "4" + numberpi + "3";
		System.out.println(Double.parseDouble(numberpi2)+ 3.4);
		
	}

	public static void q3() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		String notboolean = in.nextLine();
		System.out.println(! Boolean.parseBoolean(notboolean));
		
	}

	public static void q4() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String numberthree = in.nextLine();
		System.out.println((char)(Integer.parseInt(numberthree+3) +2));
	}

	public static void q5() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String numberthree = in.nextLine();
		System.out.println((double)((int)(Integer.parseInt(numberthree+1))/2));
		
	}

	public static void q6() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		String oneinfront = in.nextLine();
		System.out.println((int)((double)(Double.parseDouble(1+oneinfront))));
		
	}

}
