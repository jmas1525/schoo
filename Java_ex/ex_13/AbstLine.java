// 図形クラス群の、直線を表す抽象クラス
public abstract class AbstLine extends Shape {
	private int length;

	public AbstLine(int length) {
		setLength(length);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String toString() {
		return "AbstLine(length：)" + length + ")";
	}

}
