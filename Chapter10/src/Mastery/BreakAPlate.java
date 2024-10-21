/*

Program: BreakAPlate.java          Last Date of this Revision: October 21, 2024

Purpose:  An application that displays three unbroken plates at the start.
Clicking Play plays the game, displays broken plates, and displays the prize
won. If all three plates are broken, a tiger plush first prize is awarded. If
less than three plates are broken, a sticker consolation prize is awarded.
At the end of a game the Play button changes to Play Again. Clicking Play
Again displays a set of unbroken plates and the button changes back to Play
allowing the user to play repeatedly. The application ends when the user
closes the window.


Author: Sakibul Majid 
School: CHHS
Course: Computer Programming 30
 

*/

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

    // JFrame to contain all components
	private JFrame frame;

	/**
	 * Launch the application.
	 * The main method runs the GUI application using EventQueue to ensure thread safety.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();  // Create a new instance of the BreakAPlate class
					window.frame.setVisible(true);  // Set the frame to be visible
				} catch (Exception e) {
					e.printStackTrace();  // Catch and print any exceptions during initialization
				}
			}
		});
	}

	/**
	 * Create the application.
	 * Constructor for BreakAPlate, calls initialize() to set up the frame.
	 */
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * Set up all components (labels, buttons, and images) inside the JFrame.
	 */
	private void initialize() {
		
		// Load images for the game
		ImageIcon plates = new ImageIcon("../Chapter10/src/Images/BreakAPlate_Images/plates.gif");
		ImageIcon platesAllBroken = new ImageIcon("../Chapter10/src/Images/BreakAPlate_Images/plates_all_broken.gif");
		ImageIcon platesTwoBroken = new ImageIcon("../Chapter10/src/Images/BreakAPlate_Images/plates_two_broken.gif");
		ImageIcon sticker = new ImageIcon("../Chapter10/src/Images/BreakAPlate_Images/sticker.gif");
		ImageIcon tigerPlush = new ImageIcon("../Chapter10/src/Images/BreakAPlate_Images/tiger_plush.gif");
		ImageIcon placeholder = new ImageIcon("../Chapter10/src/Images/BreakAPlate_Images/placeholder.gif");
		
		// Create the main frame and set its properties
		frame = new JFrame();
		frame.setBounds(100, 100, 624, 427);  // Set the size and position of the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close the application when the window is closed
		frame.getContentPane().setLayout(null);  // Disable layout managers for manual positioning
		
		// Create a panel to hold all the components
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 588, 366);  // Position and size of the panel
		frame.getContentPane().add(panel);
		panel.setLayout(null);  // Manual layout
		
		// JLabel to display the plate image
		JLabel plate = new JLabel("");
		plate.setBounds(128, 46, 310, 110);  // Position and size of the plate image
		plate.setIcon(new ImageIcon("C:\\Users\\37168004\\git\\CS30P3Fall2024\\Chapter10\\src\\Images\\BreakAPlate_Images\\plates.gif"));  // Set the initial plate image
		panel.add(plate);
		
		// JLabel to display either the sticker or plush tiger reward
		JLabel display = new JLabel("");
		display.setBounds(184, 245, 201, 110);  // Position and size of the reward image
		panel.add(display);
		
		// JButton to play the game
		JButton play = new JButton("PLAY");
		play.addActionListener(new ActionListener() {
			// Action to perform when the "PLAY" button is clicked
			public void actionPerformed(ActionEvent e) {
				
				String eventName = e.getActionCommand();  // Get the command associated with the button click
				
				if (eventName == "PLAY") {
					// Generate a random number between 0 and 3 to determine the outcome
					int highNum = 3;
					int lowNum = 0;
					int randomint;
					Random rand = new Random();
					
					randomint = rand.nextInt(highNum - lowNum + 1) + lowNum;
					
					// If random number is 3, all plates break and tiger plush is displayed
					if (randomint == 3) {
						plate.setIcon(platesAllBroken);  // Set the plate image to show all plates broken
						display.setIcon(tigerPlush);  // Show the tiger plush as the prize
					}
					// If random number is less than 3, only two plates break and sticker is displayed
					else {
						plate.setIcon(platesTwoBroken);  // Set the plate image to show two broken plates
						display.setIcon(sticker);  // Show the sticker as the prize
					}
					// Update button text and action command for replay
					play.setText("Play Again");
					play.setActionCommand("Play Again");
				}
				// Reset the game if "Play Again" is clicked
				else if (eventName == "Play Again") {
					plate.setIcon(plates);  // Reset the plate image to show all plates intact
					display.setIcon(placeholder);  // Reset the reward display
					play.setText("PLAY");  // Update the button text
					play.setActionCommand("PLAY");  // Set action command back to "PLAY"
				}
		
			}
		});
		play.setFont(new Font("Tahoma", Font.PLAIN, 15));  // Set the font for the button text
		play.setBounds(220, 184, 124, 45);  // Position and size of the button
		panel.add(play);  // Add the button to the panel
	}
}
