import java.util.Random;

public class Warrior extends Base {

	Warrior() {
		super();
		this.hp = 150;
		this.power = 5;
		this.name = "전사";
		this.escapeRate = 20;
		this.criticalRate = 30;

	}

	@Override
	public void underAttack(int Atk) {
		Random random = new Random();
		int escape = random.nextInt(100) + 1;
		int critical = random.nextInt(100) + 1;
		int skill = random.nextInt(100) + 1;
		if (skill > 50) {
			System.out.println("사자의 기운이 " + this.name + "에게..방어력이 상승합니다.");
			Atk = Atk - 3;
		}
		if (escape > this.escapeRate) {
			System.out.println(this.name + "의 회피");
			return;
		}
		if (critical > this.criticalRate) {
			this.hp = this.hp - (Atk) * 2;
			System.out.println(this.name + "은 " + Atk + "만큼의 데미지를 받았다!");
		} else {
			this.hp = this.hp - Atk;
			System.out.println(this.name + "은 " + Atk + "만큼의 데미지를 받았다!");
		}
	}

}
