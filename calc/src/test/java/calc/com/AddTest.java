package calc.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	void test1() {
		Add addi=new Add();
		int exp=10;
		int actual=addi.add(5,5);
		assertEquals(exp,actual);
	}
	
	@Test
	void test2() {
		Add addi=new Add();
		int exp=0;
		int actual=addi.sub(5,5);
		assertEquals(exp,actual);
	}
	
	@Test
	void test3() {
		Add addi=new Add();
		int exp=25;
		int actual=addi.mul(5,5);
		assertEquals(exp,actual);
	}
	
	@Test
	void test4() {
		Add addi=new Add();
		int exp=1;
		int actual=addi.div(5,5);
		assertEquals(exp,actual);
	}
	
	@Test
	void test5() {
		Add addi=new Add();
		int exp=10;
		int actual=addi.add(5,5);
		assertEquals(exp,actual);
	}
	
	@Test
	void test6() {
		Add addi=new Add();
		int exp=0;
		int actual=addi.sub(5,5);
		assertEquals(exp,actual);
	}
	
	@Test
	void test7() {
		Add addi=new Add();
		int exp=25;
		int actual=addi.mul(5,5);
		assertEquals(exp,actual);
	}
	
	@Test
	void test8() {
		Add addi=new Add();
		int exp=1;
		int actual=addi.div(5,5);
		assertEquals(exp,actual);
	}
	
}
