package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	
	// returns -1 if candidateSolution contains - character, else 0
	@Test
	public void checkIfCharactersPositive() {
		
		String candidateSolution = "009134";
		
		assertEquals(0, SudokuVerifier.charactersPositive(candidateSolution));
	}

}
