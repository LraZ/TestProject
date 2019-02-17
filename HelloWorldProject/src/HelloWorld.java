import Entities.Calender;

import java.io.IOException;
import java.net.*;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calender today = new Calender(4,2,2020);
		String text = "";
		
		if(checkLeapyear(today.getYear())) {
			text = "This is a Leapyear!";
		}
		
		System.out.println("Heute ist der " + today.toString() + " \n"+ text);
		
		try {
			URL myUrl = new URL("http://www.google.at");
			URLConnection myURLConnection = myUrl.openConnection();
			myURLConnection.connect();
			System.out.println(myURLConnection.getContentLength());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static boolean checkLeapyear(int y) {
		if(y%4==0 && (y%100!=0||y%400==0)) {
			return true;
		}
		return false;
	}

}
