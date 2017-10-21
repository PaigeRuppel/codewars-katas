package com.paigeruppel.codewars.skyscrapers;

import java.util.ArrayList;
import java.util.List;

public class SkyScraperFourByFourGuideLines {
	public static final List<Integer[]> GRID_INDICES = buildGridIndicesList();

	private static List<Integer[]> buildGridIndicesList() {
		// grid coords in order of the clues clock index
		int[][] gridCoordsInClockIndex = { { 0, 0 }, { 0, 1 }, { 0, 2 }, { 0, 3 }, { 0, 3 }, { 1, 3 }, { 2, 3 },
				{ 3, 3 }, { 3, 3 }, { 3, 2 }, { 3, 1 }, { 3, 0 }, { 3, 0 }, { 2, 0 }, { 1, 0 }, { 0, 0 } };

		List<Integer[]> coordsList = new ArrayList<>();

		for (int row = 0; row < gridCoordsInClockIndex.length; row++) {
			Integer[] coords = { gridCoordsInClockIndex[row][0], gridCoordsInClockIndex[row][1] };
			coordsList.add(coords);
		}
		return coordsList;
	}

	public Integer[] convertClockPositionToRowAndCol(int clockPosition) {
		return GRID_INDICES.get(clockPosition);
	}

	public int findPair(int clockPosition) {
		int pair = 0;
		if (clockPosition == 11 || clockPosition == 15) {
			pair = clockPosition - 11;
		}
		if (clockPosition == 0 || clockPosition == 4) {
			pair = clockPosition + 11;
		}
		if (clockPosition == 10 || clockPosition == 14) {
			pair = clockPosition - 9;
		}
		if (clockPosition == 1 || clockPosition == 5) {
			pair = clockPosition + 9;
		}
		if (clockPosition == 9 || clockPosition == 13) {
			pair = clockPosition - 7;
		}
		if (clockPosition == 2 || clockPosition == 6) {
			pair = clockPosition + 7;
		}
		if (clockPosition == 8 || clockPosition == 12) {
			pair = clockPosition - 5;
		}
		if (clockPosition == 3 || clockPosition == 7 ) {
			pair = clockPosition + 5;
		}
		return pair;
	}

	// Finds last remaining row or column given a count - assumes count is total of
	// three row or col positions
	public int findRemainingPosition(int count) {
		int remaining = 0;
		switch (count) {
		case 3:
			remaining = 3;
			break;
		case 4:
			remaining = 2;
			break;
		case 5:
			remaining = 1;
			break;
		}
		return remaining;
	}

}
