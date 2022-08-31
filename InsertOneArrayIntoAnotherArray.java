package com.Array24august2022;

import java.util.Scanner;

public class InsertOneArrayIntoAnotherArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x[]=readArray();
		int y[]=readArray();
		
		System.out.println("enter The Index");
		int in=sc.nextInt();
		
		int z[] =insertArray(x,y,in);

		for(int i=0;i<z.length;i++)
		{
			System.out.print(z[i]+" ");
		}
	}
	
	static int[] insertArray(int ar[],int br[],int in)
	{
		
		int rs[]=new int[ar.length+br.length];
		
		for(int i=0;i<br.length;i++)
		{
			rs[in+i]=br[i];
		}
		for(int i=0;i<ar.length;i++)
		{
			if(i<in)
				rs[i]=ar[i];
			else
				rs[i+br.length]=ar[i];
		}
		return rs;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	static int[] readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter The Size Of An Array : ");
		int n=sc.nextInt();
		
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	

}
