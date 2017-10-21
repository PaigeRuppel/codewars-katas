package com.paigeruppel.codewars.skyscrapers;

import java.util.ArrayList;
import java.util.List;

public class SkyScraper {

	/*
	 * https://www.codewars.com/kata/4-by-4-skyscrapers/
	 */

	private static final List<Integer[]> GRID_INDICES = buildGridIndicesMap();
	
	public List<Integer> locateAllOnes(int[] clues) {
		List<Integer> onePositions = new ArrayList<>();
		for (int i = 0; i < clues.length; i++) {
			if (clues[i] == 1 && !onePositions.contains(clues[i])) {
				onePositions.add(i);
			}
		}
		return onePositions;
	}

	private static List<Integer[]> buildGridIndicesMap() {
		// grid coords in order of the clues clock index
		int[][] correspondingGridCoords = { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 0, 3 }, { 0, 3 }, { 1, 3 }, { 2, 3 },
				{ 3, 3 }, { 3, 3 }, { 3, 2 }, { 3, 1 }, { 3, 0 }, { 3, 0 }, { 2, 0 }, { 1, 0 }, { 0, 0 } };
		
		List<Integer[]> coordsList = new ArrayList<>();
		
		for (int row = 0; row < correspondingGridCoords.length; row++) {
			Integer[] coords = { correspondingGridCoords[row][0], correspondingGridCoords[row][1] };
			coordsList.add(coords);
		}
		return coordsList;
	}

	public int[][] buildAllFours(int[] clues) {
		List<Integer> onePositions = locateAllOnes(clues);
		int[][] withFours = new int[4][4];

		for (int i = 0; i < onePositions.size(); i++) {
			int clockPosition = onePositions.get(i);
			Integer[] coords = GRID_INDICES.get(clockPosition);
			withFours[coords[0]][coords[1]] = 4;
		}

		return withFours;
	}

}
