package week3.day1;

public class Calculator {

	public void add  (int num1, int num2) {
		System.out.println(num1+num2);
			}
	public void add2 (int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}
public void mult (int num1, int num2) {
	System.out.println(num1*num2);
	}
public void mult2 (int num1, double num2) {
	System.out.println(num1*num2);;
	
}
public  void sub (int num1, int num2) {
	System.out.println(num1-num2);
	
}
public void sub2(double num1, double num2) {
	System.out.println(num1*num2);;
	
}
public void div (int num1, int num2) {
	System.out.println(num1/num2);
}
public void div2 (int num1, double num2) {
	System.out.println(num1/num2);
	
}
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(15, 20);
		calc.add2(15, 25, 50);
		calc.mult(10, 20);
		calc.mult2(15, 40.25);
		calc.sub(20, 30);
		calc.sub2(35, 30);
		calc.div(500, 5);
		calc.div2(400, 20.5);
		

	}

}
