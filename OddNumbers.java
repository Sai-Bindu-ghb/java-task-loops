package com.example1;

public class OddNumbers {
	
	public int getSumOdd(int num)
	{
		if(num<0)
		return -1;
		
		int sum=0;
		for(int i=1;i<=num;i=i+2) {
			sum=sum+i;
		}
		return sum;
	}
	

	public static void main(String[] args) {
		OddNumbers odd=new OddNumbers();
		int result=odd.getSumOdd(30);
		System.out.println(result);
       
	}

}
