package CountE;

import java.util.Scanner;

public class Main {
	public Scanner scan = new Scanner(System.in);
	
	public Main(){
        if (scan.hasNext()) {
        	
        	int count = 0;
        	char a[] = scan.next().toCharArray();
        	
        	for(int i = 0;i<a.length;i++){
        		if (a[i] == 'e'){ 
        			count++;
        		}
        	}
        	System.out.println("The number of e is: " + count);
        }
        scan.close();
	}
	
	public static void main(String args[]){
		new Main();
	}
}
