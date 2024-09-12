package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class LatinPlantNames {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LatinPlantNames window = new LatinPlantNames();
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
	public LatinPlantNames() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 220, 160);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select a plant name:");
		lblNewLabel.setBounds(51, 11, 126, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel latinName = new JLabel("");
		latinName.setBounds(80, 69, 46, 14);
		frame.getContentPane().add(latinName);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"basil", "lavender", "parsley", "peppermint", "saffron", "sage"}));
		comboBox.setToolTipText("basil, lavender, parsley, peppermint, saffron, sage");
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String plantName = (String)comboBox.getSelectedItem();
				
				if (plantName == "basil") {
					latinName.setText("Ocimum");
				}
				else if (plantName == "lavender") {
					
				}
				else if (plantName == "parsley") {
					
				}
				else if (plantName == "peppermint") {
					
				}
				else if (plantName == "lavender") {
	
				}
			}
		});
		comboBox.setBounds(51, 36, 103, 22);
		frame.getContentPane().add(comboBox);
		
		
	}
}
