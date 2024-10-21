/*

Program: MetricConversion.java          Last Date of this Revision: October 21, 2024

Purpose: An application that allows the user to select a type of conversion from a combo box
and then the corresponding formula is displayed in a label. 

Author: Sakibul Majid
School: CHHS
Course: Computer Programming 30
 

*/

package Mastery;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class MetricConversion {

	// GUI component for the main window frame
	private JFrame frame;

	/**
	 * Launch the application.
	 * This is the main method that uses EventQueue to ensure the GUI runs on the event-dispatching thread.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// Create an instance of the MetricConversion class and make the frame visible
					MetricConversion window = new MetricConversion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					// Print any exceptions that occur during initialization
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * Constructor for the MetricConversion class that calls initialize() to set up the GUI components.
	 */
	public MetricConversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * Sets up the layout and components of the frame.
	 */
	@SuppressWarnings("all")
	private void initialize() {
		// Create the main window frame and set its size and position
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 137);  // Position and dimensions of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Exit the application when the window is closed
		frame.getContentPane().setLayout(null);  // Disable layout managers for manual component positioning

		// Label prompting the user to select a conversion type
		JLabel lblNewLabel = new JLabel("Select a conversion type:");
		lblNewLabel.setBounds(10, 11, 134, 19);  // Position and size of the label
		frame.getContentPane().add(lblNewLabel);

		// Label for displaying the conversion result
		JLabel display = new JLabel("");
		display.setBounds(10, 73, 264, 14);  // Position and size of the display label
		frame.getContentPane().add(display);

		// ComboBox for selecting the type of conversion
		JComboBox conversionType = new JComboBox();
		// Set the options for the ComboBox with different metric conversions
		conversionType.setModel(new DefaultComboBoxModel(new String[] {
			"inches to centimeters (in to cm)", 
			"feet to meters (ft to m)", 
			"gallons to liters (gal to L)", 
			"pounds to kilograms (lbs to kg)"
		}));
		// Action listener that responds to user selection from the ComboBox
		conversionType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Get the selected conversion type
				String metricConversion = (String) conversionType.getSelectedItem();
				
				// Update the display label based on the selected conversion type
				if (metricConversion == "inches to centimeters (in to cm)") {
					display.setText("1 inch = 2.54 centimeters");
				} else if (metricConversion == "feet to meters (ft to m)") {
					display.setText("1 foot = 0.3048 meters");
				} else if (metricConversion == "gallons to liters (gal to L)") {
					display.setText("1 gallon = 4.5461 liters");
				} else if (metricConversion == "pounds to kilograms (lbs to kg)") {
					display.setText("1 pound = 0.4536 kilograms");
				}
			}
		});
		// Position and size of the ComboBox
		conversionType.setBounds(10, 29, 264, 22);
		frame.getContentPane().add(conversionType);
	}
}
