package methodoverloading;

public class Calculator {
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c); 
	}
	
	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add(2, 2);
		c.add(2, 3, 4);
	}

}
