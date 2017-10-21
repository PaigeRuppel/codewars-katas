package com.paigeruppel.codewars.arrays;

public class LowerCaseConvert {

	public Object[] convertToLowerCase(Object[] items) {
		for (int i = 0; i < items.length; i++) {
			String item = items[i].toString();
			item = item.toLowerCase();
			items[i] = item;
		}
		return items;
	}

}
