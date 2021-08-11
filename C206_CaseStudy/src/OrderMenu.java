
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * MUHAMMAD KHAIRUL 20008161, 11 Aug 2021 2:52:49 pm
 */

public class OrderMenu {

	ArrayList<Order> orderList = new ArrayList<Order>();

	private static final String ID_PATTERN = "[O][0-9]{2}";
	private static final String date_pattern = "^(([0-9])|([0-2][0-9])|([3][0-1]))\\-(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)\\-\\d{4}$";

	public static void main(String[] args) {
		OrderMenu order = new OrderMenu();
		order.start();
	}

	private void start() {
		int option = -1;

		while (option != 4) {
			menu();
			option = Helper.readInt("Enter choice > ");

			if (option == 1) {

				addOrder();

			} else if (option == 2) {

				viewOrder();

			} else if (option == 3) {

				deleteOrder();

			} else if (option == 4) {

				System.out.println("Thank you for placing your order!");

			} else {

				System.out.println("Invalid option!");

			}
		}
	}

	private void menu() {
		Helper.line(60, "=");
		System.out.println("ORDER");
		Helper.line(60, "=");
		System.out.println("1. Add/Place Lunch Box Order");
		System.out.println("2. View Lunch Box Order");
		System.out.println("3. Delete/Cancel Lunch Box Order");
		System.out.println("4. Exit\n");
	}

	private void addOrder() {
		Helper.line(60, "-");
		int a = orderList.size();
		String id = "O0" + Integer.toString(a);
		System.out.println("ID: " + id);
		String date = Helper.readString("Enter Date (dd-MMM-yyyy) > ");
		String food = Helper.readString("Enter food > ");
		String drink = Helper.readString("Enter drink > ");
		String fruit = Helper.readString("Enter fruit > ");

		boolean isValid = Pattern.matches(date_pattern, (CharSequence) date);
		if (isValid) {
			if (food.isEmpty() || drink.isEmpty() || fruit.isEmpty()) {
				System.out.println("Incomplete Order!");
			} else {
				String cfm = Helper.readString("Add Order? (Y/N) > ");

				if (cfm.equalsIgnoreCase("y")) {
					orderList.add(new Order(id, date, food, drink, fruit));
					System.out.println("Order added sucessfully!");

				} else {
					System.out.println("Order not added");
				}
			}
		} else {
			System.out.println("Invalid Date Format");
		}

	}

	private void viewOrder() {
		Helper.line(60, "-");

		String id = Helper.readString("Enter Order ID > ");
		boolean isValid = Pattern.matches(ID_PATTERN, id);
		if (isValid) {
			int count = 0;
			for (Order o : orderList) {
				if (o.getId().equals(id)) {
					System.out.println(String.format("Order ID: %s\nDate: %s\nFood: %s\nDrink: %s\nFruit: %s",
							o.getId(), o.getDate(), o.getFood(), o.getDrink(), o.getFruit()));
					count += 1;
				}
			}

			if (count == 0) {
				System.out.println("Order ID not in list");
			}
		} else {
			System.out.println("Invalid Order ID entered");
		}
	}

	private void deleteOrder() {
		Helper.line(60, "-");
		String id = Helper.readString("Enter Order ID > ");
		boolean isValid = Pattern.matches(ID_PATTERN, id);
		if(isValid) {
			int count = 0;
			for (Order o : orderList) {
				if (o.getId().equals(id)) {
					System.out.println(String.format("Order ID: %s\nDate: %s\nFood: %s\nDrink: %s\nFruit: %s",
							o.getId(), o.getDate(), o.getFood(), o.getDrink(), o.getFruit()));
					count += 1;
					String cfm = Helper.readString("Delete Order? (Y/N) > ");

					if (cfm.equalsIgnoreCase("y")) {
						orderList.remove(o);
						System.out.println("Order deleted sucessfully!");

					} else {
						System.out.println("Order not deleted");
					}
					
				}
			}

			if (count == 0) {
				System.out.println("Order ID not in list");
			}
		} else {
			System.out.println("Invalid Order ID entered");
		
		}
	}

}
