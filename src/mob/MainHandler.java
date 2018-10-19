package mob;

import java.util.Scanner;

public class MainHandler {
	public static void main(String[] args) {
		boolean repetition = true;
		int choice;
		int selection;
		Scanner input = new Scanner(System.in);
		System.out.println("Available Operating System:");
		System.out.println("1.Android\n2.Ios\nSelect the one of them:");
		choice = input.nextInt();
		switch (choice) {
		case 1:
			System.out.println("1.Samsung\n2.MiPhones\n3.exit");
			System.out.println("Select one..!");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("1.Samsung Edge 7\n2.Samsung J7\n3.exit");
				System.out.println("Select one..!");
				choice = input.nextInt();
				switch (choice) {
				case 1:
					SmartPhone samsungedgeseven = new SamsungEdgeSeven();
					samsungedgeseven.setFeatures();
					samsungedgeseven.setUniqueFeatures();
					System.out.println("Samsung Edge 7 Features:");
					samsungedgeseven.setVersion();
					samsungedgeseven.showFeatures();
					
					while (repetition) {
						System.out.println("Select the feature you want to test:");
						choice = input.nextInt();
						switch (choice) {
						case 1:
							samsungedgeseven.makeCall();
							break;
						case 2:
							samsungedgeseven.sendSms();
							break;
						case 3:
							samsungedgeseven.sendMms();
							break;
						}
						System.out.println("Continue..?(1/0)");
						selection = input.nextInt();
						if (selection == 0)
							repetition = false;
					}
					break;

				case 2:
					SmartPhone samsungj7 = new SamsungJSeven();
					samsungj7.setFeatures();
					samsungj7.setUniqueFeatures();
					System.out.println("Samsung J7 Features:");
					samsungj7.setVersion();
					samsungj7.showFeatures();
					while (repetition) {
						System.out.println("Select the feature you want to test:");
						choice = input.nextInt();
						switch (choice) {
						case 1:
							samsungj7.makeCall();
							break;
						case 2:
							samsungj7.sendSms();
							break;
						case 3:
							samsungj7.sendMms();
							break;
						}
						System.out.println("Continue..?(1/0)");
						selection = input.nextInt();
						if (selection == 0)
							repetition = false;
					}
					break;
				}
				break;
			case 2:
				System.out.println("1.Redmi Note 4 7\n2.exit");
				System.out.println("Select one..!");
				choice = input.nextInt();
				switch (choice) {
				case 1:
					SmartPhone redminote4 = new RedmiNoteFour();
					redminote4.setFeatures();
					redminote4.setUniqueFeatures();
					System.out.println("Redmi Note 4 Features:");
					redminote4.setVersion();
					redminote4.showFeatures();
					while (repetition) {
						System.out
								.println("Select the feature you want to test:");
						choice = input.nextInt();
						switch (choice) {
						case 1:
							redminote4.makeCall();
							break;
						case 2:
							redminote4.sendSms();
							break;
						case 3:
							redminote4.sendMms();
							break;
						}
						System.out.println("Continue..?(1/0)");
						selection = input.nextInt();
						if (selection == 0)
							repetition = false;
					}
					break;
				}
				break;

			}
			break;

		case 2:
			System.out.println("1.IPhone 6s\n2.exit");
			System.out.println("Select one..!");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				SmartPhone iphone6 = new IphoneSixS();
				iphone6.setFeatures();
				iphone6.setUniqueFeatures();
				System.out.println("Iphone 6 s Features");
				iphone6.setVersion();
				iphone6.showFeatures();
				while (repetition) {
					System.out.println("Select the feature you want to test:");
					choice = input.nextInt();
					switch (choice) {
					case 1:
						iphone6.makeCall();
						break;
					case 2:
						iphone6.sendSms();
						break;
					case 3:
						iphone6.sendMms();
						break;
					}
					System.out.println("Continue..?(1/0)");
					selection = input.nextInt();
					if (selection == 0)
						repetition = false;
				}
				break;

			}
			break;
		}
	}
}
