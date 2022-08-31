package com.Array25august2022;

import java.util.Scanner;

public class FrequencyArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter The Size Of An Array : ");
		int n=sc.nextInt();
		
		int ar[]=new int[n];
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		frequencyArray(ar);
		

	}
	
	static void frequencyArray(int ar[])
	{
		long start =System.nanoTime();
		int big=ar[0];
		
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>big)
			big=ar[i];
		}
		
		int count[]=new  int[big+1];
		for(int i=0;i<ar.length;i++)
		{
			count[ar[i]]++;
		}
		
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
			System.out.println(i+" is Present in "+count[i]);
		}
		long end=System.nanoTime();
		System.out.println(end-start);
	}

}
