package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void checkIfCharactersPositive() {
		String candidateSolution = "";
		assertEquals(-1, SudokuVerifier.charactersPositive(candidateSolution))
	}

}
