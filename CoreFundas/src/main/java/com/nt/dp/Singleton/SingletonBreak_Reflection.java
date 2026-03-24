package com.nt.dp.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonBreak_Reflection {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Singleton s1=Singleton.getInstance();
	
		Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		Singleton s2 = constructor.newInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
