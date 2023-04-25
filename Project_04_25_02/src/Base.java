import java.util.Random;

public class Base {
	int hp;
	int power;
	String name;
	int escapeRate;
	int criticalRate;
	boolean live = true;
	
	Base() {
		this.hp = 100;
		this.name = "기본";
	}
	
	public void underAttack(int ATK) {
		Random random = new Random();
		int escape = random.nextInt(100) + 1;
		int critical = random.nextInt(100) + 1;
		if (escape > this.escapeRate) {
			System.out.println("회피");
			return;
		}
		if (critical > this.criticalRate) {
			this.hp = this.hp - (ATK) * 2;
		} else {
			this.hp = this.hp - ATK;
		}
	}

	public boolean isLive() {
		if (this.hp < 1) {
			return this.live = false;
		}
		return this.live = true;
	}

	@Override
	public String toString() {
		if (this.isLive()) {
			return this.name + " (" + this.hp + ")";
		}
		return this.name + " is dead";
	}
}
