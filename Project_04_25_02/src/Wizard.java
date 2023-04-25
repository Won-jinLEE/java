import java.util.Random;

public class Wizard extends Base {
	Wizard() {
		super();
		this.hp = 150;
		this.power = 5;
		this.name = "마법사";
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
			System.out.println(this.name + "에게 여신의 축복발동이 내려왔다...! 회피 확률이 올라갑니다.");
			escape = escape - 10;
		}
		if (escape > this.escapeRate) {
			System.out.println(this.name + "의 회피");
			return;
		}
		if (critical > this.criticalRate) {
			this.hp = this.hp - (Atk) * 2;
			System.out.println(this.name + "는 " + Atk + "만큼의 데미지를 받았다!");
		} else {
			this.hp = this.hp - Atk;
			System.out.println(this.name + "는 " + Atk + "만큼의 데미지를 받았다!");
		}
	}
}
