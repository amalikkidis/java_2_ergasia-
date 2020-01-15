import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class EsodaExoda2 {
        public static void main(String[] args) {
		double esoda = 0;
		double exoda = 0;
		double kz;
		Scanner input = new Scanner(System.in);
		ArrayList<Double> es = new ArrayList<Double>();
		ArrayList<Double> ex = new ArrayList<Double>();
		String f = JOptionPane.showInputDialog("Input your incomes, costs. Enter your costs with negative sign. Doctrine terminates if you insert 0");
		double x = Double.parseDouble(f);
		while (x != 0) {
			if (x > 0) {
				es.add(x);
			} else {
				ex.add(-x);
			}
			f = JOptionPane.showInputDialog("Input your incomes, costs. Enter your costs with negative sign. Doctrine terminates if you insert 0");
			x = Double.parseDouble(f);
				}
		for (int a = 0; a < es.size(); a++) {
			esoda = esoda + es.get(a);
		}
		for (int b = 0; b < ex.size(); b++) {
			exoda = exoda + ex.get(b);
		}
		JOptionPane.showMessageDialog(null, "Total cost is: %.2f%n", +exoda);
		JOptionPane.showMessageDialog(null, "Income without tax is: %.2f%n", +esoda);
		double foros = (24 * esoda) / 100;
		esoda = esoda - foros;
		JOptionPane.showMessageDialog(null, "Tax is: %.2f%n", +foros);
		JOptionPane.showMessageDialog(null, "Income with tax is: %.2f%n", +esoda);
		kz = esoda - exoda;
		if (kz > 0) {
			JOptionPane.showMessageDialog(null, "Profit is: %.2f%n", +kz);
		} else if (kz < 0) {
			JOptionPane.showMessageDialog(null, "Damage is: %.2f%n", +kz);
		}
		else
			JOptionPane.showMessageDialog("Income equals to cost");
	}

}
