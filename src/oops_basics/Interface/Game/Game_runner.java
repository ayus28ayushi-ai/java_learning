package oops_basics.Interface.Game;

public class Game_runner {

	public static void main(String[] args) {
		ChessGame player = new ChessGame();
		player.up();
		player.down();
		player.left();
		player.right();

	}

}