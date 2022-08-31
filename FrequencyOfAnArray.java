package com.Array24august2022;

import java.util.Scanner;

public class FrequencyOfAnArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter The Size Of An Array : ");
		int n=sc.nextInt();
		
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		frequencyEachArray(ar);

	}
	
	static void frequencyEachArray(int[] ar)
	{
		long start=System.nanoTime();
		boolean r[]=new boolean[ar.length];
		
		
		for(int i=0;i<ar.length;i++)
		{
			if(r[i]==false)
			{
				int count=1;
				for(int j=i+1;j<ar.length;j++)
				{
					if(ar[i]==ar[j])
					{
					count++;
					r[j]=true;
					}
				}
				System.out.print(ar[i]+" Present In " +count+" Time");
			}System.out.println();
			long end=System.nanoTime();
			System.out.println(end-start);
		}
	}

}
