package com.paigeruppel.codewars.skyscrapers;

import java.util.ArrayList;
import java.util.List;

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

	public int[][] fillInFourthInstanceOfNumber(int[][] incompleteGrid, int numberOfInterest) {
		int rowCount = 0;
		int colCount = 0;
		for (int row = 0; row < incompleteGrid.length; row++) {
			for (int col = 0; col < incompleteGrid[0].length; col++) {
				if (incompleteGrid[row][col] == numberOfInterest) {
					rowCount += row;
					colCount += col;
				}
			}
		}
		int remainingRow = calculateRemainingPosition(rowCount);
		int remainingCol = calculateRemainingPosition(colCount);
		incompleteGrid[remainingRow][remainingCol] = numberOfInterest;
		return incompleteGrid;
	}
	
	private int calculateRemainingPosition(int count) {
		int remaining = 0;
		
		if (count == 3) {
			remaining = 3;
			}
		if (count == 4) {
			remaining = 2;
		}
		if (count == 5) {
			remaining = 1;
		}
		return remaining;
	}

}
