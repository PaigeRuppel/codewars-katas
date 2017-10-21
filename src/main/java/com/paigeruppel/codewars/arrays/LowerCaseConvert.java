package com.paigeruppel.codewars.arrays;

public class LowerCaseConvert {

	/*
	 * Create a function to lowercase all strings in an array. Non-string items
	 * should remain unchanged.
	 */
	
	public Object[] convertToLowerCase(Object[] items) {
		for (int i = 0; i < items.length; i++) {
			if (isString(items[i])) {
				String item = items[i].toString();
				item = item.toLowerCase();
				items[i] = item;
			}
		}
		return items;
	}

	public static Integer tryParse(String text) {
		try {
			return Integer.parseInt(text);
		} catch (NumberFormatException e) {
			return null;
		}
	}

	private boolean isString(Object item) {
		String itemAsString = item.toString();
		return tryParse(itemAsString) == null;
	}

}
