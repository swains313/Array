package com.Array24august2022;

import java.util.Scanner;

public class InsertArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter The Size Of An Array : n ");
		int n=sc.nextInt();
		
		int ar[]=new int [n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		System.out.println("enter The  Element : ");
		int ele=sc.nextInt();
		
		System.out.println("enter The  Index BETWEEN  (0 -:"+ar.length+" )");
		int in=sc.nextInt();
		
		int  a[]=insertArray(ar,ele,in);
		
		System.out.println("after The Insertion Of Array");
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+" ");
		}

	}
	
	static int[] insertArray(int ar[],int ele,int in)
	{
		if(in< 0|| in>ar.length)
		{
			System.out.println("index Is Out Of Range : ");
			return ar;
			
		}
		
		int r[]=new int[ar.length+1];
		r[in]=ele;
		for(int i=0;i<ar.length;i++)
		{
			if(i<in)
			r[i]=ar[i];
			else
				r[i+1]=ar[i];
		}return r;
		
	}

}
