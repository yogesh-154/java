package com.java;

import java.util.Scanner;
class algebra{	
	float add(float a , float b) {
		float ans =  a +  b;
		return ans;	
	}	
}
public class main1 {

	public static void main(String[] args) {
		algebra obj= new algebra();
		Scanner sc = new Scanner(System.in);
		float a = sc.nextInt();
		float b = sc.nextInt();
		float ans = a + b;
		System.out.println("The sum of inputs are: " + ans);
	}
}

