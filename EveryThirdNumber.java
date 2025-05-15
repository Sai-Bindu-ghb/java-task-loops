package com.example1;

public class EveryThirdNumber {
	
	public void getEveryThirdNumber(int n) {
		  
		
		for(int i=5;i<n;i=i+3)
		{
			
			System.out.println(i);
		}
		
		
	}

	public static void main(String[] args) {
		
		EveryThirdNumber every=new EveryThirdNumber();
		every.getEveryThirdNumber(50);
		
	}

}
