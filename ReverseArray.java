package com.Array23august2022;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of an arary n:");
		int n=sc.nextInt();
		
		int ar[]=new int[n];
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		reverseArray(ar);
	}
	static void reverseArray(int []ar)
	{
		
		int i=0,j=ar.length-1;
		
		while(i<j)
		{
			int temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
			i++;
			j--;
		}
		 for(int k=0;k<ar.length;k++)
		{
			System.out.print(ar[k]+" ");
		}		
	}
	

}
