package com.example1;

public class CubesOfNumbers {

	public void getCubesOfNumbers()
	{
		int result;
		for(int i=1;i<=10;i++)
		{
			result=i*i*i;
			System.out.println(i+"^"+"3"+"="+result);
		}
		
	}
	public static void main(String[] args) {
		
		CubesOfNumbers cube=new CubesOfNumbers();
		cube.getCubesOfNumbers();
	}

}
