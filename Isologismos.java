import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Isologismos {

	

	public HashMap<String, Double> addDataAsset(HashMap<String, Double> map) {
		System.out.println("Enter the asset data,if you want to stop adding data type stop at the category.");
		Scanner input = new Scanner(System.in);
		String category = "l";
		Double value;

		do {
			System.out.print("Enter the category: ");
			category = input.next();
			if (!category.equals("stop")) {
			System.out.print("Enter the value:");
			value = input.nextDouble();
			map.put(category, value);
			}
		} while (!category.equals("stop"));
		return map;
	}

	public HashMap<String, Double> addDataLiabilities(HashMap<String, Double> map) {
		System.out.println("Enter the liability data,if you want to stop adding data type stop at the category.");
		Scanner input = new Scanner(System.in);
		String category = "l";
		Double value;

		do {
			System.out.print("Enter the category: ");
			category = input.next();
			if (!category.equals("stop")) {
			System.out.print("Enter the value:");
			value = input.nextDouble();
			map.put(category, value);
			}
		} while (!category.equals("stop"));
		return map;
	}
	public boolean CheckIsologismos(HashMap<String, Double> assets, HashMap<String, Double> liabilities) {
		double sumOfAssets=0;
		double sumOfLiabilities=0;
		for(String key: assets.keySet()) {
			sumOfAssets += assets.get(key);
		}
		for(String key: liabilities.keySet()) {
			sumOfLiabilities += liabilities.get(key);
		}
		if (sumOfAssets==sumOfLiabilities) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
