package com.Array19august2022;

import java.util.Scanner;

public class SmallestArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] x=readArray();
		
		int s=smallestArray(x);
		
		System.out.println("the Smallest Array is : "+s);
		
		

	}
	
	
	static int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter  The Size Of Array  : ");
		int n=sc.nextInt();
		
		
		int ar[]=new int[n];
		System.out.println("enter The "+n+" No Array ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
			
		}return ar;
	}
	
	static int smallestArray(int []n)
	{
		int small=n[0];
		for(int j=0;j<n.length;j++)
		{
			if(n[j]<small)
				small=n[j];
				
		}return small;
		
	}

}
