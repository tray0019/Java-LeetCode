package HackerRank;

import java.util.Scanner;

/*
 * good to learn
 */
public class JavaEOF_HR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        
        int line = 1;
        String read;
        
        while(sc.hasNextLine()){
        	read = sc.nextLine();
            System.out.println(line+" "+read);
            line++;
            
           
        }
        

	}

}
