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
import java.util.*;

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

		
			

	

	
		
		
		ImageIcon plates = new ImageIcon("C:\\Users\\37168004\\git\\CS30P3Fall2024\\Chapter10\\src\\Images\\BreakAPlate_Images\\plates.gif");
		ImageIcon platesAllBroken = new ImageIcon("..\\Chapter10\\src\\Images\\BreakAPlate_Images\\plates_all_broken.gif");
		ImageIcon platesTwoBroken = new ImageIcon("C:\\Users\\37168004\\git\\CS30P3Fall2024\\Chapter10\\src\\Images\\BreakAPlate_Images\\plates_two_broken.gif");
		ImageIcon sticker = GameBooth().consolationPrize;
		ImageIcon tigerPlush = GameBooth().firstPrize;
		
		
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
		plate.setIcon(new ImageIcon("C:\\Users\\37168004\\git\\CS30P3Fall2024\\Chapter10\\src\\Images\\BreakAPlate_Images\\plates.gif"));
		panel.add(plate);
		
		JLabel display = new JLabel("");
		display.setIcon(null);
		display.setBounds(184, 245, 201, 110);
		panel.add(display);
		
		JButton play = new JButton("PLAY");
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cost;
				ImageIcon firstPrize;
				ImageIcon consolationPrize;
				
				public  GameBooth(double charge) {
					 cost = charge;
					 firstPrize = new ImageIcon("C:\\Users\\37168004\\git\\CS30P3Fall2024\\Chapter10\\src\\Images\\BreakAPlate%20Images\\sticker.gif");
					 consolationPrize = new ImageIcon("C:\\Users\\37168004\\git\\CS30P3Fall2024\\Chapter10\\src\\Images\\BreakAPlate%20Images\\tiger_plush.gif");
				}
				

				public ImageIcon start() {
					int toss;
					int successes = 0;
					Random rand = new Random();

					
					for (int i = 0; i < 3; i++) { 
						toss = rand.nextInt(2);
					if (toss == 1) {
						successes += 1; 
					}
				}

					
					if (successes == 3) {
						return(firstPrize);
					} 
					else {
						return(consolationPrize);
					}
				}
				
				public double getCost() {
					return cost;
				}
				
				String eventName = e.getActionCommand();
				ImageIcon prize = null;
				
				if (eventName == "PLAY") {
					prize = GameBooth.start();
					if (prize.equals(firstPrize)) {
						plate.setIcon(platesAllBroken);
					}
					else if (prize.equals(secondPrize)) {
						plate.setIcon(platesTwoBroken);
					}
					display.setIcon(prize);
					play.setText("Play Again");
					play.setActionCommand("Play Again");
				}
				else if (eventName == "Play Again") {
					plate.setIcon(plates);
					display.setIcon(null);
					play.setText("PLAY");
					play.setActionCommand("PLAY");
				}
		
			}
		}
		});
		play.setFont(new Font("Tahoma", Font.PLAIN, 15));
		play.setBounds(220, 184, 124, 45);
		panel.add(play);
	}
}
