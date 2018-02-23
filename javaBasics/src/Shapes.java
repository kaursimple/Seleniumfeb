
public class Shapes {
	int l,b;
	public Shapes()
	{
		l=4;
		b=3;
	}
	public Shapes(int a,int b)
	{
		this.l=a;
		this.b=b;
	}
	public static void figureshapes()
	{
		System.out.println("rectangle");
	}
public void area()
{
	System.out.println(l*b+"cm.sq");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Shapes s=new Shapes();
     Shapes s1=new Shapes(2,2);
     s.area();
     s1.area();
     figureshapes();
	}

}
