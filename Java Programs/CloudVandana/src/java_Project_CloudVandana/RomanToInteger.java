package java_Project_CloudVandana;

public class RomanToInteger 
{
	public static void main(String[] args) 
	{
		String s="LXXXVIII";
		int ans=returnInt(s);
		System.out.println(ans);
		
	}
	
	//Method to convert every character into integer
	public static int valueR2I(char ch)
	{
		int value=0;
		switch(ch)
		{
			case 'I':value=1;
					break;
			case 'V':value=5;
					break;
			case 'X':value=10;
					break;
			case 'L':value=50;
					break;
			case 'c':value=100;
					break;
			case 'D':value=500;
					break;
			case 'M':value=1000;
					break;
		}
		return value;
	}
	
	
	//Method to convert roman to integer
	public static int returnInt(String s)
	{
		int sum=0;
		
		for(int i=0;i<s.length();i++)
		{
			int value1st=valueR2I(s.charAt(i));
			
			if(i+1<s.length())
			{
				int value2nd=valueR2I(s.charAt(i+1));
				if(value1st>=value2nd)
				{
					sum += value1st;		//If value like LX=60
				}
				else
				{
					sum -=value1st;			//If value like XL=40
				}
			}
			else
			{
				sum += value1st;
			}
		}
		return sum;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
