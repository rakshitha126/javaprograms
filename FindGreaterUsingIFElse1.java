class FindGreaterUsingIFElse1
{
	public static void main(String args[])
	{
		System.out.println("Prog to find greatest of three numbers");
		{
			int a=10,b=90,c=40;
			if(a>b)
			{
				System.out.println("Print a is greater");
			} 
			else
			{
				System.out.println("Print b is greater");
			}
			System.out.println("Finding greatre number among 3 numbers");
			if (a>b)
			{
				if(a>c)
				{
					System.out.println("a is greater among 3");
				}
				else
				{
					System.out.println("c is greater");
				}
			} 
			else 
			{
				if(b>c) 
				{
					System.out.println("b is greater number among 3");
				} 
				else 
				{
					System.out.println("c is greater number among 3");
				}
			}
			System.out.println("End of pgm");
			
		}
		
	}
} 