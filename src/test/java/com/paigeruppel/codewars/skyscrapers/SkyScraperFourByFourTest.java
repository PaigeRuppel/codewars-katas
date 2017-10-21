package com.paigeruppel.codewars.skyscrapers;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SkyScraperFourByFourTest {

	private SkyScraperFourByFour underTest;
	private int[] clues1 = { 2, 2, 1, 3, 2, 2, 3, 1, 1, 2, 2, 3, 3, 2, 1, 3 };
	
	/*
	 *       2 2 1 3
	 *     3|_|_|_|_|2
	 *     1|_|_|_|_|2
	 *     2|_|_|_|_|3
	 *     3|_|_|_|_|1
	 *       3 2 2 1
	 */
	
	
	@Before
	public void setup() {
		underTest = new SkyScraperFourByFour();
	}
	

	@Test
	public void shouldReturnAllPositionsWith1FromClues1() {
		List<Integer> onePositions = new ArrayList<>();
		onePositions.add(2);
		onePositions.add(7);
		onePositions.add(8); 
		onePositions.add(14);
		assertThat(underTest.locateAllOnes(clues1), is(onePositions));
	}
	
	@Test
	public void allOnePositionsShouldBePopulatedWithFoursFromClues1() {
		int[][] withFours = {{0,0,4,0},
							{4,0,0,0},
							{0,0,0,0},
							{0,0,0,4}};
		assertThat(underTest.buildAllFours(clues1), is(withFours));
	}
	
	@Test
	public void shouldFillInFinalFourWhenThreeAreAlreadyOnGrid() {
		int[][] withFours = underTest.buildAllFours(clues1);
		int[][] withAllFours = {{0,0,4,0},
								{4,0,0,0},
								{0,4,0,0},
								{0,0,0,4}};
		assertThat(underTest.fillInFourthInstanceOfNumber(withFours, 4), is(withAllFours));
	}
	
	@Test
	public void shouldFillIn3sAtPositionsWhereClueIs2AndPairIs1FromClues1() {
		int[][] withAllFours = {{0,0,4,0},
								{4,0,0,0},
								{0,4,0,0},
								{0,0,0,4}};
		int[][] withThreesAndFours = {{0,0,4,0},
									  {4,0,0,3},
									  {0,4,0,0},
									  {0,0,3,4}};
		
		assertThat(underTest.fillInKnownThrees(clues1, withAllFours), is(withThreesAndFours));
	}
}
