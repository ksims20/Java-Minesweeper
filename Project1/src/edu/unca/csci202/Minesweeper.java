package edu.unca.csci202;
//@Author Kamren Sims
//Contains the main method, calls the gameboard from the gameboard class to run the game, in addition to the game's intro
public class Minesweeper {

	public static void main(String[] args) throws WrongInputException {
		Gameboard Ms = new Gameboard();

		Ms.gameIntro();
		Ms.run();
	}

}
