package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {

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
		Counter counter = new Counter();
		int firstIncrement = counter.increment();
		System.out.println(firstIncrement);
		int secondIncrement = counter.increment();
		System.out.println(secondIncrement);
		counter.increment(); counter.increment(); counter.increment();
		counter.increment(); counter.increment(); counter.increment(); 
		counter.increment(); counter.increment(); counter.increment();
		counter.increment(); counter.increment(); counter.increment();
		counter.increment(); counter.increment(); counter.increment();
		counter.increment(); counter.increment(); counter.increment();
		counter.increment(); counter.increment(); counter.increment();
		counter.increment(); counter.increment(); counter.increment();
		counter.increment(); counter.increment(); counter.increment(); 
		counter.increment(); counter.increment(); counter.increment(); 
		counter.increment(); counter.increment(); counter.increment();
		counter.increment(); counter.increment(); counter.increment();
		counter.increment(); counter.increment(); counter.increment(); 
		counter.increment(); counter.increment(); counter.increment();
		counter.increment(); counter.increment(); counter.increment();
		counter.increment(); counter.increment(); counter.increment();
		int finalIncrement = counter.increment();
		System.out.println(finalIncrement);
	}

	
	
	
	
}
