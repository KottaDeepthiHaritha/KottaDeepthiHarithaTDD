package tdd.junit_tdd;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCase {
    OperationOnA operationonA;
    @BeforeEach
    void setUp() {
    	operationonA=new OperationOnA();
    }
    @Test
	void testcase1() {
		assertEquals("BCD",operationonA.operations("ABCD"));
	}
      
    @Test
	void testcase2() {
		assertEquals("CD",operationonA.operations("AACD"));
	}
    
    @Test
	void testcase3() {
		assertEquals("BCD",operationonA.operations("BACD"));
	}
    
    @Test
	void testcase4() {
		assertEquals("BBAA",operationonA.operations("BBAA"));
	}
    
    @Test
	void testcase5() {
		assertEquals("BAA",operationonA.operations("AABAA"));
	}

}
