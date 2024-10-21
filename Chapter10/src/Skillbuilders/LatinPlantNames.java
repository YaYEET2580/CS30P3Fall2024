package Skillbuilders;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

@SuppressWarnings("all")
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
		latinName.setBounds(51, 69, 103, 14);
		frame.getContentPane().add(latinName);
		
		JComboBox plants = new JComboBox();
		plants.setModel(new DefaultComboBoxModel(new String[] {"basil", "lavender", "parsley", "peppermint", "saffron", "sage"}));
		plants.setToolTipText("basil, lavender, parsley, peppermint, saffron, sage");
		plants.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String plantName = (String)plants.getSelectedItem();
				
				if (plantName == "basil") {
					latinName.setText("Ocimum");
				}
				else if (plantName == "lavender") {
					latinName.setText("Lavandula spica");
				}
				else if (plantName == "parsley") {
					latinName.setText("Apium");
				}
				else if (plantName == "peppermint") {
					latinName.setText("Mentha piperita");
				}
				else if (plantName == "saffron") {
					latinName.setText("Crocus");
				}
				else if (plantName == "sage") {
					latinName.setText("Salvia");
				}
			}
		});
		plants.setBounds(51, 36, 103, 22);
		frame.getContentPane().add(plants);
		
		
	}
}
