package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void checkIfCharactersPositive() {
		
		String candidateSolution = "0-09134";
		
		assertEquals(0, SudokuVerifier.charactersPositive(candidateSolution));
	}

}
