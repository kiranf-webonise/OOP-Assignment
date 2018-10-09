import java.util.Scanner;
public class Android
{
	public void set()
	{
		int brchoice;
		System.out.println("All availabe brands under android:");
		System.out.println("1.Nokia\n2.Oppo\nCoose one:");
		Scanner sc=new Scanner(System.in);
		brchoice = sc.nextInt();
		
		switch(brchoice)
		{
			case 1 :new Nokia().set();  
					break;
		
			case 2 :new Oppo().set();
			
			default:System.out.println("invalid");
	   
		}
	}
}