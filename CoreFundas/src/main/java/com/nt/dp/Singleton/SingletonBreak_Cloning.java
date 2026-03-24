package com.nt.dp.Singleton;

import java.lang.reflect.InvocationTargetException;

public class SingletonBreak_Cloning {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = (Singleton) s1.clone();

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
