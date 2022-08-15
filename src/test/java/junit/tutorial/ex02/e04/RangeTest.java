package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;

class RangeTest {

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

	@ParameterizedTest
	void test() {
		Range range = new Range(0.0,10.5);
		boolean answer = range.contains(-0.1);
		assertEquals(false, answer);
		boolean answer2 = range.contains(0.0);
		assertEquals(true, answer2);
		boolean answer3 = range.contains(10.5);
		assertEquals(true, answer3);
		boolean answer4 = range.contains(10.6);
		assertEquals(false, answer4);
	}

	@ParameterizedTest
	void test1() {
		Range range = new Range(-5.1,5.1);
		boolean answer = range.contains(-5.2);
		assertEquals(false, answer);
		boolean answer2 = range.contains(-5.1);
		assertEquals(true, answer2);
		boolean answer3 = range.contains(5.1);
		assertEquals(true, answer3);
		boolean answer4 = range.contains(5.2);
		assertEquals(false, answer4);
	}
	
	
	
	
}
