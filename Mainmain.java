import java.util.HashMap;

public class Mainmain {
	public static void main (String[]args) {
		Isologismos is = new Isologismos();
		HashMap<String, Double> asset = new HashMap<>();
		asset=is.addDataAsset(asset);
		
		HashMap<String, Double> liability = new HashMap<>();
		liability=is.addDataLiabilities(liability);
		System.out.println("ASSETS");
		for(String key: asset.keySet()) {
			System.out.println(key + "=" +  asset.get(key));
		}
		System.out.println("LIABILITIES");
		for(String key: liability.keySet()) {
			System.out.println(key + "=" +  liability.get(key));
		}
		
		boolean f=is.CheckIsologismos(asset, liability);
		if (f==true) {
			System.out.println("The isologismos is correct");
		}else {
			System.out.println("The isologismos is not correct.");
		}
	}

}
