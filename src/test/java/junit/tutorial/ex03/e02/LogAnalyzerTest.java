package junit.tutorial.ex03.e02;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doThrow;
import java.io.IOException;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class LogAnalyzerTest {

	@InjectMocks
	 LogAnalyzer target; 
	
	@Mock
	LogLoader mockLogLoder;
	
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
	void test() throws IOException {
		 doThrow(new IOException()).when(mockLogLoder).load("aaa");
		assertThrows(AnalyzeException.class, ()-> target.analyze("aaa"));
		
		
		
	}

	//private Object doThrow(IOException ioException) {
		// TODO Auto-generated method stub
	//	return null;
	//}


}
