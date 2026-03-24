package com.nt.dp.Singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonBreak_Serialization {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Singleton s1 = Singleton.getInstance();

		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("sample.txt"));
		out.writeObject(s1);
		out.close();
		
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("sample.txt"));
		Singleton s2 = (Singleton)in.readObject();
		in.close();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
