package Morning;

public class Item{
	
	private String itemId = null;
	
	public Item(){
		this.itemId = (int) Math.floor(Math.random()*100) + "";
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + "]";
	}

}
