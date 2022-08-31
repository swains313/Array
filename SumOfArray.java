package com.Array18august2022;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the no. of array : ");
		int size=sc.nextInt();
		
		
		int ar[]=new int[size];
		int sum=0;
		System.out.println("eneter the "+size+" no. int value ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
			 sum=sum+ar[i];
		}
		
		System.out.println("the sum of array is "+sum);
	

	}

}
