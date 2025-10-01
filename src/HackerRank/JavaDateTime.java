package HackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class JavaDateTime {
	
    
	public static String findDay(int month, int day, int year) {
        
        LocalDate ld = LocalDate.of(year, day, month);
        
        return ld.getDayOfWeek().toString();
        
        
        
        
}

		public static void main(String[] args) {
			JavaDateTime.findDay(8,05,2015);
			
//			/System.out.println(JavaDateTime.findDay(8,05,2015));

	}

}
