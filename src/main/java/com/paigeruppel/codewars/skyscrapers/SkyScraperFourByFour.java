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

	//TODO Refactor this monstrous method
	public int[][] fillInFourthInstanceOfNumber(int[][] incompleteGrid, int numberOfInterest) {
		List<Integer> filledRows = new ArrayList<>();
		List<Integer> filledCols = new ArrayList<>();
		while (filledRows.size() < 3 && filledCols.size() < 3) {
			for (int row = 0; row < incompleteGrid.length; row++) {
				for (int col = 0; col < incompleteGrid[0].length; col++) {
					if (incompleteGrid[row][col] == numberOfInterest) {
						filledRows.add(row);
						filledCols.add(col);
					}
				}
			}
		}
		
		int remainingRow = 0;
		int remainingCol = 0;
		
		for (int i = 1; i < 4; i++) {
			if (!filledRows.contains(i)) {
				remainingRow = i;
			}
			if (!filledCols.contains(i)) {
				remainingCol = i;
			}
		}
		
		incompleteGrid[remainingRow][remainingCol] = numberOfInterest;
		return incompleteGrid;
	}

}
