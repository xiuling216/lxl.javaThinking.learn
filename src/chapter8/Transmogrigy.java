package chapter8;

/**
 * @echo 2013-8-1 用继承进行设计
 */
class Actor {
	public void act() {
	}
}

class HappyActor extends Actor {
	public void act() {
		System.out.println("HappyActor");
	}
}

class SadActor extends Actor {
	public void act() {
		System.out.println("SadActor");
	}
}

class Stage {
	private Actor actor = new HappyActor();

	public void change() {
		actor = new SadActor();
	}

	public void performPlay() {
		actor.act();
	}
}

public class Transmogrigy {
	public static void main(String[] args) {
		Stage stage=new Stage();
		stage.performPlay();
		stage.change();
		stage.performPlay();
	}
}
