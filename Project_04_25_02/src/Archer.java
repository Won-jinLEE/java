import java.util.Random;

public class Archer extends Base {
	Archer() {
		super();
		this.hp = 150;
		this.power = 5;
		this.name = "궁수";
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
			System.out.println(this.name + "의 피닉스 소환.. 크리티컬 저항률 확률  상승");
			critical = critical - 10;
		}
		if (escape > this.escapeRate) {
			System.out.println(this.name + "은 공격을 회피하였다");
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
