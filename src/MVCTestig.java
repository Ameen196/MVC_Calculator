import static org.junit.Assert.*;

import org.junit.Test;

public class MVCTestig {

	@Test
	public void test() {
		
		Model Modeltest = new Model();
		assertEquals( 4 ,Modeltest.getResult(0, 2, 2) ); //0 add
		
		assertEquals( 1 ,Modeltest.getResult(0, -1, 2) );//0add
		
		assertEquals( 0 ,Modeltest.getResult(1, 2, 2) );//1 sub
		assertEquals( 16 ,Modeltest.getResult(1, 18, 2) );//1 sub
		
		assertEquals(36 ,Modeltest.getResult(2, 18, 2) );//2 mul
		assertEquals(-36 ,Modeltest.getResult(2, -18, 2) );//2 mul
		
		assertEquals(9 ,Modeltest.getResult(3, 18, 2) );//3 div
		//fail("Not yet implemented");
	}

}
