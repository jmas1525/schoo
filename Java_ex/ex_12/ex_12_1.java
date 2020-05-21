// Carクラスをスーパー（上位）クラスとするCarMileageクラスを使用
// Carクラスは、Dayクラスを使用している
import java.util.Scanner;

public class ex_12_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Day d = new Day(2020, 3, 9);
		CarMileage_r01 car = new CarMileage_r01("くるま", 3000, 3000, 3000, 100.0, d);

		//--- 車の移動操作 ---//
		while(true) {
			int n = -1;
			System.out.println("現在地(" + car.getX() + ", " + car.getY() + ")・残り燃料 " + car.getFuel());
			do {
				System.out.print("移動しますか[0…No／1…Yes]：");
				n = stdIn.nextInt();
			} while (n < 0 || n > 1);
			if (n == 0)		break;

			System.out.print("X方向の移動距離：");
			double dx = stdIn.nextDouble();
			System.out.print("Y方向の移動距離：");
			double dy = stdIn.nextDouble();
			System.out.println();

			if (!car.move(dx, dy))
				System.out.println("燃料が足りません！\n");
		}

	System.out.println ("総移動距離は" + car.getTotalMileage() + "です。");
	stdIn.close();
	}
}

