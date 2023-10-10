package java_Project_CloudVandana;
import java.util.*;

public class ShuffleArray 
{
	public static void main(String[] args) 
	{	
		int arr[]= {1,2,3,4,5,6,7};
		
		System.out.print("Given Array : ");
		for(int a:arr)
		{
			System.out.print(a+" "); 
		}
		
			suffleNum(arr);
		
		
	}
	
	
	//Method to Generate Suffled Array
	public static void suffleNum(int arr[]) 
	{
		Random rObj=new Random();
		
		for(int i=0;i<arr.length;i++)
		{
			int rValue = rObj.nextInt(arr.length); //Generating random index number 
												   //swipe the value (i index <--->random index)
			int temp=arr[i];
			arr[i]=arr[rValue];
			arr[rValue]=temp;
		}
		System.out.print("\nSuffled Array : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
