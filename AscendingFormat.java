package com.Array23august2022;

import java.util.Scanner;

public class AscendingFormat {

	public static void main(String[] args) {
		int x[]=readArray();
		int y[]=readArray();
		
		
		int z[]=arrayAsc(x, y);
		for(int i=0;i< z.length;i++)
		{
			System.out.print(z[i]+" ");
		}

	}
	
	static int[] arrayAsc(int []a,int b[])
	{
		int c[]=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
				c[k]=a[i++];
			else
				c[k]=b[j++];
			k++;
		}
		
		while(i<a.length)
		{
			c[k++]=a[i++];
		}
		while(j<b.length)
		{
			c[k++]=b[j++];
		}
		return c;
		
	}
	
	
	static int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter The Size Of Array : n");
		int n=sc.nextInt();
		
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		return ar;
	}

}
