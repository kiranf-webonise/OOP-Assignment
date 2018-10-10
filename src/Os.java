import java.util.Scanner;
public class Os 
{
	public int oschoice;
	public void getOs()
	{
		System.out.println("Folowing Are available os:");
		System.out.println("\n1.Android\n2.ios");
		System.out.println("Select your choice:");
		
		Scanner sc=new Scanner(System.in);
		oschoice = sc.nextInt();
		
		switch(oschoice)
		{
			case 1 :new Android().set();  
					break;
		
			case 2 :new Ios().set();
					break;
			
			default:System.out.println("Invalid");
	   
		}
	}
}
