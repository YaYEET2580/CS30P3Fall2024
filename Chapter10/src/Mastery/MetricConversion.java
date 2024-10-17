package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class MetricConversion {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("all")
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 137);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select a conversion type:");
		lblNewLabel.setBounds(10, 11, 134, 19);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel display = new JLabel("");
		display.setBounds(10, 73, 264, 14);
		frame.getContentPane().add(display);
		
		
		JComboBox conversionType = new JComboBox();
		conversionType.setModel(new DefaultComboBoxModel(new String[] {"inches to centimeters (in to cm)", "feet to meters (ft to m)", "gallons to liters (gal to L)", "pounds to kilograms (lbs to kg)"}));
		conversionType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String metricConversion = (String)conversionType.getSelectedItem();
				
				if  (metricConversion == "inches to centimeters (in to cm)") {
					display.setText("1 inch = 2.54 centimeters");
				}
				else if (metricConversion == "feet to meters (ft to m)") {
					display.setText("1 foot = 0.3048 meters");
				}
				else if (metricConversion == "gallons to liters (gal to L)") {
					display.setText("1 gallon = 4.5461 liters");
				}
				else if (metricConversion == "pounds to kilograms (lbs to kg)") {
					display.setText("1 pound = 0.4536 kilograms");
			}
				
			}
		});
		conversionType.setBounds(10, 29, 264, 22);
		frame.getContentPane().add(conversionType);
	}
}
