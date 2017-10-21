package com.paigeruppel.codewars.skyscrapers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SkyScraper {

	/*
	 * https://www.codewars.com/kata/4-by-4-skyscrapers/
	 */

	private static final int[][] CLOCK_AS_GRID_INDICES = buildGridIndicesMap();

	public Set<Integer> locateAllOnes(int[] clues) {
		Set<Integer> onePositions = new HashSet<>();
		for (int i = 0; i < clues.length; i++) {
			if (clues[i] == 1) {
				onePositions.add(i);
			}
		}
		return onePositions;
	}

	private static int[][] buildGridIndicesMap() {
		// grid coords in order of the clues clock index
		int[][] correspondingGridCoords = { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 0, 3 }, { 0, 3 }, { 1, 3 }, { 2, 3 },
				{ 3, 3 }, { 3, 3 }, { 3, 2 }, { 3, 1 }, { 3, 0 }, { 3, 0 }, { 2, 0 }, { 1, 0 }, { 0, 0 } };
		return correspondingGridCoords;
	}

	public int[][] buildAllFours(int[] clues) {
		// TODO Auto-generated method stub
		return null;
	}

}
