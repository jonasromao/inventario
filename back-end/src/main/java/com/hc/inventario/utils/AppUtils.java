package com.hc.inventario.utils;

import java.util.Collection;

public class AppUtils {

	public static boolean isNullOrEmpty( Object objeto ) {
		return objeto == null || ( objeto instanceof String && ( (String)objeto ).trim().isEmpty() ) || ( objeto instanceof Collection<?> && ( (Collection<?>)objeto ).isEmpty() );
	}

	public static boolean isNotNullOrEmpty( Object objeto ) {
		return !isNullOrEmpty(objeto);
	}
	
}
