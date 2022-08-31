package com.Array19august2022;

import java.util.Scanner;

public class Merged2Array {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("read The First array : \n");
	int []x =readArray();
	System.out.println("read The Second Array : \n");
	int []y=readArray();
	
	
	
	System.out.println("user Entered First Array : ");
	displayArray(x);
	System.out.println();
	System.out.println("user Entered Second Array : ");
	displayArray(y);
	
	
	
	System.out.println();
	int []merged=mergedArray(x, y);
	System.out.println("merged array is ");
	displayArray(merged);
	
		
	}
	
	
	//display the array
	static void displayArray(int[] x)
	{
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+"  ");
		}
	}
	
	
	//read the array 
	 static int[] readArray() {
		 
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("entered The Number Of Array : ");
		 int n=sc.nextInt();
		 
		 int ar[]=new int[n];
		 
		 for(int i=0;i<ar.length;i++)
		 {
			 ar[i]=sc.nextInt();
		 }
		
		return ar;
	}
	 
	 
	//for merging array
	 static int[] mergedArray(int []x,int []y)
	 {
		 
		 int []z=new int[x.length+y.length];
		 
		 for(int i=0;i<x.length;i++)
		 {
			 z[i]=x[i];
		 } 
		 for(int i=0;i<y.length;i++)
		 {
			 z[x.length+i]=y[i];
		 }
		  
		 return z;
	 }

}
