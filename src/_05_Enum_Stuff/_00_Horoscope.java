package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	
	// 3. Make a main method to test your method
	
	public static void main(String[] args) {
		
		printHoroscope(Zodiac.VIRGO);
		
	}
	
	public static void printHoroscope(Zodiac sign) {
		
	switch(sign) {
		case ARIES:{
			System.out.println("INT");
			break;
		}
		case TAURUS:{
			System.out.println("DOUBLE");
			break;
		}
		case GEMINI:{
			System.out.println("BOOLEAN");
			break;
		}
		case CANCER:{
			System.out.println("LONG");
			break;
		}
		case LEO:{
			System.out.println("SHORT");
			break;
		}
		case VIRGO:{
			System.out.println("BYTE");
			break;
		}
		case LIBRA:{
			System.out.println("INT");
			break;
		}
		case SCORPIO:{
			System.out.println("DOUBLE");
			break;
		}
		case SAGITTARIUS:{
			System.out.println("BOOLEAN");
			break;
		}
		case CAPRICORN:{
			System.out.println("LONG");
			break;
		}
		case AQUARIUS:{
			System.out.println("SHORT");
			break;
		}
		case PISCES:{
			System.out.println("BYTE");
			break;
		}
	}
	
	}
	
}
