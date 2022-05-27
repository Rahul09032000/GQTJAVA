package NewJavaProjects;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the numerator : ");
			int num=sc.nextInt();
			System.out.println("Enter the denominator : ");
			int den=sc.nextInt();
			int res=num/den;
			System.out.println("Result is : "+res);
			}
		catch (ArithmeticException e) {
			System.out.println("Divide by 0 not possible. Check the inputs and try again");
		}

	}

}
