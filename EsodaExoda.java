import java.util.Scanner;
import java.util.ArrayList;
public class EsodaExoda {

	public static void main(String[] args) {
		double esoda = 0;
		double exoda = 0;
		double kz;
		double x = 0;
		Scanner input = new Scanner(System.in);
		ArrayList<Double> es = new ArrayList<Double>();
		ArrayList<Double> ex = new ArrayList<Double>();
		System.out.println("Eisagete esoda, exoda. Ta exoda me arnitiko prosimo. H diadikasia oloklironetai an eisagete to 0");
		x = input.nextDouble();
		while (x != 0) {
			if (x > 0) {
				es.add(x);
			} else {
				ex.add(-x);
			}
			x = input.nextDouble();
		}
		for (int a = 0; a < es.size(); a++) {
			esoda = esoda + es.get(a);
		}
		for (int b = 0; b < ex.size(); b++) {
			exoda = exoda + ex.get(b);
		}
		System.out.printf("Ta exoda einai: %.2f%n", exoda);
		System.out.printf("Ta esoda xwris forologia einai: %.2f%n", esoda);
		double foros = (24 * esoda) / 100;
		esoda = esoda - foros;
		System.out.printf("O foros einai: %, 2f%n", foros);
		System.out.printf("Ta esoda meta tin forologia einai: %.2f%n", esoda);
		kz = esoda - exoda;
		if (kz > 0) {
			System.out.printf("To kerdos einai: %.2f%n", kz);
		} else if (kz < 0) {
			System.out.printf("H zimia einai: %.2f%n", kz);
		}
		else
			System.out.printf("Ta esoda einai isa me ta exoda");

	}

}
