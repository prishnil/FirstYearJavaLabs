package plamichh_003;

import java.util.Scanner;

public class plamichh_lab03_q3 {

	// variables
	public String m_firstName;
	public String m_lastName;
	public int m_salary;

	// method

	void assigninfo() {

		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Please enter the employee's First name:");
		m_firstName = inputScanner.next();
		System.out.println("Please enter the employee's Last name:");
		m_lastName = inputScanner.next();
		System.out.println("Please enter the employee's Salary:");
		m_salary = inputScanner.nextInt();

	}

	void printinfo() {

		System.out.println("The first name is: " + m_firstName);
		System.out.println("The last name is: " + m_lastName);
		System.out.println("The salary is : " + m_salary);
	}

	public static void main(String[] args) {

		plamichh_lab03_q3 above = new plamichh_lab03_q3();

		above.assigninfo();

		above.printinfo();
	}

}
