//じゃんけんを行うプログラム。
// Input, RangeError, Player, HumanPlayer, RobotPlayer.javaを使用
import java.util.Scanner;

public class ex_15_5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("何人でじゃんけんをしますか？（2人以上）：");
		int n = Input.inputIntOver(2);

		Player[] p = new Player[n];
	}
}
