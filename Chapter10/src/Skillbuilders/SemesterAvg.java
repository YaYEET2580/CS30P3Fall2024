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
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;


public class SemesterAvg {

	private JFrame frame;
	private JTextField grade1;
	private JTextField grade2;
	private JTextField grade3;

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
		lblNewLabel.setBounds(10, 35, 100, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblEnterSecondGrade = new JLabel("Enter second grade");
		lblEnterSecondGrade.setBounds(10, 80, 115, 14);
		frame.getContentPane().add(lblEnterSecondGrade);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter third grade");
		lblNewLabel_1_1.setBounds(10, 124, 103, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		grade1 = new JTextField();
		grade1.setBounds(135, 32, 86, 20);
		frame.getContentPane().add(grade1);
		grade1.setColumns(10);
		
		grade2 = new JTextField();
		grade2.setColumns(10);
		grade2.setBounds(135, 77, 86, 20);
		frame.getContentPane().add(grade2);
		
		grade3 = new JTextField();
		grade3.setColumns(10);
		grade3.setBounds(135, 121, 86, 20);
		frame.getContentPane().add(grade3);
		
		JLabel display = new JLabel("");
		display.setBounds(262, 32, 146, 121);
		frame.getContentPane().add(display);
		
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				DecimalFormat dc = new DecimalFormat("0.00");
				
				double gradeText1 = Double.parseDouble(grade1.getText());
				double gradeText2 = Double.parseDouble(grade2.getText());
				double gradeText3 = Double.parseDouble(grade3.getText());
				
				double average = (gradeText1 + gradeText2 + gradeText3) / 3;
				
				display.setText(dc.format(average));
			
			}
		});
		submitButton.setBounds(70, 169, 89, 23);
		frame.getContentPane().add(submitButton);
		
		
		frame.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel, lblEnterSecondGrade, lblNewLabel_1_1, grade1, grade2, grade3, submitButton, display, frame.getContentPane()}));
	}
}
