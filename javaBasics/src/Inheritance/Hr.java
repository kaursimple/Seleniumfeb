package Inheritance;

public class Hr extends Man {
	
	int bonus=2000;
	public static void main(String[] args) {
		Hr h=new Hr();
		System.out.println(h.bonus);
		System.out.println(h.salary);
	}
}
