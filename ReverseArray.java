package com.Array19august2022;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("read The Array : ");
	int x[] =readArray();
	
	System.out.println(" before Reverse Array  : ");
	displayArray(x);
	
	
	reverseArray(x);
	
	}
	

	 static int[] readArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter The Size Of Array : ");
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
			 System.out.print(n[i]+"  ");
		 }
	 }
	 
	
	static void reverseArray(int []n)
	{
		for(int i=0;i<n.length/2;i++)
		{
			int t=n[i];
			n[i]=n[n.length-1-i];
			n[n.length-1-i]=t;
		}
		System.out.println("\n after Reverse Array : ");
		for(int i=0;i<n.length;i++)
		{
			System.out.print(n[i]+" ");
		}
	}
	

}
