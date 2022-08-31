package com.Array23august2022;

import java.util.Scanner;

public class MergedArray {

	public static void main(String[] args) {
		int x[]=readArray();
		int y[]=readArray();
		
		displayArray(x);
		displayArray(y);
		
		int z[]=mergedArray(x,y);
		
		System.out.println("merged Array : ");
		for(int i=0;i<z.length;i++)
		{
			System.out.print(z[i]+" ");
		}
	
		
		
		

	}
	
	static int[] mergedArray(int []a,int b[])
	{
		int z[]=new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{
			z[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			z[a.length+i]=b[i];
		}return z;
	}
	
	
	
	static void displayArray(int []n)
	{
		for(int i=0;i<n.length;i++)
		{
			System.out.print(n[i]+" ");
		}System.out.println();
	}
	
	
	
	
	
	
	
	static int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter The Size Of An Array n :");
		int n=sc.nextInt();
		
		int ar[]=new int[n];
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}return ar;
	}

}
