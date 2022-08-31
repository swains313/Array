package com.Array24august2022;

import java.util.Scanner;

public class DeleteArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size if an array : ");
		int n=sc.nextInt();
		
		System.out.println("enter The "+n+" No. Of Array :");
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter the index Between (0 - "+ar.length+" )");
		int in=sc.nextInt();
		
		int a[]=deleteArray(ar,in);
		System.out.println("after Delete The Array Of Index "+in);
		for(int j=0;j< a.length;j++)
		{
			System.out.print(a[j]+" ");
		}

	}
	
	static int[] deleteArray(int []ar,int in)
	{
		if(in<0 || in>ar.length)
		{
			System.out.print("!index Is Not In The Range : ");
			return ar;
		}
		int rs[]=new int[ar.length-1];
		
		for(int i=0;i<rs.length;i++)
		{
			if(i<in)
				rs[i]=ar[i];
			else
				rs[i]=ar[i+1];
		}
		return rs;
		
		
	}

}
