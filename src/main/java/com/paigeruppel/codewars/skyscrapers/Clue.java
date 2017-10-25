package com.paigeruppel.codewars.skyscrapers;

public class Clue {
	//create a clue object for each clue we receive
	private int clueType;
	private int clockPosition;
	private Integer[] correspondingRowAndCol;
	
	private SkyScraperFourByFourGuideLines guide = new SkyScraperFourByFourGuideLines();
	
	public Integer[] getCorrespondingRowAndCol() {
		return correspondingRowAndCol;
	}

	//constructor that accepts clue type (int) clue position (clock) and from that builds certain guidelines
	public Clue(int clueType, int clockPosition) {
		this.clueType = clueType;
		this.clockPosition = clockPosition;
		correspondingRowAndCol = guide.convertClockPositionToRowAndCol(clockPosition);
	}

	
	
	
	
}
