import java.util.Random;

public class Breserker extends Base {
	Breserker() {
		this.hp = 100;
		this.power = 25;
		this.name = "광전사";
		this.escapeRate = 100;
		this.criticalRate = 80;
	}

	@Override
	public void underAttack(int ATK) {
		Random random = new Random();
		int escape = random.nextInt(100) + 1;
		int critical = random.nextInt(100) + 1;
		if (escape > this.escapeRate) {
			System.out.println("상남자가 회피를 왜 함?");
			return;
		}
		if (critical > this.criticalRate) {
			this.hp = this.hp - (ATK) * 3;
			System.out.println(this.name + "는 " + ATK + "만큼의 데미지를 받았다!");
		} else {
			this.hp = this.hp - (ATK) * 2;
			System.out.println(this.name + "는 " + ATK + "만큼의 데미지를 받았다!");
		}
	}
}
