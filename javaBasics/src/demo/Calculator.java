package demo;

public class Calculator {
	public Calculator()
	{
		
	}
	public int  add(int a, int b) {
		return (a + b);
	}

	public void Substract(int a, int b) {
		System.out.println(a - b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		int sum=c.add(2, 3);
		System.out.println(sum);
		c.Substract(5, 3);

	}

}
