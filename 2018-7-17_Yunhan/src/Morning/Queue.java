package Morning;

import java.util.LinkedList;

public class Queue {
	
	private LinkedList<Object> list = null;
	
	public Queue(){
		this.list = new LinkedList<Object>();
	}

	public LinkedList<Object> getList() {
		return list;
	}

	public void setList(LinkedList<Object> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Queue [list=" + list + "]";
	}
	
	public Queue put(Object o){
		this.list.addLast(o);
		return this;
	}
	
	public Queue get(){
		if(!this.isEmpty()){
			System.out.println(this.list.getFirst().toString());
			this.list.removeFirst();
			return this;
		}
		System.out.println("Queue is empty!");
		return this;
	}

	public boolean isEmpty(){
		return this.list.isEmpty() ? true : false;
	}

	public static void main(String args[]){

		Queue queue = new Queue();
		queue.put(new Item()).put(new Item()).put(new Item());
		queue.get().get().get().get();
	}
	
}