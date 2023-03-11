package edu.unca.csci202;

//@Author Kamren Sims
//Contains the constructor of a cell, used static characters to keep the value constant
public class Cell {

	static char spot = '-';
	static char numbers = '0';
	static char mine = 'M';
	
	boolean playerGuess;
	boolean correctAns;
	char boardSpot;
	
	public Cell(char boardSpot, boolean playerGuess, boolean correctAns) {
		this.boardSpot = boardSpot;
		this.playerGuess = playerGuess;
		this.correctAns = correctAns;
		boardSpot = spot;
	}
	
}
