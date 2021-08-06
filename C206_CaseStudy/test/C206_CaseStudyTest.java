import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Category cat1;
	private Category cat2;
	
	private ArrayList<Category> categoryList;
	
	
	@Before
	public void setUp() throws Exception {
		cat1 = new Category("cat0010", "Western");
		cat2 = new Category("cat0020", "Asian");
		
		categoryList = new ArrayList<Category>();
		
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
	
	
}
