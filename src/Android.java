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
			case 1 :	Mobile nokia=new Mobile();
						nokia.getFeature(true,true,"13MP",true);
						nokia.testFeature();
						break;
		
			case 2 :	Mobile oppo=new Mobile();
						oppo.getFeature(true,true,"23MP",true);
			
	   
		}
	}
}