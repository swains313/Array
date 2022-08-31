package com.Array18august2022;

import java.util.Scanner;

public class BiggestInteger {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the no. of array : ");
		int size=sc.nextInt();
		
		
		int ar[]=new int[size];
		int max=ar[0];
		System.out.println("eneter the "+size+" no. int value ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
			if(ar[i]>max)
				max=ar[i];
				
		}
		System.out.println("the biggest array  is "+max);

	}

}
