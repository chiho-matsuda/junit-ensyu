package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemStockTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		ItemStock itemStock = new ItemStock();
		int firstGetNum = itemStock.getNum(new Item("CD",100));
		System.out.println(firstGetNum);
	}

	@Test
	void test2() {
		ItemStock itemStock = new ItemStock();
		itemStock.add(new Item("book",1000));
		int firstGetNum = itemStock.getNum(new Item("book",1000));
		System.out.println(firstGetNum);
	}
	
	@Test
	void test3() {
		ItemStock itemStock = new ItemStock();
		itemStock.add(new Item("book",1000));
		itemStock.add(new Item("book",1000));
		int secondGetNum = itemStock.getNum(new Item("book",1000));
		System.out.println(secondGetNum);
	}
	
	@Test
	void test4() {
		ItemStock itemStock = new ItemStock();
		itemStock.add(new Item("book",1000));
		itemStock.add(new Item("DVD",5000));
		int thirdGetNum = itemStock.getNum(new Item("book",1000));
		System.out.println(thirdGetNum);
	}
	
	
}
