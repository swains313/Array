package com.Array18august2022;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of an array : ");
		int size=sc.nextInt();
		
		int[]   ar=new int[size];
		
		System.out.println("Enter the product price : ");
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
			sum=sum+ar[i];
		}
		
		System.out.println(sum);
		System.out.println("the average of product price is "+sum/ar.length);
		
	}

}
