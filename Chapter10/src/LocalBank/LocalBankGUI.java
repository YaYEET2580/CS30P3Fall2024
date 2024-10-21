/*

Program: LocalBankGUI.java          Last Date of this Revision: October 21, 2024

Purpose: An application that implements a GUI for the LocalBank program from 'Inheritance and Polymorphism'

Author: Sakibul Majid 
School: CHHS
Course: Computer Programming 30
 

*/

package LocalBank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import org.eclipse.wb.swing.FocusTraversalOnArray;

@SuppressWarnings("all")
public class LocalBankGUI {

    // GUI components: text fields for user inputs
	private JFrame frame;
	private JTextField accountNumber;
	private JTextField enterAmount;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField beginningBalance;
	
	// Instance of the Bank class to handle transactions
	Bank easySave = new Bank();

	/**
	 * Launch the application.
	 * The main method uses EventQueue to ensure that the GUI runs on the event-dispatching thread.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LocalBankGUI window = new LocalBankGUI();  // Create a new LocalBankGUI instance
					window.frame.setVisible(true);  // Make the frame visible
				} catch (Exception e) {
					e.printStackTrace();  // Handle exceptions during initialization
				}
			}
		});
	}

	/**
	 * Create the application.
	 * Constructor for LocalBankGUI, calls initialize() to set up the components.
	 */
	public LocalBankGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * Sets up the layout and components of the frame.
	 */
	private void initialize() {
		// Create the main frame and set its properties
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 515);  // Set the frame size and position
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close the application when the window is closed
		frame.getContentPane().setLayout(null);  // Disable layout managers for manual positioning
		
		// Text field for account number input
		accountNumber = new JTextField();
		// Clear the text field when clicked
		accountNumber.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				accountNumber.setText(null);
			}
		});
		accountNumber.setForeground(Color.LIGHT_GRAY);
		accountNumber.setText("Account Number");  // Placeholder text
		accountNumber.setBounds(10, 54, 414, 20);  // Position and size
		frame.getContentPane().add(accountNumber);
		accountNumber.setColumns(10);

		// Text field for entering the transaction amount
		enterAmount = new JTextField();
		// Clear the text field when clicked
		enterAmount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				enterAmount.setText(null);
			}
		});
		enterAmount.setText("Enter Amount");  // Placeholder text
		enterAmount.setForeground(Color.LIGHT_GRAY);
		enterAmount.setColumns(10);
		enterAmount.setBounds(10, 85, 414, 20);
		frame.getContentPane().add(enterAmount);
		
		// Text field for entering the first name (used for adding accounts)
		firstName = new JTextField();
		// Clear the text field when clicked
		firstName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				firstName.setText(null);
			}
		});
		firstName.setText("First Name");  // Placeholder text
		firstName.setForeground(Color.LIGHT_GRAY);
		firstName.setColumns(10);
		firstName.setBounds(10, 116, 414, 20);
		frame.getContentPane().add(firstName);

		// Text field for entering the last name (used for adding accounts)
		lastName = new JTextField();
		// Clear the text field when clicked
		lastName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lastName.setText(null);
			}
		});
		lastName.setText("Last Name");  // Placeholder text
		lastName.setForeground(Color.LIGHT_GRAY);
		lastName.setColumns(10);
		lastName.setBounds(10, 147, 414, 20);
		frame.getContentPane().add(lastName);

		// Text field for entering the beginning balance (used for adding accounts)
		beginningBalance = new JTextField();
		// Clear the text field when clicked
		beginningBalance.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				beginningBalance.setText(null);
			}
		});
		beginningBalance.setText("Beginning Balance");  // Placeholder text
		beginningBalance.setForeground(Color.LIGHT_GRAY);
		beginningBalance.setColumns(10);
		beginningBalance.setBounds(10, 178, 414, 20);
		frame.getContentPane().add(beginningBalance);

		// Label to display messages or results of operations
		JLabel display = new JLabel("Account Info goes here");
		display.setBounds(10, 209, 414, 89);  // Position and size
		frame.getContentPane().add(display);

		// ComboBox for selecting bank activities
		JComboBox bankActivities = new JComboBox();
		bankActivities.addActionListener(new ActionListener() {
			// Handle selection of different bank activities
			public void actionPerformed(ActionEvent e) {
				// Highlight appropriate fields depending on the selected activity
				if (bankActivities.getSelectedItem().equals("Deposit")) {
					accountNumber.setForeground(Color.red);
					enterAmount.setForeground(Color.red);
				} else if (bankActivities.getSelectedItem().equals("Withdrawal")) {
					accountNumber.setForeground(Color.red);
					enterAmount.setForeground(Color.red);
				} else if (bankActivities.getSelectedItem().equals("Check balance")) {
					accountNumber.setForeground(Color.red);
				} else if (bankActivities.getSelectedItem().equals("Add account")) {
					firstName.setForeground(Color.red);
					lastName.setForeground(Color.red);
					beginningBalance.setForeground(Color.red);
				} else if (bankActivities.getSelectedItem().equals("Remove account")) {
					accountNumber.setForeground(Color.red);
				}
			}
		});
		// Populate the ComboBox with options
		bankActivities.setModel(new DefaultComboBoxModel(new String[] {"Select an action", "Deposit", "Withdrawal", "Check balance", "Add account", "Remove account"}));
		bankActivities.setBounds(10, 11, 414, 32);  // Position and size
		frame.getContentPane().add(bankActivities);

		// Button to process transactions based on the selected action
		JButton transaction = new JButton("Process Transaction");
		transaction.addActionListener(new ActionListener() {
			// Perform the selected transaction when the button is clicked
			public void actionPerformed(ActionEvent e) {
				String amount, message;
				
				// Handle Deposit action
				if (bankActivities.getSelectedItem().equals("Deposit")) {
					amount = enterAmount.getText();
					message = easySave.transaction(1, accountNumber.getText(), Double.parseDouble(amount));
					display.setText(message);
				}
				// Handle Withdrawal action
				else if (bankActivities.getSelectedItem().equals("Withdrawal")) {
					amount = enterAmount.getText();
					message = easySave.transaction(2, accountNumber.getText(), Double.parseDouble(amount));
					display.setText(message);
				}
				// Handle Check Balance action
				else if (bankActivities.getSelectedItem().equals("Check balance")) {
					message = easySave.checkBalance(accountNumber.getText());
					display.setText(message);
				}
				// Handle Add Account action
				else if (bankActivities.getSelectedItem().equals("Add account")) {
					amount = beginningBalance.getText();
					message = easySave.addAccount(firstName.getText(), lastName.getText(), Double.parseDouble(amount));
					display.setText("New account ID is: " + message);
				}
				// Handle Remove Account action
				else if (bankActivities.getSelectedItem().equals("Remove account")) {
					message = easySave.deleteAccount(accountNumber.getText());
					display.setText(message);
				}
			}
		});
		transaction.setBounds(124, 309, 200, 72);  // Position and size
		frame.getContentPane().add(transaction);

		// Set focus traversal for the components (defines the order in which components are focused when the user presses the tab key)
		frame.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{accountNumber, frame.getContentPane(), enterAmount, firstName, lastName, beginningBalance, display, transaction}));
	}
}
