package br.com.bytebank.banco.test.util;

import java.util.List;
import java.util.ArrayList;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29);
		System.out.println(idadeRef.intValue());
		
		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef.doubleValue());
		
		Float fRef = Float.valueOf(2);
		System.out.println(fRef.floatValue());
		
		Boolean bRef = Boolean.TRUE;
		System.out.println(bRef.booleanValue());
		
		String sRef = "String";
		System.out.println(sRef);
		
		List<Number> numeros = new ArrayList<>();
		numeros.add(10); 
		numeros.add(idadeRef);
		numeros.add(dRef);
		numeros.add(fRef);
		System.out.println(numeros);
	}
}
