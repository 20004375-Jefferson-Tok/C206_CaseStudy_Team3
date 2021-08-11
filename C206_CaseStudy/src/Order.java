

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * MUHAMMAD KHAIRUL 20008161, 11 Aug 2021 3:46:05 pm
 */

public class Order {

	private String id;
	private String date;
	private String food;
	private String drink;
	private String fruit;
	
	public Order(String id, String date, String food, String drink, String fruit) {
		this.id = id;
		this.date = date;
		this.food = food;
		this.drink = drink;
		this.fruit = fruit;
	}

	public String getId() {
		return id;
	}

	public String getDate() {
		return date;
	}

	public String getFood() {
		return food;
	}

	public String getDrink() {
		return drink;
	}

	public String getFruit() {
		return fruit;
	}
	
}
