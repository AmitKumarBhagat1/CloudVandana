package java_Project_CloudVandana;

import java.util.Scanner;

public class Panagram {

public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		
		System.out.println("Given Sentence = "+str);
		
		if(str.length()<26)			//Panagram sentence must contain at least 26 character(a to z) 
		{
			System.out.println("\nGiven Sentence is not a Panagram");
		}
		else
		{
			String s= str.toLowerCase();		//Converted to lower case for comparing character 
			panagram(s);
		}
}
	public static void panagram(String s)
	{
		int count=0;

		for(char ch='a';ch<='z';ch++)
		{
				for(int i=0;i<s.length();i++)
				{
					if(s.charAt(i)==ch)
					{
						count++;
						break;		//If Character is found come out of inner for loop
					}
				}
			
		}
		if(count==26)
		{ 
			System.out.println("\nIT'S A PANAGRAM SENTENCE");
		}
		else
		{
			System.out.println("\n IT'S NOT A PANAGRAM SENTENCE");
		}
		
	}

}

