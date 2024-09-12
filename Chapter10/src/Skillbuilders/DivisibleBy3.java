package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DivisibleBy3 {

	private JFrame frame;
	private JTextField input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisibleBy3 window = new DivisibleBy3();
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
	public DivisibleBy3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 335, 169);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please enter an integer");
		lblNewLabel.setBounds(10, 30, 156, 14);
		frame.getContentPane().add(lblNewLabel);
		
		input = new JTextField();
		input.setBounds(176, 27, 133, 20);
		frame.getContentPane().add(input);
		input.setColumns(10);
		
		JLabel display = new JLabel("");
		display.setBounds(153, 74, 156, 14);
		frame.getContentPane().add(display);
		
		JButton btnNewButton = new JButton("Check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int number = Integer.parseInt(input.getText());
				
				
				if (number % 3 == 0) {
					display.setText("Number is divisible by 3");
				}
				else {
					display.setText("Number is not divisible by 3");
				}
			
			}
		});
		btnNewButton.setBounds(22, 70, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
