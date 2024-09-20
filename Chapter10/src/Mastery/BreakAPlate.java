package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BreakAPlate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
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
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String firstPrize = "tiger plush";
		String secondPrize = "sticker";
		GameBooth breakAPlate;
		
		ImageIcon plates = new ImageIcon("C:\\Users\\37168004\\git\\CS30P3Fall2024\\Chapter10\\src\\Images\\BreakAPlate%20Images\\plates.gif");
		
		breakAPlate = new GameBooth(0, firstPrize, secondPrize);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 624, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 588, 366);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel plate = new JLabel("");
		plate.setBounds(128, 46, 310, 110);
		plate.setIcon(plates);
		panel.add(plate);
		
		JLabel display = new JLabel("");
		display.setBounds(184, 245, 201, 110);
		panel.add(display);
		
		JButton play = new JButton("PLAY");
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String eName = e.getActionCommand();
				String prize;
				
				
				
				
			}
		});
		play.setFont(new Font("Tahoma", Font.PLAIN, 15));
		play.setBounds(220, 184, 124, 45);
		panel.add(play);
	}
}
