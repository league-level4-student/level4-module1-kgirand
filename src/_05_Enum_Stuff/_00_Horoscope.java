package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	enum Zodiac {
ARIES, TAURUS, GEMINI, CANCER, LEO, VIRGO, 
	LIBRA, SCORPIO, SAGITTARIUS, CAPRICORN, AQUARIUS, PISCES
}
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void main(String[] args) {	
		Zodiac zod = Zodiac.GEMINI;
switch(zod){
case ARIES:{
		JOptionPane.showMessageDialog(null, "Your zodiac is aries");
		break;
	}
	case TAURUS:{
		JOptionPane.showMessageDialog(null, "Your zodiac is taurus");
		break;
	}
	case GEMINI:{
		JOptionPane.showMessageDialog(null, "Your zodiac is gemini");
		//break;
	}
	case CANCER:{
		JOptionPane.showMessageDialog(null, "Your zodiac is cancer");
		break;
	}
	case LEO:{
		JOptionPane.showMessageDialog(null, "Your zodiac is leo");
		break;
	}
	case VIRGO:{
		JOptionPane.showMessageDialog(null, "Your zodiac is virgo");
		break;
	}
	case LIBRA:{
		JOptionPane.showMessageDialog(null, "Your zodiac is libro");
		break;
	}
	case SAGITTARIUS:{
		JOptionPane.showMessageDialog(null, "Your zodiac is sagittarius");
		break;
	}
	case CAPRICORN:{
		JOptionPane.showMessageDialog(null, "Your zodiac is capricorn");
		break;
	}
	case AQUARIUS:{
		JOptionPane.showMessageDialog(null, "Your zodiac is aquarius");
		break;
	}
	case PISCES:{
		JOptionPane.showMessageDialog(null, "Your zodiac is pisces");
		break;
	}
	default:{
		JOptionPane.showMessageDialog(null, "error");
		break;
	}
	
//		enum Month {
//			JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER,OCTOBER, NOVEMBER,DECEMBER
//		}
//		String s = JOptionPane.showInputDialog("What is the number of your birth month? Ex. Jan = 1");
//		int input = Integer.parseInt(s)-1;
//		Month mon = Month.JANUARY;
//		switch(mon){	
//	
	}
	}
	// 3. Make a main method to test your method
}
