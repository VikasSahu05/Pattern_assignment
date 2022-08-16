package com.techment.task;

public class squarePattern {

	public static void print_Square(int row,int column) {
		
		int i,j;
		
		for(i=1;i<=row;i++) {
			for(j=1;j<=column;j++) {
				if (i == 1 || i == row || j == 1 || j == column) 
					System.out.print("*");
                else
                    System.out.print(" ");
			}
			 System.out.println(" ");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		int rows = 5, columns = 5;
		print_Square(rows, columns);

	}

}
