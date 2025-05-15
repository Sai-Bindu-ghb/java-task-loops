package com.example1;

public class ReverseMultiplication {
	
	public void displayReverseMultiplication(int n)
	{
		if(n<=0)
		{
			System.out.println("-1");
		}
		else
		{	
			for(int i=10;i>=1;i--)
			{
				System.out.println(n+"x"+i+"="+(n*i));
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		ReverseMultiplication reverse=new ReverseMultiplication();
		reverse.displayReverseMultiplication(0);
		
   
	}

}
