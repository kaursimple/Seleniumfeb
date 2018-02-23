package Inheritance;

public class It extends Man{
	
	int bonus=1000;
	public void day()
	{
		System.out.println("today is monday");
	}
	
	public static void main(String[] args) {
		It i=new It();
		System.out.println(i.bonus);
		System.out.println(i.salary);
		i.day();
	}  

}
