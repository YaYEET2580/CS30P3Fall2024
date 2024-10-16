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
		
		ImageIcon plates = new ImageIcon("../Chapter10/src/Images/BreakAPlate_Images/plates.gif");
		ImageIcon platesAllBroken = new ImageIcon("../Chapter10/src/Images/BreakAPlate_Images/plates_all_broken.gif");
		ImageIcon platesTwoBroken = new ImageIcon("../Chapter10/src/Images/BreakAPlate_Images/plates_two_broken.gif");
		ImageIcon sticker = new ImageIcon("../Chapter10/src/Images/BreakAPlate_Images/sticker.gif");
		ImageIcon tigerPlush = new ImageIcon("../Chapter10/src/Images/BreakAPlate_Images/tiger_plush.gif");
		ImageIcon placeholder = new ImageIcon("../Chapter10/src/Images/BreakAPlate_Images/placeholder.gif");
		
		
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
		display.setBounds(184, 245, 201, 110);
		panel.add(display);
		
		JButton play = new JButton("PLAY");
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String eventName = e.getActionCommand();
				
				if (eventName == "PLAY") {
					int highNum = 3;
					int lowNum = 0;
					int randomint;
					Random rand = new Random();
					
					randomint = rand.nextInt(highNum - lowNum + 1) + lowNum;
					if (randomint == 3) {
						plate.setIcon(platesAllBroken);
						display.setIcon(tigerPlush);
					}
					else {
						plate.setIcon(platesTwoBroken);
						display.setIcon(sticker);
					}
					play.setText("Play Again");
					play.setActionCommand("Play Again");
				}
				else if (eventName == "Play Again") {
					plate.setIcon(plates);
					display.setIcon(placeholder);
					play.setText("PLAY");
					play.setActionCommand("PLAY");
				}
		
			}
		
		});
		play.setFont(new Font("Tahoma", Font.PLAIN, 15));
		play.setBounds(220, 184, 124, 45);
		panel.add(play);
	}
}
