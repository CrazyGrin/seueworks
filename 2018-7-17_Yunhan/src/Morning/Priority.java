package Morning;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority {
	
	private Comparator<Fruit> fruitCom = new Comparator<Fruit>(){
		@Override
		public int compare(Fruit f1, Fruit f2) {
			return f1.getFruitheat() - f2.getFruitheat();
		}
	};
	
	private PriorityQueue<Fruit> queue = new PriorityQueue<Fruit>(fruitCom);
	
	public void initQueue(){
		queue.add(new Fruit(1,"banana"));
		queue.add(new Fruit(5,"apple"));
		queue.add(new Fruit(4,"pear"));
		queue.add(new Fruit(2,"grape"));
	}
	
	public static void main(String args[]){
		Priority p = new Priority();
		p.initQueue();
		System.out.println(p.queue.toString());
	}
	
}
