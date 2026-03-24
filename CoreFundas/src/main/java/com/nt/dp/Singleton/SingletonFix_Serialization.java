package com.nt.dp.Singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/*
 * Lazy_Initialization_Singleton
 */

public class SingletonFix_Serialization implements Serializable {

	private static final long serialVersionUID = 1L;
	private static SingletonFix_Serialization INSTANCE;

	private SingletonFix_Serialization() {
	}

	private Object readResolve() throws ObjectStreamException{
		return Singleton.getInstance();
	}

	public static SingletonFix_Serialization getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingletonFix_Serialization();
		}
		return INSTANCE;
	}
}
