package com.example1;

public class MultiplesOfNumber {
	
	public void getMultiplesOfNumber(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
		}
	}
	public static void main(String args[])
	{
		MultiplesOfNumber m=new MultiplesOfNumber() ;
	    m.getMultiplesOfNumber(7);
		
		
	}
	

}
