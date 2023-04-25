import java.util.Random;

public class Druger extends Base {

	Druger() {
		this.hp = 50;
		this.power = 5;
		this.name = "약쟁이";
		this.escapeRate = 30;
		this.criticalRate = 50;
	}

	@Override
	public void underAttack(int ATK) {
		Random random = new Random();
		int escape = random.nextInt(100) + 1;
		int critical = random.nextInt(100) + 1;
		int beer = random.nextInt(5) + 1;
		if (escape > this.escapeRate) {
			System.out.println(this.name + "는 회피 후에 여유를 부리면서 맥주를 마셨다.");
			this.hp = this.hp + beer;
			System.out.println(this.name + "는 음주를 통해 " + beer + "만큼의 hp 회복");
			return;
		}
		if (critical > this.criticalRate) {
			this.hp = this.hp - (ATK) * 2;
			System.out.println(this.name + "는 " + ATK + "만큼의 데미지를 받았다!");
		} else {
			this.hp = this.hp - (ATK);
			System.out.println(this.name + "는 " + ATK + "만큼의 데미지를 받았다!");
		}
	}
}
