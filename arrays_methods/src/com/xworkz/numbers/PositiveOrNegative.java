package com.xworkz.numbers;
import java.util.Scanner;

public class PositiveOrNegative {
public static void main(String a[])
{
	int num ;
	System.out.println("Enter a number ::");
	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();
	
	if (num > 0)
	{
		System.out.println("Given number is a positive integer");
	}
	else if(num < 0)
	{
		System.out.println("Given number is a negative integer");
	
	}
	else 
	{
		System.out.println("Given number is neither positive nor negative");
	}
}
}
