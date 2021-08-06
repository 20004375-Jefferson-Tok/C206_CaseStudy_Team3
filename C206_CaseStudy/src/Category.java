
public class Category {
	private String catId;
	private String catName;
	
	
	public Category (String catId, String catName) {
		this.catId = catId;
		this.catName = catName;
	}
	
	public String toString() {
		return String.format("%-10s %-30s",  getCatId(), getCatName());
	}
	
	public String getCatId() {
		return catId;
	}
	
	public String getCatName() {
		return catName;
	}
	
	public void setCatName(String catName) {
		this.catName = catName;
		
	}
	
}
