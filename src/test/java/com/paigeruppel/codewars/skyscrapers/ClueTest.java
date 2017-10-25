package com.paigeruppel.codewars.skyscrapers;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ClueTest {

	private ClueValue one = new ClueValue(1);
	
	private Clue createClue(ClueValue clueType, int clockPosition) {
		return new Clue(clueType, clockPosition);
	}

	@Test
	public void shouldReturnRow0Col0ForClockPosition0() {
		Clue underTest = createClue(one, 0);
		Integer[] rowAndCol = { 0, 0 };
		assertThat(underTest.getCorrespondingRowAndCol(), is(rowAndCol));
	}

}
