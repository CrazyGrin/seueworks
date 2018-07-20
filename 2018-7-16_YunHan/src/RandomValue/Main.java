package RandomValue;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	public int random(){
		return (int) Math.floor(Math.random()*100);
	}
	
	public void initNumbers(int count){
		while(count>=0){
			this.numbers.add(new Integer(this.random()));
			count--;
		}
		Collections.sort(this.numbers);
		System.out.println(this.numbers);
	}
        
	public static void main(String args[]){
		Main main = new Main();
		main.initNumbers(10);
	}

}
