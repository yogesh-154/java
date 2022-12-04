package com.java;
import java.util.Scanner;
public class Ifelse1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int age = sc.nextInt();
		
		if (age <= 12) {
			System.out.println("You are child");
		}else if (age >12 && age < 18) {
			System.out.println("Yor are teenager");
		}else {
			System.out.println("Yor are adult");
			
		}
		
	}

}
