package com.Array23august2022;

import java.util.Scanner;

public class ZigZag {

	public static void main(String[] args) {
		int x[]= readArray();
		int y[]= readArray();
		
		
		
		display(x);
		display(y);
		
		int z[]= zigZag(x,y);
		
		for(int i=0;i<z.length;i++)
		{
			System.out.print(z[i]+" ");
		}
	
		

	}
	
	static int[] zigZag(int a[],int b[]) {
		
		int c[]=new int[a.length+b.length];
		
		int i=0,j=0;
		
		while(i<a.length && i< b.length)
		{
			c[j]=a[i];
			j++;
			c[j]=b[i];
			i++;
			j++;
		}
		
		while(i<a.length)
		{
			c[j]=a[i];
			i++;
			j++;
		}
		while(i<b.length)
		{
			c[j]=b[i];
			j++;
			i++;
		}
		
		
		
		
		
		
		
		return c;
	}
	
	static int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter The Size Of An Array n: ");
		int n=sc.nextInt();
		
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}return ar;
	}
	
	static void display(int x[]) {
		
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println();
	}

}
