package chapter7;

/**
 * 继承中带参数的构造函数
 * 必须用super显示的编写调用基类构造函数的语句
 */
class Game {
	Game(int i) {
		System.out.println("Game constructor");
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		System.out.println("BoardGame constructor");
	}
}

public class Chess extends BoardGame {
	Chess() {
		super(2);
		System.out.println("chess constructor");
	}

	public static void main(String[] args) {
		Chess c = new Chess();
	}

}
