package mob;

public class SamsungEdgeSeven extends Samsung {
	public void showFeatures() {
		System.out.println("1."+common_feature1
				+ "\n2." + common_feature2 + "\n3." + common_feature3 + "\n4."
				+ playstore + " \n5." + bluetooth + "\n6." + payapp);

	}
	public void setVersion()
	{
		version="v7.0.1";
		System.out.println("Android Verison:"+version);
	}

}
