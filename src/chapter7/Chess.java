package chapter7;

/**
 * �̳��д������Ĺ��캯��
 * ������super��ʾ�ı�д���û��๹�캯�������
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
