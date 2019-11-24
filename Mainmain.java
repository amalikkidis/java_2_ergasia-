import java.util.HashMap;
import java.util.Scanner;

public class Mainmain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Isologismos is = new Isologismos();
		HashMap<String, Double> asset = new HashMap<>();
		asset = is.addDataAsset(asset);
		String ch = "yes";
		String ch2 = "assets";
		HashMap<String, Double> liability = new HashMap<>();
		liability = is.addDataLiabilities(liability);

		boolean f = is.CheckIsologismos(asset, liability);
		do {
			if (f == true) {
				System.out.println("The balance sheet is correct.");
				System.out.println("ASSETS");
				for (String key : asset.keySet()) {
					System.out.println(key + "=" + asset.get(key));
				}
				System.out.println("LIABILITIES");
				for (String key : liability.keySet()) {
					System.out.println(key + "=" + liability.get(key));
				}
			} else {
				System.out.println("ASSETS");
				for (String key : asset.keySet()) {
					System.out.println(key + "=" + asset.get(key));
				}
				System.out.println("LIABILITIES");
				for (String key : liability.keySet()) {
					System.out.println(key + "=" + liability.get(key));
				}
				System.out.println("The balance sheet is not correct. ");
				System.out.println(
						" \n***Choose an option*** \n1)Change a specific value in the balance sheet type or add a new one. \n2)Delete the data you want. \n3)Remake the balance sheet.");
				int choice = input.nextInt();
				while (choice < 1 || choice > 3) {
					System.out.println("There is not such choice, please try again!");
					choice = input.nextInt();
				}
				switch (choice) {
				case 1:
					do {
						System.out.println(
								"Do you want to change or add data from the assets or the liabilities sheet? assets/labilities");
						ch2 = input.next();
						while (!ch2.equals("assets") && !ch2.equals("liabilities")) {
							System.out.println("There is not such choice, please type assets or liabilities!");
							ch2 = input.next();
						}
						if (ch2.equals("assets")) {
							System.out.println("Which category do you to want to change?");
							String category = input.next();
							System.out.println("Type the new value.");
							double value = input.nextDouble();
							asset.put(category, value);

						} else {

							System.out.println("Which category do you to want to change?");
							String category = input.next();
							System.out.println("Type the new value.");
							double value = input.nextDouble();
							liability.put(category, value);

						}
						System.out.println("Do you want to stop processing data? yes/no");
						ch = input.next();
						while (!ch.equals("yes") && !ch.equals("no")) {
							System.out.println("There is not such choice, please type yes or no!");
							ch = input.next();
						}
					} while (ch.equals("no"));
					break;

				case 2:
					do {
						System.out.println(
								"Do you want to remove data from the assets or the liabilities sheet? assets/labilities");
						ch2 = input.next();
						while (!ch2.equals("assets") && !ch2.equals("liabilities")) {
							System.out.println("There is not such choice, please type assets or liabilities!");
							ch2 = input.next();
						}
						if (ch2.equals("assets")) {
							System.out.println("Which category do you to want to remove?");
							String category = input.next();
							asset.remove(category);

						} else {
							System.out.println("Which category do you to want to remove?");
							String category = input.next();
							liability.remove(category);

						}
						System.out.println("Do you want to stop processing data? yes/no");
						ch = input.next();
						while (!ch.equals("yes") && !ch.equals("no")) {
							System.out.println("There is not such choice, please type yes or no!");
							ch = input.next();
						}
					} while (ch2.equals("no"));
					break;

				case 3:
					asset = is.addDataAsset(asset);
					liability = is.addDataLiabilities(liability);
					break;

				}
			}
			f=is.CheckIsologismos(asset, liability);
		} while (f == false);
		System.out.println("The balance sheet is correct.");
		System.out.println("ASSETS");
		for (String key : asset.keySet()) {
			System.out.println(key + "=" + asset.get(key));
		}
		System.out.println("LIABILITIES");
		for (String key : liability.keySet()) {
			System.out.println(key + "=" + liability.get(key));
		}

	}
}
