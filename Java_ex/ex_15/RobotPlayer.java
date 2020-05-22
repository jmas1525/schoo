// じゃんけんプレーヤー（ロボット）クラス
// Playerクラスを継承
import java.util.Random;

public class RobotPlayer extends Player {
	static Random rand = new Random();

	public RobotPlayer(String name) {
		super(name);
	}

	public int playHand() {
		setHandNum(rand.nextInt(3));
		return getHandNum();
	}
}
