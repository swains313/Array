package com.Array18august2022;

import java.util.Scanner;

public class HighestLengthName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		
		System.out.println("Enter the no. of time ");
		int n=sc.nextInt();
		
		
		String names[]=new String[n];
		System.out.println("Enter the "+n+"time name ");
		for(int i=0;i<names.length;i++)
		{
			names[i]=sc.next();
		}
		
		String name=highesrLengthName(names);
		
		System.out.println("the highest length of name :   " +name);
			
		
	
		
	}
	
	static String highesrLengthName(String[] names)
	{
		String h=names[0];
		
		
		for(int i=1;i<names.length;i++)
		{
			
			if(names[i].length()>h.length())
				h=names[i];
			
		}return h;
		
		
		
		
	}
		

}
