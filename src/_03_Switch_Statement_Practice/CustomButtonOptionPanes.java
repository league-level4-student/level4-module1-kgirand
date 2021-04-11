package _03_Switch_Statement_Practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		
		switch(input) {
		case 0:
			System.out.println("its sunday");
			break;
		case 1:
			System.out.println("its monday");
			break;
		case 2:
			System.out.println("its tuesday");
			break;
		case 3:
			System.out.println("its wednesday");
			break;
		case 4:
			System.out.println("its thursday");
			break;
		case 5:
			System.out.println("its friday");
			break;
		case 6: 
			System.out.println("its saturday");
			break;
		}
	}
}
