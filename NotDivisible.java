package com.example1;

public class NotDivisible {
	
	public void getNotDivisible()
	{ 
		for(int i=1;i<=100;i++)
		{
			if(i%4!=0)
				System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		NotDivisible non=new NotDivisible();
		non.getNotDivisible();

	}

}
