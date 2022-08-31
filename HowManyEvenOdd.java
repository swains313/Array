package com.Array19august2022;

import java.util.Scanner;

public class HowManyEvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("read Array ");
		int x[]=readArray();
		
		System.out.println("user Enterd Array");
		displayArray(x);
		
		evenOdd(x);
		
		
		
		
		
		
	}
	
	
	static boolean evenOdds(int n)
	{
		for(int i=0;i<n;i++)
		{
			if(n%2==0)	
			return true;	
		}return false;
	}
	
	static void evenOdd(int []n)
	{
		int even =0,odd=0;
		for(int i=0;i<n.length;i++)
		{
			boolean is=evenOdds(n[i]);
			if(is)
				even++;
			else
				odd++;
		}
		System.out.println("total Even No Array "+even);
		System.out.println("total Odd No Array "+odd);
	}
	

	static int [] readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of array : ");
		int n=sc.nextInt();
		
		int ar[]=new int[n];
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		return ar;	
	}
	
	
	
	static void displayArray(int []n)
	{
		for(int i=0;i<n.length;i++)
		{
			System.out.print(n[i]+"  \n");
		}
	}
	
	

}
