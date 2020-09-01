package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		
		switch(choice) {
		case "Sunday": 
			System.out.println("oof school tomarrow");
			break;
		case "Monday": 
			System.out.println("Oof.......... 4 days to go....");
			break;
		case "Tuesday": 
			System.out.println("Now ur tired and u have 3 days left");
			break;
		case "Wednesday": 
			System.out.println("HUMP DAY!?!?!?");
			break;
		case "Thursday": 
			System.out.println("so close...");
			break;
		case "Friday": 
			System.out.println("2 days of freedom..(with some homework tho)");
			break;
		case "Saturday":
			System.out.println("1 day still free");
		default: 
			System.out.println("Something went wrong :(");
			break;
		}
		
	}
}
