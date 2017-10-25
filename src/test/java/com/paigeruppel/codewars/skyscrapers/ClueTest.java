package com.paigeruppel.codewars.skyscrapers;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ClueTest {

	private Clue underTest;
	
	private Clue buildClue(int clueType, int clockPosition) {
		return new Clue(clueType, clockPosition);
	}
	
	@Test
	public void shouldReturnRow0Col0ForClockPosition0() {
		underTest = buildClue(1, 0);
		Integer[] rowAndCol = {0, 0};
		assertThat(underTest.getCorrespondingRowAndCol(), is(rowAndCol));
	}
}
