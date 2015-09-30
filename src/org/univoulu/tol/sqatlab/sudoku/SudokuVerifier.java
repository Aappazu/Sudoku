package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		// returns 1 if the candidate solution is correct
		return 0;
	}
	
	public static int charactersPositive(String candidateSolution){
		
		int result = 0;
		int i = 0;
		
		while(i < candidateSolution.length() && result != -1){
			if(candidateSolution.charAt(i) < 49 || candidateSolution.charAt(i) > 57){
				result = -1;
			}
			else{
				result = 0;
			}
			
			i++;
		}
		
		return result;
		
	}
}
