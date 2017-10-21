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

	public int[][] fillInFourthInstanceOfNumber(int[][] incompleteGrid, int numberOfInterest) {
		List<Integer> possibleRows = new ArrayList<>();
		possibleRows.add(0);
		possibleRows.add(1);
		possibleRows.add(2);
		possibleRows.add(3);
		List<Integer> possibleCols = new ArrayList<>();
		possibleCols.add(0);
		possibleCols.add(1);
		possibleCols.add(2);
		possibleCols.add(3);
		
		while (possibleRows.size() > 1 && possibleCols.size() > 1) {
			for (int row = 0; row < incompleteGrid.length; row++) {
				for (int col = 0; col < incompleteGrid[0].length; col++) {
					if (incompleteGrid[row][col] == numberOfInterest) {
						possibleRows.remove(possibleRows.indexOf(row));
						possibleCols.remove(possibleCols.indexOf(col));
					}
				}
			}
		}
		
		int remainingRow = possibleRows.get(0);
		int remainingCol = possibleCols.get(0);
		incompleteGrid[remainingRow][remainingCol] = numberOfInterest;
		return incompleteGrid;
	}

}
