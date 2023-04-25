import java.util.Random;

public class Masochist extends Base {
	Masochist() {
		this.hp = 150;
		this.power = 0;
		this.name = "변태";
		this.escapeRate = 100;
		this.criticalRate = 20;
	}

	@Override
	public void underAttack(int ATK) {
		Random random = new Random();
		int escape = random.nextInt(100) + 1;
		int critical = random.nextInt(100) + 1;
		int goodATK = random.nextInt(5) + 1;
		int goodRecover = random.nextInt(10) + 1;
		int normalATK = random.nextInt(3) + 1;
		int normalRecover = random.nextInt(5) + 1;
		if (escape > this.escapeRate) {
			System.out.println("앤 회피하면 안되는데?");
			return;
		}
		if (critical > this.criticalRate) {
			this.hp = this.hp - (ATK) * 2;
			this.power = this.power + goodATK;
			this.hp = this.hp + goodRecover;
			System.out.println(this.name + "는 " + ATK + "만큼의 데미지를 받았다!");
			System.out
					.println(this.name + "는 기분이 많이 좋아져서 공격력이 " + goodATK + "만큼 상승하고 체력이 " + goodRecover + "만큼 회복되었다!");
		} else {
			this.hp = this.hp - (ATK);
			this.power = this.power + normalATK;
			this.hp = this.hp + normalRecover;
			System.out.println(this.name + "는 " + ATK + "만큼의 데미지를 받았다!");
			System.out.println(
					this.name + "는 기분이 적당히 좋아져서 공격력이 " + normalATK + "만큼 상승하고 체력이 " + normalRecover + "만큼 회복되었다!");
		}
	}
}
