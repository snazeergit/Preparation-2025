package com.nt.dp.Singleton;

import java.io.Serializable;
import java.lang.Cloneable;

/*
 * Lazy_Initialization_Singleton
 */

/*
public class Singleton implements Cloneable, Serializable {

	private static Singleton INSTANCE;

	private Singleton() {
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static Singleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}
}
*/

/*
 * Lazy_Initialization_with_Double_Checked_Locking_Singleton
 */

public class Singleton implements Cloneable, Serializable {

	private static volatile Singleton INSTANCE;

	private Singleton() {
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static Singleton getInstance() {
		if (INSTANCE == null) {
			synchronized (Singleton.class) {
				if (INSTANCE == null) {
					INSTANCE = new Singleton();
				}
			}
		}
		return INSTANCE;
	}
}