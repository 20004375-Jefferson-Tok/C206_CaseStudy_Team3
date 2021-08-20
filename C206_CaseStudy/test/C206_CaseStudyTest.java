import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Category cat1;
	private Category cat2;
	private Menu menu1;
	private Menu menu2;
	
	//private MenuItem menuItem1;
	//private MenuItem menuItem2;
	
	private ArrayList<Category> categoryList;
	static ArrayList<Menu> MenuItemList = new ArrayList<Menu>();
	
	//private ArrayList<MenuItem> menuItemList;
	
	@Before
	public void setUp() throws Exception {
		cat1 = new Category("cat0010", "Western");
		cat2 = new Category("cat0020", "Asian");
		
		/*menuItem1 = new MenuItem("1", "Spaghetti", "Wanton Mee", "Vegetarian Bee Hoon", 
				"Chrysanthemum Tea", "Orange Juice",
				"Watermelon Slice", "Apple Slice");
		
		menuItem2 = new MenuItem("2", "Burger", "Dumpling Soup", "Vegetarian Fried Rice", 
				"Apple Tea", "Watermelon Juice",
				"Honey Dew Slice", "Grapes");*/
		
		categoryList = new ArrayList<Category>();
		//menuItemList = new ArrayList<MenuItem>();
		menu1 = new Menu(1, "Chicken");
		menu2 = new Menu(2, "Veggies");
		
	}

	@Test
	public void addCategoryTest() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Category arraylist to add to", categoryList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		C206_CaseStudy.addCategory(categoryList, cat1);
		assertEquals("Check that Category arraylist size is 1", 1, categoryList.size());
		assertSame("Check that Category is added", cat1, categoryList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addCategory(categoryList, cat2);
		assertEquals("Check that Category arraylist size is 2", 2, categoryList.size());
		assertSame("Check that Category is added", cat2, categoryList.get(1));
	}
	
	//@Test
	//public void addMenuItemTest() {
		// Item list is not null, so that can add a new item - boundary
		//assertNotNull("Check if there is valid Menu Item arraylist to add to", menuItemList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		//C206_CaseStudy.addMenuItem(menuItemList, menuItem1);
		//assertEquals("Check that Menu Item arraylist size is 1", 1, menuItemList.size());
		//assertSame("Check that Menu Item is added", menuItem1, menuItemList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		//C206_CaseStudy.addMenuItem(menuItemList, menuItem2);
		//assertEquals("Check that Menu Item arraylist size is 2", 2, menuItemList.size());
		//assertSame("Check that menuItemList is added", menuItem2, menuItemList.get(1));
	//}
	
	@Test
	public void retrieveAllCategoryTest() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Category arraylist to retrieve item", categoryList);
		
		//test if the list of category retrieved from the C206_CaseStudy is empty - boundary
		String allCategory = C206_CaseStudy.retrieveAllCategory(categoryList);
		String testOutput = "";
		assertEquals("Check that ViewAllCategorylist", testOutput, allCategory);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addCategory(categoryList, cat1);
		C206_CaseStudy.addCategory(categoryList, cat2);
		assertEquals("Test that Category arraylist size is 2", 2, categoryList.size());
		
		//test if the expected output string same as the list of category retrieved from the C206_CaseStudy
		allCategory= C206_CaseStudy.retrieveAllCategory(categoryList);
		testOutput = String.format("%-10s %-30s\n","cat0010", "Western");
		testOutput += String.format("%-10s %-30s\n","cat0020", "Asian");
	
		assertEquals("Test that ViewAllCamcorderlist", testOutput, allCategory);
		
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}

	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void doAdditems() {
		//test that item arraylist is not null so that items can be added to it
		assertNotNull("Check if there is a MenuItemList arraylist to add to", MenuItemList);
		
		//test that after adding an item, the size of the array is 1
		C206_CaseStudy.addItems(MenuItemList, menu1);
		assertEquals("Check that MenuItemList arraylist size is 1", 1, MenuItemList.size());
		
		//test that item added is the same as the first item of the arraylist
		assertSame("Check that the new Menu item is added", menu1, MenuItemList.get(0));
	}
	
	@Test
	public void doViewitems() {
		//Test that arraylist is not null, so items can be retrieved from it
		assertNotNull("Test if there is a MenuItemList arraylist so that the items there can be retrieved", MenuItemList);
		
		//Test that item retrieved from MenuItemList is empty
		String allitems = C206_CaseStudy.retrieveAllItems(MenuItemList);
		String Output = "";
		assertEquals("Check that items retrieved from MenuItemList is empty", Output, allitems);
		
		//Test that arraylist list size is 1 after adding 1 item into an empty arraylist
		C206_CaseStudy.addItems(MenuItemList, menu1);
		assertEquals("Check that MenuItemList arraylist size is 1", 1, MenuItemList.size());
		
	}
	
	
	@Test
	public void retrieveAllItemsTest() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Item arraylist to retrieve item", MenuItemList);
		
		//test if the list of category retrieved from the C206_CaseStudy is empty - boundary
		String allItem = C206_CaseStudy.retrieveAllItems(MenuItemList);
		String testOutput = "";
		assertEquals("Check that ViewAllCategorylist", testOutput, allItem);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addItems(MenuItemList, menu1);
		C206_CaseStudy.addItems(MenuItemList, menu2);
		assertEquals("Test that Item arraylist size is 2", 2, MenuItemList.size());
		
		//test if the expected output string same as the list of category retrieved from the C206_CaseStudy
		allItem= C206_CaseStudy.retrieveAllItems(MenuItemList);
		testOutput = String.format("%-10s %-30s\n","cat0010", "Western");
		testOutput += String.format("%-10s %-30s\n","cat0020", "Asian");
	
		assertEquals("Test that ViewAllCamcorderlist", testOutput, MenuItemList);
		
	}
	
	
	@Test
	public void doDeleteitems() {
		//Check that the arraylist is not null, so items can be removed from the arraylist
		assertNotNull("Test if the item you want deleted is from a valid arraylist ",MenuItemList);
		C206_CaseStudy.RemoveItems(MenuItemList, menu1.getId());
		
		
		//Test that items after adding 2 items, arraylist list becomes 2. After removing 1 item, arraylist size becomes 1
		MenuItemList.add(menu1);
		MenuItemList.add(menu2);
		assertEquals("Check that MenuItemList arraylist size is 2", 2, MenuItemList.size());
		MenuItemList.remove(0);
		assertEquals("Check that MenuItemList arraylist size is 1", 1, MenuItemList.size());
		
		//Test that items can be removed until arraylist becomes empty
		MenuItemList.remove(0);
		assertTrue("Check that MenuItemList arraylist size is empty", MenuItemList.isEmpty());
	}
	
	@Test
	public void retrieveAllItemsforRemovalTest() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Item arraylist to retrieve item", MenuItemList);
		
		//test if the list of category retrieved from the C206_CaseStudy is empty - boundary
		String allItem = C206_CaseStudy.retrieveAllItems(MenuItemList);
		String testOutput = "";
		assertEquals("Check that ViewAllMenuItemlist", testOutput, allItem);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addItems(MenuItemList, menu1);
		C206_CaseStudy.addItems(MenuItemList, menu2);
		assertEquals("Test that Item arraylist size is 2", 2, MenuItemList.size());
		
		//test if the expected output string same as the list of category retrieved from the C206_CaseStudy
		allItem= C206_CaseStudy.retrieveAllItemsforRemoval(MenuItemList, 1);
		testOutput = String.format("%-10s %-30s\n","cat0010", "Western");
		testOutput += String.format("%-10s %-30s\n","cat0020", "Asian");
		assertEquals("Test that ViewAllCamcorderlist", testOutput, MenuItemList);
		
	}
}
