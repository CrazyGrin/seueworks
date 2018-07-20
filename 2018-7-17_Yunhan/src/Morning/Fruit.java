package Morning;

public class Fruit {

	private int fruitheat = 0;
	private String fruitName = null;
	
	public Fruit(int fruitheat,String fruitName){
		this.fruitheat = fruitheat;
		this.fruitName = fruitName;
	}
	
	public int getFruitheat() {
		return fruitheat;
	}

	public void setFruitheat(int fruitheat) {
		this.fruitheat = fruitheat;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	@Override
	public String toString() {
		return "Fruit [fruitheat=" + fruitheat + ", fruitName=" + fruitName + "]";
	}

}