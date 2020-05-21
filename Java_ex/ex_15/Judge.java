// じゃんけんの審判（プレーヤーと試合の管理）

public class Judge {

	private  int playCount;

	public Judge() { playCount = 0; }

	public void playJanken(Player[] player) {
		System.out.println("じゃんけんします！");

		for (int i = 0; i < player.length; i++) {
			player[i].setHandNum(player[i].playHand());
			if (player[i] instanceof HumanPlayer)
				System.out.println(player[i].getName() + "：" + player[i].getHand());
			else
				System.out.println(player[i].getName() + "(com)：" + player[i].getHand());
		}

		System.out.println("じゃんけんポン！");
		for (int i = 0; i < player.length; i++) {
			if (player[i] instanceof HumanPlayer)
				System.out.println(player[i].getName() + "：" + player[i].getHand());
			else
				System.out.println(player[i].getName() + "(com)：" + player[i].getHand());
		}
	}

	public void judge() {

	}
}
