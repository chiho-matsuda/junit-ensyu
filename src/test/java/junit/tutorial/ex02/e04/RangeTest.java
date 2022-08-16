package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

	 @Nested
	 public class Rangetest{
	 @ParameterizedTest
	 @ValueSource(doubles = {0.0,10.5})
	 public void test(double d) {
		  Range ra = new Range(0.0,10.5);
		 boolean reslt = ra.contains(d);
		  assertTrue(reslt);
	 }
	
	 @ParameterizedTest
	 @ValueSource(doubles = {-0.1,10.6})
	 public void test2(double d) {
		  Range ra = new Range(0.0,10.5);
		 boolean reslt = ra.contains(d);
		  assertFalse(reslt);
	 }	 
}
	
	 @Nested
	 public class Rangetest2{
	 @ParameterizedTest
	 @ValueSource(doubles = {-5.1,5.1})
	 public void test(double d) {
		  Range ra = new Range(-5.1,5.1);
		 boolean reslt = ra.contains(d);
		  assertTrue(reslt);
	 }
	
	 @ParameterizedTest
	 @ValueSource(doubles = {-5.2,5.2})
	 public void test2(double d) {
		  Range ra = new Range(-5.1,5.1);
		 boolean reslt = ra.contains(d);
		  assertFalse(reslt);
	 }	 
}
	 
}
