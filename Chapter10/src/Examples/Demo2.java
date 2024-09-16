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
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JDesktopPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		frame = new JFrame();
		frame.setBounds(100, 100, 661, 494);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 625, 433);
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
		grades.setModel(new DefaultComboBoxModel(new String[] {"*Select grade*", "10", "11", "12"}));
		grades.setBounds(0, 64, 132, 42);
		panel.add(grades);
		
		JComboBox schools = new JComboBox();
		schools.setModel(new DefaultComboBoxModel(new String[] {"*Select school*", "Crescent Heights High School", "Lester B. Pearson High School", "Western Canada High School"}));
		schools.setBounds(163, 64, 174, 42);
		panel.add(schools);
		
		JTextArea display = new JTextArea();
		display.setBounds(0, 119, 337, 114);
		panel.add(display);
		
		JLabel images = new JLabel("");
		images.setBounds(10, 244, 327, 178);
		panel.add(images);
		
		JButton submitButton = new JButton("SUBMIT");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		submitButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		submitButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		submitButton.setForeground(Color.BLUE);
		submitButton.setBounds(370, 27, 245, 221);
		panel.add(submitButton);
	}
}
