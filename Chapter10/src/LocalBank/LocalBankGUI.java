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

public class LocalBankGUI {

	private JFrame frame;
	private JTextField accountNumber;
	private JTextField enterAmount;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField beginningBalance;
	
	Bank easySave = new Bank();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LocalBankGUI window = new LocalBankGUI();
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
	public LocalBankGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 515);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		accountNumber = new JTextField();
		accountNumber.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				accountNumber.setText(null);
			}
		});
		accountNumber.setForeground(Color.LIGHT_GRAY);
		accountNumber.setText("Account Number");
		accountNumber.setBounds(10, 54, 414, 20);
		frame.getContentPane().add(accountNumber);
		accountNumber.setColumns(10);
		
		enterAmount = new JTextField();
		enterAmount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				enterAmount.setText(null);
			}
		});
		enterAmount.setText("Enter Amount");
		enterAmount.setForeground(Color.LIGHT_GRAY);
		enterAmount.setColumns(10);
		enterAmount.setBounds(10, 85, 414, 20);
		frame.getContentPane().add(enterAmount);
		
		firstName = new JTextField();
		firstName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				firstName.setText(null);
			}
		});
		firstName.setText("First Name");
		firstName.setForeground(Color.LIGHT_GRAY);
		firstName.setColumns(10);
		firstName.setBounds(10, 116, 414, 20);
		frame.getContentPane().add(firstName);
		
		lastName = new JTextField();
		lastName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lastName.setText(null);
			}
		});
		lastName.setText("Last Name");
		lastName.setForeground(Color.LIGHT_GRAY);
		lastName.setColumns(10);
		lastName.setBounds(10, 147, 414, 20);
		frame.getContentPane().add(lastName);
		
		beginningBalance = new JTextField();
		beginningBalance.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				beginningBalance.setText(null);
			}
		});
		beginningBalance.setText("Beginning Balance");
		beginningBalance.setForeground(Color.LIGHT_GRAY);
		beginningBalance.setColumns(10);
		beginningBalance.setBounds(10, 178, 414, 20);
		frame.getContentPane().add(beginningBalance);
		
		JLabel display = new JLabel("Account Info goes here");
		display.setBounds(10, 209, 414, 89);
		frame.getContentPane().add(display);
		
	
		
		JComboBox bankActivities = new JComboBox();
		bankActivities.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (bankActivities.getSelectedItem().equals("Deposit")) {
					accountNumber.setForeground(Color.red);
					enterAmount.setForeground(Color.red);
				}
				else if (bankActivities.getSelectedItem().equals("Withdrawal")) {
					
					accountNumber.setForeground(Color.red);
					enterAmount.setForeground(Color.red);
					
				}
				else if (bankActivities.getSelectedItem().equals("Check balance")) {
					accountNumber.setForeground(Color.red);
				}
				
				else if (bankActivities.getSelectedItem().equals("Add account")) {
					
					firstName.setForeground(Color.red);
					lastName.setForeground(Color.red);
					beginningBalance.setForeground(Color.red);
					
				}
				else if (bankActivities.getSelectedItem().equals("Remove account")) {
					accountNumber.setForeground(Color.red);
				}
				
			}
		});
		bankActivities.setModel(new DefaultComboBoxModel(new String[] {"Select an action", "Deposit", "Withdrawal", "Check balance", "Add account", "Remove account"}));
		bankActivities.setBounds(10, 11, 414, 32);
		frame.getContentPane().add(bankActivities);
		
		JButton transaction = new JButton("Process Transaction");
		transaction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String amount, message;
				
				if (bankActivities.getSelectedItem().equals("Deposit")) {
					amount = enterAmount.getText();
					message = easySave.transaction(1, accountNumber.getText(), Double.parseDouble(amount));
					display.setText(message);
				}
				else if (bankActivities.getSelectedItem().equals("Withdrawal")) {
					amount = enterAmount.getText();
					message = easySave.transaction(2, accountNumber.getText(), Double.parseDouble(amount));
					display.setText(message);
				} 
				else if (bankActivities.getSelectedItem().equals("Check balance")) {
					message = easySave.checkBalance(accountNumber.getText());
					display.setText(message);
				}
				else if (bankActivities.getSelectedItem().equals("Add account")) {
					amount = beginningBalance.getText();
					message = easySave.addAccount(firstName.getText(), lastName.getText(), Double.parseDouble(amount));
					display.setText("New account ID is: " + message);
				}
				else if (bankActivities.getSelectedItem().equals("Remove account")) {
					message = easySave.deleteAccount(accountNumber.getText());
					display.setText(message);
				}
				
			}
		});
		transaction.setBounds(124, 309, 200, 72);
		frame.getContentPane().add(transaction);
		frame.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{accountNumber, frame.getContentPane(), enterAmount, firstName, lastName, beginningBalance, display, transaction}));
	}
}
