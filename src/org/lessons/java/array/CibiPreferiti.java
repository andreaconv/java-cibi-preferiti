package org.lessons.java.array;

import java.util.Arrays;

public class CibiPreferiti {
	public static void main(String[] args) {
		
		String[] cibiPreferiti = {"pasta", "carne", "torta di mele", "pizza", "pesce", "verdure grigliate", "fagioli", "cavolfiore"};
		
		System.out.println("lunghezza array: " + cibiPreferiti.length);
		System.out.println("cibo preferito: " + cibiPreferiti[0]);
		System.out.println("cibo sconsigliato: " + cibiPreferiti[cibiPreferiti.length - 1]);
		System.out.println("cibo preferito: " + cibiPreferiti[cibiPreferiti.length / 2]);
	}

}
