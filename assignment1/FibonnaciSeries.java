package week1.assignment1;

public class FibonnaciSeries {
	
//	Assignment 3: Print Fibbinocci series for first 11 numbers
//	0 1 1 2 3 5 8 13 21 35 56 
//	Goal: To understand the arthimetic operation and loop
//	a) Create a class by name: Fibbinocci
//	b) Create a main method using shortcut
//	c) Write a logic to print fibbinocci from 0 to 56
//	Hints: 
//	Initialize 3 int variables (Tip: firstNum = 0, secNum = 1, sum = 0)
//	Print first number
//	Iterate from 1 to the 11
//	Add first and second number assign to sum
//	Assign second number to the first number
//	Assign sum to the second number
//	Print sum

public static void main(String[] args) {
	//Initialize 3 int variables
	 int Num1=0;
	 int Num2=1;
	 int sum=0;
	System.out.println(Num1);
	 for(int count =1;count <=11;count++) {
	 
		 sum=Num1+Num2;
		
		Num1=Num2;
		Num2=sum;
		System.out.println(sum);
	}
}
}

