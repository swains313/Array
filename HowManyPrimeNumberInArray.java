package com.Array19august2022;

import java.util.Scanner;

public class HowManyPrimeNumberInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("read The Number");
		int x[]=readArray();
		System.out.println("display The Array Number");
		displayNumber(x);
		
		int s=countPrime(x);
		System.out.print("the Prime Number Is "+s);

	}

	
	//FOR READ THE DATA 
	static int[] readArray() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter The Size Of Array : ");
		 int n=sc.nextInt();
		 int ar[]=new int[n];
		 for(int i=0;i<ar.length;i++)
		 {
			 ar[i]=sc.nextInt();
		 }
		return ar;
	}
	 
	 
	 //FOR DISPLAY THE NUMBER 
	static void displayNumber(int []num)
	 {
		 for(int i=0;i<num.length;i++)
			 System.out.print(num[i]+" ");		 
	 }
	 
	 
	 //CHECK PRIME NUMBER OR NOT 
	 static boolean isPrime(int n)
	 { 
		 for(int i=2;i<=n/2;i++)
		 {
			 if(n%i==0)
				 return false;
		 }return true; 
	 }
	 
	 //COUNT THE ARARY PRIME NUMBER 
	 static int countPrime(int []n)
	 {
		 
		 int count=0;
		 for(int i=0;i<n.length;i++)
		 {
			 boolean rs=isPrime(n[i]);
			 if(rs)
				 count++;
		 }
		 return count;
	 }
	 
}
