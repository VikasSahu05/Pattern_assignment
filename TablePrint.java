package com.techment.task;

public class TablePrint {

	public static void table(int n,int limit)
	{	
		for(int i=1;i<=limit;i++) {
			System.out.println(n+ " * " +i+" = "+n*i);
		}
	}
	
	public static void main(String[] args) {
		
		int input = 3;
		int limit =15;
		System.out.println("Enter the Table Name:"+input);
		System.out.println("Enter the Limit:"+limit);
		
		table(input,limit);

	}

}
