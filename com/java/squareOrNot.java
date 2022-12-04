package com.java;
import java.util.Scanner;
public class squareOrNot {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
//		int square = sc.nextInt();
		System.out.println("Enter the breadth");
		int breadth;
		breadth = sc.nextInt();
		System.out.println("Enter the length");
		int length;
		length = sc.nextInt();
		
		
		if(length==breadth) {
			System.out.println(" It is Square");
		}else {
			System.out.println("It is not square");
		}
		

	}

}
