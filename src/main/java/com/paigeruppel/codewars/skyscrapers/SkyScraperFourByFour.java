package com.paigeruppel.codewars.skyscrapers;

import java.util.ArrayList;
import java.util.List;

import org.mockito.cglib.core.Converter;

public class SkyScraperFourByFour {

	/*
	 * https://www.codewars.com/kata/4-by-4-skyscrapers/
	 */
	private SkyScraperFourByFourGuideLines guide = new SkyScraperFourByFourGuideLines();
	
	public List<Integer> locateAllOnes(int[] clues) {
		List<Integer> onePositions = new ArrayList<>();
		for (int i = 0; i < clues.length; i++) {
			if (clues[i] == 1 && !onePositions.contains(clues[i])) {
				onePositions.add(i);
			}
		}
		return onePositions;
	}

	public int[][] buildAllFours(int[] clues) {
		List<Integer> onePositions = locateAllOnes(clues);
		int[][] withFours = new int[4][4];
		for (int i = 0; i < onePositions.size(); i++) {
			int clockPosition = onePositions.get(i);
			Integer[] coords = guide.convertClockPositionToRowAndCol(clockPosition);
			withFours[coords[0]][coords[1]] = 4;
		}

		return withFours;
	}

}
