import java.util.Scanner;

class Ios
{
	public void set()
	{
		int brchoice;
		System.out.println("Availabe brands under ios:");
		System.out.println("1.Apple\nCoose one:");
		
		Scanner sc=new Scanner(System.in);
		brchoice = sc.nextInt();
		
		switch(brchoice)
		{
			case 1 :Mobile apple=new Mobile();  
					apple.getFeature(true, true, "20MP",true);
					break;
		
	   
		}
	}
}