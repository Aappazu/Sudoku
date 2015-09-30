package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		// returns 1 if the candidate solution is correct
		return 0;
	}
	
	public static int charactersPositive(String candidateSolution){
		
		int result = 0;
		
		for(int i = 0; i < candidateSolution.length(); i++){
			if(candidateSolution.charAt(i) == '-'){
				result = -1;
			}
			else{
				result = 0;
			}
		}
		
		return result;
		
		
	}
}
