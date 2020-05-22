// じゃんけんプレーヤー（人間）クラス
// Playerクラスを継承
public class HumanPlayer extends Player {
	public HumanPlayer(String name) {
		super(name);
	}

	public int playHand() {
		System.out.println("出す手を選択してください。");
		System.out.println("0…グー／1…チョキ／2…パー：");
		setHandNum(Input.inputInt(0, 2));
		return getHandNum();
	}
}
