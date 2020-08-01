package hacherrank;

import java.util.Date;

public class DatePrint {
	public static void main(String args[]) {
		String res = returnDate();
		System.out.println(res);
	}

	public static String returnDate() {
		Date d = new Date();
		// sa su mon tue wed thu fri
		String dateWithoutTime = d.toString().substring(0, 4);
		//System.out.println(dateWithoutTime);
		int len = dateWithoutTime.length();
		String res = "";
		char c = dateWithoutTime.charAt(0);
		char c2 = dateWithoutTime.charAt(1);
		if (c == 'S' && c2 == 'a') {
			res = "SATURDAY";
		} else if (c == 'S' && c2 == 'u') {
			res = "SUNDAY";
		} else if (c == 'M' && c2 == 'o') {
			res = "MONDAY";
		} else if (c == 'T' && c2 == 'u') {
			res = "TUEDAY";
		} else if (c == 'W' && c2 == 'e') {
			res = "WEDNESDAY";
		} else if (c == 'T' && c2 == 'h') {
			res = "THURSDAY";
		} else {
			res = "FRIDAY";
		}

		return res;

	}
}
