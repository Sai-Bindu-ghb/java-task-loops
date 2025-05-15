package com.example1;

public class Numbersdivisible {
	
	public void getNumbersdivisible()
	{
		for(int i=1;i<=50;i++)
		{
			if(i%4==0 || i%6==0)
			{
			
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Numbersdivisible num=new Numbersdivisible();
		num.getNumbersdivisible();

	}

}
