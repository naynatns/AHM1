package com.tnsif.daytwo;

public class NestedFoorLoop {

	public static void main(String[] args) {
		int beg=10;
		int last=20;
		
		
		for(int i=beg;i<=last;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(i*j);
			}
			System.out.println();
		}

	}

}
