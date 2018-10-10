import java.util.Scanner;

public class Mobile 
{
	public String camera;
	int featurech,sendernumber;
	public void getFeature(boolean sms,boolean mms,String cam,boolean gps)
	{
		camera=cam;
		System.out.println("SMS:"+sms);
		System.out.println("MMS:"+mms);
		System.out.println("Camera:"+cam);
		System.out.println("GPS:"+gps);
	}
	public void testFeature()
	{
		String strt;
		boolean ch = true;
		while(ch)
		{
		System.out.println("Select feature to be tested:");
		Scanner sc=new Scanner(System.in);
		featurech=sc.nextInt();
		switch(featurech)
		{
			case 1:System.out.println("Enter Sender Number:");
			       sendernumber=sc.nextInt();
			       System.out.println("SMS Sent to "+sendernumber);
			       break;
			   
			case 2:System.out.println("Enter Sender Number:");
		       	   sendernumber=sc.nextInt();
		           System.out.println("MMS Sent to "+sendernumber);
		           break;
		           
			case 3:System.out.println("The device will come up with "+camera+" Camera");
		           break;
		           
			case 4:System.out.println("The device is GPS enabled");
	           	   break;
	           	   
			case 5:ch=false;
	           	   
		}
		}
	}
}
