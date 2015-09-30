package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void checkIfCharactersPositive() {
		
		candidateSolution = "00905-1";
		
		assertEquals(0, SudokuVerifier.charactersPositive(candidateSolution));
	}

}
