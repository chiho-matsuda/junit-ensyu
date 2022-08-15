package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class StringUtilsTest {

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
	void test1() {
		String result = StringUtils.toSnakeCase("aaa");
		//fail("Not yet implemented");
	}
	@Test
	void test2() {
		String result = StringUtils.toSnakeCase("HelloWorld");
	}
   @Test
   void test3() {
	   String result = StringUtils.toSnakeCase("practiceJunit");
   }

}
