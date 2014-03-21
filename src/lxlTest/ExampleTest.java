package lxlTest;

import static org.junit.Assert.*;
import javassist.CannotCompileException;
import javassist.NotFoundException;

import org.junit.Test;

/**
 * @echo  2014-3-21
 *
 */
public class ExampleTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void method1() throws NotFoundException, CannotCompileException {
		Example exa=new Example();
		int result=exa.method1("lxl");
		assertEquals(1, result);
	}
	
	@Test
	public void method2() {
		Example exa=new Example();
		int[] result=exa.method2();
		assertArrayEquals(new int[]{1,2}, result);
	}
}
