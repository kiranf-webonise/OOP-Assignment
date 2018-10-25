package mob;

public abstract class Ios extends SmartPhone {
	public String app_store;
	public String siri;
	public String unique_feature;

	public void setUniqueFeatures() {
		unique_feature = "Apple Pay";
	}

	public void setFeatures() {
		app_store = "App Store";
		siri = "Siri";

	}
	public void setVersion()
	{
		version="v10.3.3";
	}

}
