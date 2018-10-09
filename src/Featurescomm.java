//import java.util.Scanner;
public class Featurescomm 
{
	int featchoice;
	Featurescomm()
	{
		System.out.println("Common Feature:");
		System.out.println("\n1.SMS\n2.MMS\n3.PhoneDial:");
		//Scanner sc=new Scanner(System.in);
		
	}
					
}
class Featureuniq extends Featurescomm
{
	Featureuniq()
	{
		super();
		
		System.out.println("Camera Quality");
	}
	
}


class Featureseparate
{
	Featureseparate()
	{
		super();
		System.out.println("Player");
	}
}

