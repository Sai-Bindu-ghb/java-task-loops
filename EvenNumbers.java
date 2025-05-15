package com.example1;

public class EvenNumbers {
	
	public int getEven(int n) {
		
		int count=0;
		for(int i=1;i<=n;i++)
		 {
			 if(i%2==0)
			 {
				 count=count+1;
				
			 }
		 }
		
		return count;
		
	}
	public static void main(String[] args) {
		
		 EvenNumbers even=new EvenNumbers();
		 int result=even.getEven(50);
		 System.out.println(result);

	}

}
