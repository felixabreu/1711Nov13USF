package comrevaturehello;

import java.util.Scanner;

public class HelloWorld 
{
	//this is a comment hooray
	//main method
	public static void main(String[] args)
	{
		String name = "Genesis Bonds";
		System.out.println(name);
		int x =5;
		Integer ex = new Integer(5);//wrapper class
		//ex = x; //autoboxing
		double rand = Math.random();
		Scanner sc = new Scanner(System.in);//scanner
		String text = sc.nextLine();
		System.out.println("Hello " + text);
		int var[][]=new int [2][3];
		var[0][2]=5;
		var[1][1]=10;
		System.out.println(var[0][0]);
	}
	/*
	 * 
	 * 
	 * 
	 */ 
}
