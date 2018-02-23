package Loop;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		int cp=1234;
		int tries=0;
		Scanner s=new Scanner(System.in);
		System.out.println("pl enter your pin");
		int p=s.nextInt();
		tries++;
		//System.out.println(p);
		while((cp!=p)&&tries<=3)
		{
			System.out.println("not correct pin");
			p=s.nextInt();
			tries++;
		}
		if(tries<=3&&cp==p)
		{
		System.out.println("correct pin"); 
		tries++;
		}
	}

}
