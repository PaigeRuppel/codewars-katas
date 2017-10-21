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
}
