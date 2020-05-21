// ペットクラス

public class Pet {
	private String name;			// ペットの名前
	private String masterName;		// 飼い主の名前

	// コンストラクタ
	public Pet( String name, String masterName) {
		this.name = name;
		this.masterName = masterName;
	}

	// ペットの名前を調べる
	public String getName() { return name; }

	// 飼い主の名前を調べる
	public String getMasterName() { return masterName; }

	// 自己紹介
	public void introduce() {
		System.out.println("■僕の名前は" + name + "です！");
		System.out.println("■ご主人様は" + masterName + "です！");
	}
}

// ロボットペットクラス（ペットクラスをスーパークラスとする）
class RobotPet extends Pet implements Skinnable {
	// コンストラクタ
	private int skin = BLACK;

	public RobotPet(String name, String masterName) {
		super(name, masterName);
	}

	// 自己紹介
	@Override public void introduce() {
		System.out.println("◇私はロボット。名前は" + getName() + "。");
		System.out.println("◇ご主人様は" + getMasterName() + "。");
		System.out.println("◇色は" + Skinnable.colors[skin] + "。");
	}

	public void work(int sw) {
		switch (sw) {
		case 0: System.out.println("掃除します。"); break;
		case 1: System.out.println("選択します。"); break;
		case 2: System.out.println("炊事します。"); break;
		}
	}

	public void changeSkin(int skin) {
		System.out.print("色を");
		switch (skin) {
		case BLACK:	System.out.print("黒"); break;
		case RED:		System.out.print("赤"); break;
		case GREEN:	System.out.print("緑"); break;
		case BLUE:		System.out.print("青"); break;
		case LEOPARD:	System.out.print("豹柄"); break;
		default:		System.out.print("無地"); break;
		}
		System.out.println("に変更しました");
		this.skin = skin;
	}
}
