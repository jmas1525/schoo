// 着せ替えインターフェース

public interface Skinnable {
	int BLACK = 0;			// 黒
	int RED = 1;			// 赤
	int GREEN = 2;			// 緑
	int BLUE = 3;			// 青
	int LEOPARD = 4;		// 豹柄
	String[] colors = {"黒", "赤", "緑", "青", "豹柄"};
	void changeSkin(int Skin);		// ★スキン変更
}
