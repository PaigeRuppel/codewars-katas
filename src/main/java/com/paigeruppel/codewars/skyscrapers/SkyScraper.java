package com.paigeruppel.codewars.skyscrapers;

import java.util.HashSet;
import java.util.Set;

public class SkyScraper {


	public Set<Integer> locateAllOnes(int[] clues) {
		Set<Integer> onePositions = new HashSet<>();
		for (int i = 0; i < clues.length; i++)
		{
			if (clues[i] == 1) {
				onePositions.add(i);
			}
		}
		return onePositions;
	}

}
