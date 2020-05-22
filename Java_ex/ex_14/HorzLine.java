// 水平直線を表す(図形クラス群)
public class HorzLine extends AbstLine {

	public HorzLine(int length) {super(length); }

	public String toString() {
		return "HorzLine(length：)" + getLength() + ")";
	}

	public void draw() {
		for (int i = 1; i <= getLength(); i++)
			System.out.print('-');
		System.out.println();
	}

}
