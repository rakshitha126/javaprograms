class FindGrade
{
	public static void main(String args[])
	{
		System.out.println("Finding Grade for percentage");
		
		float percentage = 78.9f;
		
		if(percentage >= 85)
		{
			System.out.println("You have got A");
		}
		else if(percentage >= 65 && percentage <= 84)
		{ 
			System.out.println("You have got B");
		}
		else if(percentage >= 35 && percentage <=64)
		{
			System.out.println("You have got C");
		}
		else 
		{
			System.out.println("You have got D");
		}
	}
}