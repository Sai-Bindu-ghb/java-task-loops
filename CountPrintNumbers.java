package com.example1;

public class CountPrintNumbers {
     
	public int getCountPrintNumbers()
	{
		int count=0;
		System.out.println("numbers:");
		for(int i=1;i<=100;i++)
		{
			if(i%9==0)
			{
				System.out.println(i);
				count=count+1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		CountPrintNumbers cout=new CountPrintNumbers();
		System.out.println(cout.getCountPrintNumbers());

	}

}
