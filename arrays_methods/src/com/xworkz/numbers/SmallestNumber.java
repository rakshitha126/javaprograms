package com.xworkz.numbers;
public class SmallestNumber {
	public static void main(String args[])
	{
		System.out.println("Progm to find the smallest number among three numbers");
		int a = 20,b = 30, c = 40;
        if(a>b)
		{
			System.out.println("a value 1 smallest");
		}else 
		{
			System.out.println("b value 1 smallest");
		}
		System.out.println("finding smallest number among 3 numbers");
		System.out.println("The number are: " + a + "" + b + "" + c );
		if(a>b)
		{
			if(a>c)
			{
		    }else 
			{
				if(b>c)	
				{
					System.out.println("b value 1 smallest among 3 numbers");
				} else 
				{
					System.out.println("c value 1 smallest among 3 numbers");
		        }
			}
		}
	}
}
