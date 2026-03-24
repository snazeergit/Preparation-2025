package com.nt.dp.Singleton;

/*
 * Lazy_Initialization_Singleton
 */


public class SingletonFix_Cloning implements Cloneable {

	private static SingletonFix_Cloning INSTANCE;

	private SingletonFix_Cloning() {
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return Singleton.getInstance();
	}

	public static SingletonFix_Cloning getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingletonFix_Cloning();
		}
		return INSTANCE;
	}
}
