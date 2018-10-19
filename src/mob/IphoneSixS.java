package mob;

public class IphoneSixS extends Ios {
	public void showFeatures() {
		System.out.println("1." + common_feature1
				+ "\n2." + common_feature2 + "\n3." + common_feature3 + "\n4."
				+ unique_feature + " \n5." + app_store + "\n6." + siri);
	}
	public void setVersion()
	{
		version="v12.3.3";
		System.out.println("Ios Version:"+version);
	}
}
