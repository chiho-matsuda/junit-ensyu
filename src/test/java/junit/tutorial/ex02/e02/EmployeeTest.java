package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

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
		try {
			InputStream in = new FileInputStream("/matsudachifu/workspace-spring/junit-ensyu/src/main/java/junit/tutorial/ex02/e02/Employee.txt");
			List<Employee> empList = Employee.load(in);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
