import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import java.awt.Color;

public class first_invoice_frame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					first_invoice_frame frame = new first_invoice_frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public first_invoice_frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1026, 669);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane menuLayeredPane = new JLayeredPane();
		menuLayeredPane.setBounds(10, 11, 990, 57);
		contentPane.add(menuLayeredPane);
		
		JLayeredPane workSpaceLayeredPane = new JLayeredPane();
		workSpaceLayeredPane.setBounds(10, 66, 990, 578);
		contentPane.add(workSpaceLayeredPane);
		workSpaceLayeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		workSpaceLayeredPane.add(panel, "name_2435266846600");
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 244, 990, 206);
		panel.add(scrollPane);
		
		JLayeredPane invoiceItemLayeredPane = new JLayeredPane();
		invoiceItemLayeredPane.setBounds(0, 0, 990, 244);
		panel.add(invoiceItemLayeredPane);
		invoiceItemLayeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel itemsFieldPanel = new JPanel();
		invoiceItemLayeredPane.add(itemsFieldPanel, "name_22954513041800");
		itemsFieldPanel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(27, 174, 178, 36);
		itemsFieldPanel.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Προϊον");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(28, 143, 66, 29);
		itemsFieldPanel.add(lblNewLabel);
		
		JLabel label = new JLabel("Φ.Π.Α");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(567, 147, 50, 20);
		itemsFieldPanel.add(label);
		
		textField = new JTextField();
		textField.setBounds(338, 73, 128, 37);
		itemsFieldPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(86, 149, 119, 20);
		itemsFieldPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		comboBox_1.setBounds(567, 174, 66, 36);
		itemsFieldPanel.add(comboBox_1);
		
		JLabel label_1 = new JLabel("Αριθμός Τιμολογίου");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(338, 46, 126, 23);
		itemsFieldPanel.add(label_1);
		
		JLabel lblNewLabel_1 = new JLabel("Παραγωγός");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(677, 46, 126, 23);
		itemsFieldPanel.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_2.setBounds(677, 74, 136, 36);
		itemsFieldPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_2 = new JLabel("Ποσότητα");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(844, 146, 126, 23);
		itemsFieldPanel.add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_3.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_3.setText("0");
		textField_3.setColumns(10);
		textField_3.setBounds(844, 175, 136, 36);
		itemsFieldPanel.add(textField_3);
		
		JLabel label_3 = new JLabel("Έκπτωση %");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(338, 146, 126, 23);
		itemsFieldPanel.add(label_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_4.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_4.setText("0");
		textField_4.setColumns(10);
		textField_4.setBounds(338, 175, 136, 36);
		itemsFieldPanel.add(textField_4);
		
		JLabel label_4 = new JLabel("Α.Φ.Μ");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(507, 46, 126, 23);
		itemsFieldPanel.add(label_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_5.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_5.setColumns(10);
		textField_5.setBounds(507, 74, 136, 36);
		itemsFieldPanel.add(textField_5);
		
		JLabel label_5 = new JLabel("Ημ/νια Έκδοσης");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(844, 46, 126, 23);
		itemsFieldPanel.add(label_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_6.setColumns(10);
		textField_6.setBounds(844, 74, 136, 36);
		itemsFieldPanel.add(textField_6);
		
		JLabel label_6 = new JLabel("Τιμή");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(677, 146, 126, 23);
		itemsFieldPanel.add(label_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_7.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_7.setText("0");
		textField_7.setColumns(10);
		textField_7.setBounds(677, 175, 136, 36);
		itemsFieldPanel.add(textField_7);
		
		JCheckBox checkBox = new JCheckBox("Πρόσθεσε");
		checkBox.setForeground(new Color(0, 139, 139));
		checkBox.setBounds(27, 126, 73, 23);
		itemsFieldPanel.add(checkBox);
		
		table = new JTable();
		table.setBounds(53, 108, 1, 1);
		itemsFieldPanel.add(table);
	}
}
