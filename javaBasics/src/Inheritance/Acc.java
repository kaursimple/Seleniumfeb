package Inheritance;

public class Acc extends Man {
	
	int bonus=3000;
	public static void main(String[] args) {
		Acc a=new Acc();
		System.out.println(a.bonus);
		System.out.println(a.salary);
	}
}
