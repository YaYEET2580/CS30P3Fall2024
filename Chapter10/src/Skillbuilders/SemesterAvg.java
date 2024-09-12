package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JDesktopPane;
import javax.swing.JScrollBar;

public class SemesterAvg {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemesterAvg window = new SemesterAvg();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SemesterAvg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter first grade");
		lblNewLabel.setBounds(31, 35, 79, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblEnterSecondGrade = new JLabel("Enter second grade");
		lblEnterSecondGrade.setBounds(31, 80, 94, 14);
		frame.getContentPane().add(lblEnterSecondGrade);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter third grade");
		lblNewLabel_1_1.setBounds(31, 124, 82, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(135, 32, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(135, 77, 86, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(135, 121, 86, 20);
		frame.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(70, 169, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(262, 32, 146, 121);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
