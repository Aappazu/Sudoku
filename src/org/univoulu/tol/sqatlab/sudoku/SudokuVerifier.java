package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		// returns 1 if the candidate solution is correct
		return 0;
	}
	
	public static int checkIfCharactersPositive(String candidateSolution){
		
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
	
	public static int checkIfDigitsTwiceInGlobalRow(String candidateSolution){
		
		int result = 0;
		int i = 0;
		int j = 0;
		
		while(i < candidateSolution.length() && i <= 9 &&  result != -3){
			for(j = 0; j < 9; j++){
				if(candidateSolution.charAt(i) == candidateSolution.charAt(j)){
					result = -3;
				}
				else{
					result = 0;
				}
			}
			i++;
		}
		
		return result;
		
	}
}
