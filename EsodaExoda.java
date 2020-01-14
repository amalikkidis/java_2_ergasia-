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
		System.out.println("Input your incomes, costs. Enter your costs with negative sign. Doctrine terminates if you insert 0");
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
		System.out.printf("Total cost is: %.2f%n", exoda);
		System.out.printf("Income without tax is: %.2f%n", esoda);
		double foros = (24 * esoda) / 100;
		esoda = esoda - foros;
		System.out.printf("Tax is: %, 2f%n", foros);
		System.out.printf("Income with tax is: %.2f%n", esoda);
		kz = esoda - exoda;
		if (kz > 0) {
			System.out.printf("Profit is: %.2f%n", kz);
		} else if (kz < 0) {
			System.out.printf("Damage is: %.2f%n", kz);
		}
		else
			System.out.printf("Income equals to cost");

	}

}
