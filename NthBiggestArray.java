package com.Array24august2022;

import java.util.Scanner;

public class NthBiggestArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter The Size Of An Array :  ");
		int n=sc.nextInt();
		
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();		
		}
		
		System.out.println("enter The nth number  max array you want :  ");
		int in=sc.nextInt();
		
		int a=nthMax(ar,in);
		System.out.println(a);
	
	}
	
	static int nthMax(int ar[],int in)
	{
		
		for(int i=0;i<ar.length;i++)
		{
			int count=0;
			for(int j=0;j<ar.length;j++)
			{
				if(ar[j]>ar[i])
					count++;
			}
			if(count==in-1)
		return ar[i];
		}
		System.out.println("biggest is not there ");
		return 0;
		
			
		
		
	}

}
