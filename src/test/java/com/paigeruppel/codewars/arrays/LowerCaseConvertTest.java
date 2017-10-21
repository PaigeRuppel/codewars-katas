package com.paigeruppel.codewars.arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class LowerCaseConvertTest {

	private LowerCaseConvert underTest;
	
	@Before
	public void setup() {
		underTest = new LowerCaseConvert();
	}
	
	@Test
	public void shouldReturnRedAndGreenToLower() {
		Object[] items = {"Red", "Green"};
		Object[] lowerCase = {"red", "green"};
		assertThat(underTest.convertToLowerCase(items), is(lowerCase));
	}

	@Test
	public void shouldReturnRedAndGreenToLowerButLeaveIntsUnchanged() {
		Object[] items = {"Red", "Green", 1, 2};
		Object[] lowerCase = {"red", "green", 1, 2};
		assertThat(underTest.convertToLowerCase(items), is(lowerCase));
	}
	
	@Test
	public void shouldReturnIntsUnchanged() {
		Object[] items = {1, 2, 3, 4};
		Object[] lowerCase = {1, 2, 3, 4};
		assertThat(underTest.convertToLowerCase(items), is(lowerCase));
	}
}
