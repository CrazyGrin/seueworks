package Morning;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	
	private ArrayList<Integer> list = null;
	
	public IteratorDemo(){
		this.list = new ArrayList<Integer>();
	}
	
	public ArrayList<Integer> getList() {
		return list;
	}

	public void setList(ArrayList<Integer> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "IteratorDemo [list=" + list + "]";
	}
	
	public IteratorDemo initList(int count){
		while(count>0){
			this.list.add(new Integer((int)Math.floor(Math.random()*10)));
			count--;
		}
		return this;
	}
	
	public void IteratorTest(){
		Iterator<Integer> i = this.list.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
	
	public static void main(String args[]){

		IteratorDemo idemo = new IteratorDemo();
		idemo.initList(10);
		idemo.IteratorTest();
	}
	
}
