package com.lima.souza.caio.streams;

import java.util.function.UnaryOperator;

public abstract class Utils {
	
	public static final UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	
	public static String scream (String n) {
		return n.toUpperCase() + "!!!!! ";	
	}
}
