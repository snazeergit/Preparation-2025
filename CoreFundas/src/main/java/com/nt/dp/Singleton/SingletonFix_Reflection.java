package com.nt.dp.Singleton;

/*
 * Lazy_Initialization_Singleton
 */

public class SingletonFix_Reflection {

	private static SingletonFix_Reflection INSTANCE;

	private SingletonFix_Reflection() {
		if (INSTANCE != null)
			throw new RuntimeException("Object already created");
	}

	public static SingletonFix_Reflection getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingletonFix_Reflection();
		}
		return INSTANCE;
	}
}
