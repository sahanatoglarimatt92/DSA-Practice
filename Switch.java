package dsa;

import java.util.Random;

public class Switch {
	public static void main(String[] args) {
		int n = new Random().nextInt(1,9);
		System.out.println(n);
		String result;
		String day = null;

		switch(n) {
			case 1:
				day = "Montag";
				break;
			case 2:
				day = "Dienstag";
				break;
			case 3:
				day = "Mittwoch";
				break;
			case 4:
				day = "Donnerstag";
				break;
			case 5:
				day = "Freitag";
				break;
			case 6:
				day = "Samstag";	
				break;
			case 7:
				day = "Sonntag";	
				break;	
			default:
				System.out.println("Very good");
		}	

		/*
		  switch(n) {
		   	case 6,7 -> result = "6";
		   	case 1 -> result = "8";
		   	default -> result = "7";
		  }
		 */
		
		result = switch(n) {
			case 6,7 -> "6";
			case 1 -> "8";
			default -> "7";
		};
		
		result = switch(n) {
			case 6,7 : yield "6";
			case 1 : yield "8";
			default : yield "7";
	    };
	


		System.out.println("AM " + day + " wache ich auf um " + result + " Uhr");

	}
}
