package Examples;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JDesktopPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;

public class Demo2 {

	private JFrame frame;
	private JTextField firstNameTextField;
	private JTextField lastNameTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo2 window = new Demo2();
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
	public Demo2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon crescentHeights = new ImageIcon("C:\\Users\\37168004\\git\\CS30P3Fall2024\\Chapter10\\src\\Images\\images.png");
		ImageIcon lesterBPearson = new ImageIcon("C:\\Users\\37168004\\git\\CS30P3Fall2024\\Chapter10\\src\\Images\\865-logo.png");
		ImageIcon westernCanada = new ImageIcon("C:\\Users\\37168004\\git\\CS30P3Fall2024\\Chapter10\\src\\Images\\816-logo.png");
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 745, 494);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 709, 433);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		firstNameTextField = new JTextField();
		firstNameTextField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				firstNameTextField.setText("");
				
				
			}
		});
		firstNameTextField.setForeground(Color.GRAY);
		firstNameTextField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		firstNameTextField.setText("First Name");
		firstNameTextField.setBounds(0, 27, 132, 26);
		panel.add(firstNameTextField);
		firstNameTextField.setColumns(10);
		
		lastNameTextField = new JTextField();
		lastNameTextField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lastNameTextField.setText("");
				
			}
		});
		lastNameTextField.setForeground(Color.GRAY);
		lastNameTextField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lastNameTextField.setText("Last Name");
		lastNameTextField.setColumns(10);
		lastNameTextField.setBounds(163, 27, 132, 26);
		panel.add(lastNameTextField);
		
		
		
		JComboBox grades = new JComboBox();
		grades.setModel(new DefaultComboBoxModel(new String[] {"Select grade", "10", "11", "12"}));
		grades.setBounds(0, 64, 132, 42);
		panel.add(grades);
		
		JComboBox schools = new JComboBox();
		schools.setModel(new DefaultComboBoxModel(new String[] {"Select school", "Crescent Heights High School", "Lester B. Pearson High School", "Western Canada High School"}));
		schools.setBounds(163, 64, 197, 42);
		panel.add(schools);
		
		JTextArea display = new JTextArea();
		display.setBounds(0, 119, 444, 114);
		panel.add(display);
		
		JLabel images = new JLabel("");
		images.setBounds(10, 244, 327, 178);
		panel.add(images);
		
		JButton submitButton = new JButton("SUBMIT");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String grade = " ";
				String school = " ";
				String firstName = firstNameTextField.getText();
				String lastName = lastNameTextField.getText();
				
				if(grades.getSelectedItem().equals("10")) {
					grade = "10";
				}
				else if(grades.getSelectedItem().equals("11")) {
					grade = "11";
				}
				else if(grades.getSelectedItem().equals("12")) {
					grade = "12";
				}
				
				if(schools.getSelectedItem().equals("Crescent Heights High School")) {
					school = "Crescent Heights High School";
					images.setIcon(crescentHeights);
				}
				else if(schools.getSelectedItem().equals("Lester B. Pearson High School")) {
					school = "Lester B. Pearson High School";
					images.setIcon(lesterBPearson);
				}
				else if(schools.getSelectedItem().equals("Western Canada High School")) {
					school = "Western Canada High School";
					images.setIcon(westernCanada);
				}
				
				display.setText
				(
						firstName + " " +
						lastName + " is in grade " +
						grade + " and goes to " + 
						school + "."
						
				);
				
				
			}
		});
		submitButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		submitButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		submitButton.setForeground(Color.BLUE);
		submitButton.setBounds(454, 27, 245, 221);
		panel.add(submitButton);
	}
}
