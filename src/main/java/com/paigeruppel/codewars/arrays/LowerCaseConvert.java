package com.paigeruppel.codewars.arrays;

public class LowerCaseConvert {

	public Object[] convertToLowerCase(Object[] items) {
		for (int i = 0; i < items.length; i++) {
			String item = items[i].toString();
			item = item.toLowerCase();
			if (tryParse(item) != null) {
				items[i] = tryParse(item);
			} else {
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

}
