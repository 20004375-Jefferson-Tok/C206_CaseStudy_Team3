import java.util.ArrayList;




public class C206_CaseStudy {
	static ArrayList<Menu> MenuItemList = new ArrayList<Menu>();

	private static final int OPTION_QUIT = 5;
	
	public static void main(String[] args) {

		ArrayList<Category> categoryList = new ArrayList<Category>();
		
		categoryList.add(new Category("cat0010", "Western"));
		categoryList.add(new Category("cat0020", "Asian"));
		
		int option = 0;
		
		while (option != OPTION_QUIT) {
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");
			
			if (option == 1) {
				C206_CaseStudy.viewAllCategory(categoryList);
				
			} else if (option == 2) {
				
				// Add category
				Category cat = inputCategory();
				C206_CaseStudy.addCategory(categoryList, cat);
				
			} else if (option == OPTION_QUIT) {
				System.out.println("Bye");
				
			} else {
				System.out.println("Invalid option");
			}
		}
		
	}

	public static Category inputCategory() {
		String catId = Helper.readString("Enter Category Id > ");
		String catName = Helper.readString("Enter Category Name > ");
		
		Category cat= new Category(catId, catName);
		return cat;
		
	}
	
	public static void addCategory(ArrayList<Category> categoryList, Category cat1) {
		
		categoryList.add(cat1);
		System.out.println("Category added");
	}
	
	
	public static void menu() {
		C206_CaseStudy.setHeader("LUNCH BOX APP");
		System.out.println("1. Display Category");
		System.out.println("2. Add Category");
		System.out.println("3. Edit Category");
		System.out.println("4. Delete Category");
		System.out.println("5. Quit");
		Helper.line(80, "-");

	}
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

	public static String retrieveAllCategory(ArrayList<Category> categoryList) {
		String output = "";
		// write your code here
		for (int i = 0; i < categoryList.size(); i++) {

			output += String.format("%-10s %-30s\n", categoryList.get(i).getCatId(),
					categoryList.get(i).getCatName());
		}
		return output;
	}
	
	
	public static void viewAllCategory(ArrayList<Category> categoryList) {
		C206_CaseStudy.setHeader("CATEGORY LIST");
		String output = String.format("%-10s %-30s\n", "CAT ID", "NAME");
		 output += retrieveAllCategory(categoryList);	
		System.out.println(output);
	}

	// --------------------------------------------------------------------------------------------------------------------------------------

		// Add menu items into menu bank
		public static Menu inputMenuItems() {
			int itemID = Helper.readInt("Enter item ID > ");
			String menuItem = Helper.readString("Enter new item > ");

			Menu items = new Menu(itemID, menuItem);
			return items;

		}

		public static void addItems(ArrayList<Menu> MenuItemList, Menu items) {

			MenuItemList.add(items);
			System.out.println("item added");
			// Add menu items into menu bank
		}
	// --------------------------------------------------------------------------------------------------------------------------------------
		// Retrieve all items for viewing
		public static String retrieveAllItems(ArrayList<Menu> MenuItemList) {
			String output = "";

			for (int i = 0; i < MenuItemList.size(); i++) {
				output += String.format("%-10s %-5s\n", MenuItemList.get(i).getId(), MenuItemList.get(i).getItem());
			}
			return output;
		}

		public static void viewAllItems(ArrayList<Menu> MenuItemList) {
			Helper.line(80, "-");
			String output = String.format("%-10s %-5s\n", "ID", "DESCRIPTION");
			output += retrieveAllItems(MenuItemList);
			System.out.println(output);
			// Retrieve all items for viewing
		}
		
	// --------------------------------------------------------------------------------------------------------------------------------------
		// Remove items
		public static boolean RemoveItems(ArrayList<Menu> MenuItemList, int id) {
			boolean remove = false;
			for (int i = 0; i < MenuItemList.size(); i++) {
				if (MenuItemList.get(i).getId() == id) {
					MenuItemList.remove(i);
					remove = true;
				}
			}
			return remove;

		}

		public static String retrieveAllItemsforRemoval(ArrayList<Menu> MenuItemList, int itemID) {
			String output = "";

			for (int i = 0; i < MenuItemList.size(); i++) {
				if (itemID == MenuItemList.get(i).getId()) {
					output += String.format("%-10s %-5s\n", MenuItemList.get(i).getId(), MenuItemList.get(i).getItem());
				}
			}
			return output;

		}
		// Remove items
	// --------------------------------------------------------------------------------------------------------------------------------------


}
