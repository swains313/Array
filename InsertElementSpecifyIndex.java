package com.Array23august2022;

public class InsertElementSpecifyIndex {

	public static void main(String[] args) {
		
		int ar[]= {23,45,56,89,45};
		ar=inserArray(ar,39,2);
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
	

	}
	
	static int[] inserArray(int x[],int ele,int in)
	{
		if(in<0 || in>x.length)
		{
			System.out.println("index not in the range ");
			return x;
		}
		
		int y[]=new int[x.length+1];
		
		y[in]=ele;
		for(int i=0;i<x.length;i++)
		{
			if(i<in)
				y[i]=x[i];
			else
				y[i+1]=x[i];
		}
		return y;
		
	}

}
