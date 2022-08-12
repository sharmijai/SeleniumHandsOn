package week1.assignment1;

public class MyCalculator {
	public static void main(String[] args) {
		CalculatorMethods obj3=new CalculatorMethods();
		int sum1=obj3.addThreeNumbers(5,6,7);
		System.out.println("Addition Of 3 No Is:"+ sum1);
		int minus=obj3.subThreeNumbers(8, 4);
		System.out.println("Subtraction Of 3 No Is:"+ minus);
		double prod1=obj3.prodThreeNumbers(234.453,949.45);
		System.out.println("prod of 2 no is :"+ prod1);
		float div=obj3.divideThreeNumbers(24.5f, 0.3f);
		System.out.println("Division Of 2 Numbers Is:" + div);
	
	}
	
	

	
}
