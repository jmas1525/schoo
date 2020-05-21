// じゃんけんプレーヤークラスのテストプログラム
// (Input, Player, HumanPlayer, RobotPlayer, RangeError.javaを使用)
public class ex_13_3{
	public static void main(String[] args) {
		HumanPlayer test = new HumanPlayer("test");
		RobotPlayer rtest = new RobotPlayer("rtest");
		test.playHand();
		rtest.playHand();
		System.out.println(test);
		System.out.println(rtest);
	}
}