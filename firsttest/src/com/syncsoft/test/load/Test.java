package com.syncsoft.test.load;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
//		String localString = Son.staicField;
		Class<Son> class1 =Son.class;
		Method declaredMethod = class1.getDeclaredMethod("hello");
		declaredMethod.setAccessible(true);
		declaredMethod.invoke(class1.newInstance());
	}

}
