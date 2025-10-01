package HackerRank;

import java.util.Scanner;

/*
 * Easy solve
 */
public class JavaDataTypesHR {

	public static void main(String[] args) {
		
		System.out.println(Short.MAX_VALUE);

		Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)System.out.println("* short");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }

	}

}
