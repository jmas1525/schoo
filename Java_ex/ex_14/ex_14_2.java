
public class ex_14_2 {

	public static void main(String[] args) {
		RobotPet rob = new RobotPet("アン", "トニオ");

		rob.introduce();
		rob.changeSkin(Skinnable.RED);
		rob.introduce();
		rob.work(2);

	}
}
