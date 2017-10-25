package com.paigeruppel.codewars.skyscrapers;

public class Clue {
	//create a clue object for each clue we receive
	private ClueValue clueValue;
	private int clockPosition;
	private Integer[] correspondingRowAndCol;
	
	private SkyScraperFourByFourGuideLines guide = new SkyScraperFourByFourGuideLines();
	
	public Integer[] getCorrespondingRowAndCol() {
		return correspondingRowAndCol;
	}

	//constructor that accepts clue type (int) clue position (clock) and from that builds certain guidelines
	public Clue(ClueValue clueValue, int clockPosition) {
		this.clueValue = clueValue;
		this.clockPosition = clockPosition;
		correspondingRowAndCol = guide.convertClockPositionToRowAndCol(clockPosition);
	}
}
