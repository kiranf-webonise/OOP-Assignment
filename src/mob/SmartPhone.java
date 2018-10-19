package mob;

import java.math.BigDecimal;
import java.util.Scanner;

public abstract class SmartPhone {
	public BigDecimal mobile_number; 
	public String version;
	public String common_feature1="Calling";
	public String common_feature2="SMS";
	public String common_feature3="MMS";
	Scanner input = new Scanner(System.in);
	
	public abstract void setFeatures();
	public abstract void setUniqueFeatures();
	public abstract void showFeatures();
	public abstract void setVersion();
	public void makeCall() {
		System.out.println("Enter Mobile number to call:");
		mobile_number = input.nextBigDecimal();
		System.out.println("Calling on "+mobile_number);		
	}
	public void sendSms() {
		System.out.println("Enter Mobile number to send SMS:");
		mobile_number = input.nextBigDecimal();
		System.out.println("Message sent to :"+mobile_number);
	}
	public void sendMms() {
		System.out.println("Enter Mobile number to send MMS:");
		mobile_number = input.nextBigDecimal();
		System.out.println("MMS sent to :"+mobile_number);
	}
}
