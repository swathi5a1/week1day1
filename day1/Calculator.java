package week1.day1;

public class Calculator {
	
	public int add(int num1, int num2 ) {		
return num1+num2;
	}
	
	public double sub(double num1, double num2) {
		return num1-num2;
	}
	
	public double mul(double num1, double num2) {
		return num1*num2;
	}
	
	public int div(int num1, int num2) {		
return num1/num2;
	}

	public static void main(String[] args) {
		Calculator obj = new Calculator();		
int add = obj.add(10,20);
System.out.println(add);
double sub = obj.sub(34.5,30.8);
System.out.println(sub);
double mul = obj.mul(33.456, 34.786);
System.out.println(mul);
int div = obj.div(45, 9);
System.out.println(div);
	}

}
