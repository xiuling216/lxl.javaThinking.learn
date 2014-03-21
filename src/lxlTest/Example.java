package lxlTest;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.NotFoundException;

/**
 * @echo 2014-3-21
 * 
 */
public class Example {
	public int method1(String str) throws NotFoundException, CannotCompileException {
		System.out.println("method1:" + str);
		ClassPool pool=ClassPool.getDefault();
		CtClass pt = pool.get("lxlTest.Example");
		System.out.println("old:"+pt.getSuperclass().getName()); 
		pt.setSuperclass(pool.get("List"));
		System.out.println("new:"+pt.getSuperclass().getName()); 
		return 1;
	}

	public int[] method2() {
		return new int[] { 1, 2 };
	}

}
