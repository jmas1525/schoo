public abstract class Player {
	static int maxId = 0;
	private int id;
	private String name;
	private int handNum;
	static final String[] hand = {"グー", "チョキ", "パー"};
	private int win;

	public Player(String name) {
		this.name = name;
		id = ++maxId;
		win = 0;
	}

	public String toString() {
		return "名前：" + name + "  id：" + id
				 + "\n勝利数：" + win;
	}
	public abstract int playHand();
	public void setHandNum(int n) { handNum = n; }
	public int getHandNum() { return handNum; }
	public String getHand() {
		return hand[handNum];
	}
	public String getName() {
		return name;
	}

	public void winCount() { win++; }
}
