package com.liuxiang.velocity.util.test;

import com.liuxiang.velocity.util.ClassFilter;
import com.liuxiang.velocity.util._ClassUtils;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Modifier;

public class ClassUtilsTest {
	
	private static ClassFilter filter;
	
	@BeforeClass
	public static void beforeClass() {
		filter = new ClassFilter(){
			public boolean accept(Class clazz) {
				return 
					     !Modifier.isAbstract(clazz.getModifiers())
					  && !Modifier.isInterface(clazz.getModifiers())
					  && Modifier.isPublic(clazz.getModifiers())
					  && !Modifier.isStatic(clazz.getModifiers());
			}
		 };
	}
	
	@Test
	public void test() {
		for(Class clazz : _ClassUtils.scanPackage("com",filter)){
			System.out.println(clazz);
		}
	}
	
}
