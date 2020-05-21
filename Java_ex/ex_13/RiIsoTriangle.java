// 直角二等辺三角形を表すクラス群

// 直角二等辺三角形を表す抽象クラス
public abstract class RiIsoTriangle extends Shape {
	private int equalSideLength;		// 等辺の長さ

	public RiIsoTriangle(int equalSideLength) {
		this.equalSideLength = equalSideLength;
	}

	public int getEqualSideLength() {
		return equalSideLength;
	}

	public void setEqualSideLeingth(int equalSideLength) {
		this.equalSideLength = equalSideLength;
	}
}

// 右上直角二等辺三角形クラス
class UpRiIsoTriangle extends RiIsoTriangle {

	public UpRiIsoTriangle(int equalSideLength) {
		super(equalSideLength);
	}

	public String toString() {
		return "UpRiIsoTriangle(equalSideLength：)" + getEqualSideLength() + ")";
	}

	public void draw() {
		for (int i = 1; i <= getEqualSideLength(); i++) {
			for (int j = 1; j <= getEqualSideLength(); j++) {

				if (j <= i - 1)  System.out.print(" ");
				else         System.out.print('*');
			}
			System.out.println();
		}
	}
}

//右下直角二等辺三角形クラス
class LowRiIsoTriangle extends RiIsoTriangle {

	public LowRiIsoTriangle(int equalSideLength) {
		super(equalSideLength);
	}

	public String toString() {
		return "LowRiIsoTriangle(equalSideLength：)" + getEqualSideLength() + ")";
	}

	public void draw() {
		for (int i = getEqualSideLength(); i >= 1; i--) {
			for (int j = 1; j <= getEqualSideLength(); j++) {

				if (j <= i - 1)  System.out.print(" ");
				else         System.out.print('*');
			}
			System.out.println();
		}
	}
}

//左上直角二等辺三角形クラス
class UpLeIsoRiTriangle extends RiIsoTriangle {

	public UpLeIsoRiTriangle(int equalSideLength) {
		super(equalSideLength);
	}

	public String toString() {
		return "UpLeIsoRiTriangle(equalSideLength：)" + getEqualSideLength() + ")";
	}

	public void draw() {
		for (int i = getEqualSideLength(); i >= 1; i--) {
			for (int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}

//左上直角二等辺三角形クラス
class LowLeIsoRiTriangle extends RiIsoTriangle {

	public LowLeIsoRiTriangle(int equalSideLength) {
		super(equalSideLength);
	}

	public String toString() {
		return "LowLeIsoRiTriangle(equalSideLength：)" + getEqualSideLength() + ")";
	}

	public void draw() {
		for (int i = 1; i <= getEqualSideLength(); i++) {
			for (int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}