package com.Array18august2022;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the no. of array : ");
		int size=sc.nextInt();
		
			
		
	
		
		int  ar[]=new int[size];
		int evenCount=0,oddCount=0;
		System.out.println("eneter the "+size+" no. int value ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
			if(ar[i]%2==0)
				evenCount++;
			else
				oddCount++;
			 
		}
		
		System.out.println("the total even no. in array is "+evenCount);
		
		System.out.println("the total odd no. in array is "+ oddCount);
		
		System.out.println(ar[-1]);
		ar[-1]=45;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
