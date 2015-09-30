package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	
	// returns -1 if candidateSolution contains - character, else 0
	@Test
	public void checkCharactersPositive() {
		
		String candidateSolution = "9134";
		
		assertEquals(0, SudokuVerifier.charactersPositive(candidateSolution));
	}
	
	// returns -1 if candidateSolution contains - character, else 0
	@Test
	public void checkCharactersIncludingMinus() {
		
		String candidateSolution = "91340";
		
		assertEquals(-1, SudokuVerifier.charactersPositive(candidateSolution));
	}

}
