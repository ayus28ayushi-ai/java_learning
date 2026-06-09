package oops_basics.Interface.Game;

public class ChessGame implements GameConsole {

	@Override
	public void up() {
		System.out.println("Move piece forward.");

	}

	@Override
	public void down() {
		System.out.println("Move piece backward.");

	}

	@Override
	public void left() {
		System.out.println("Move piece left.");

	}

	@Override
	public void right() {
		System.out.println("Move piece right.");

	}

}