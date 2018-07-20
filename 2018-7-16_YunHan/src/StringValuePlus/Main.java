package StringValuePlus;

import java.util.Scanner;

public class Main {
	
	public String str1;
	public String str2;
	
	public Scanner scan = new Scanner(System.in);
	
	public Main(){
        if (scan.hasNext()) {
            str1 = scan.next();
            str2 = scan.next();
            
            System.out.println("First string is: " + str1);
            System.out.println("Second string is: " + str2);
            
            System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));
        }
        scan.close();
	}
	
	public static void main(String args[]){
		new Main();
	}
}
