package com.Array24august2022;

import java.util.Scanner;

public class SmallestElement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter The Size Of An Array : ");
		int n=sc.nextInt();
		
		int ar[]=new int[n];
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		System.out.println("enter n minimum array no. (0 - "+ar.length+" )");
		int m=sc.nextInt();
		
		int minimum=minimumArray(ar,m);
		System.out.println("the "+m+" Minimum Array is "+ minimum);
		

	}
	
	static int minimumArray(int ar[],int m)
	{
		for(int i=0;i<ar.length;i++)
		{
			int count=0;
			for(int j=0;j<ar.length;j++)
			{
				if(ar[j]<ar[i])
					count++;
			}
			if(count == m-1)
				return ar[i];
			
		}
		System.out.println("!out of range");
		return 0;
	}

}
