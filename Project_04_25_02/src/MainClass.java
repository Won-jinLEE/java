import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainClass {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();
      Base[] champion = new Base[6];
      ArrayList<String> rank = new ArrayList<String>();
      String winner = "";
      System.out.println("게임을 시작하겠습니까?(y/n)");
      String inputString = scanner.nextLine();
      if (inputString.equals("y")) {
         System.out.println("게임이 시작되었습니다.");
         champion[0] = new Archer();
         champion[1] = new Warrior();
         champion[2] = new Wizard();
         champion[3] = new Breserker();
         champion[4] = new Masochist();
         champion[5] = new Druger();
         int count = 0;
         for (int i = 0; i < 99999; i++) {
            if (count == 5) {
               for(int j =0; j<champion.length; j++) {
                  if(champion[j]!=null) {
                     winner = champion[j].name;
                  }
               }
               break;
            }
            String stopString = scanner.nextLine();
            System.out.println((i + 1) + "번째 전투가 시작되었습니다.");
            for (int j = 0; j < champion.length; j++) {
               if (champion[j] != null) {
                  if (champion[j].live == false) {
                     System.out.println(champion[j].name + "은 사망하였습니다...!");
                     rank.add(champion[j].name);
                     champion[j] = null;
                     count = count +1;
                     continue;
                  }
               }
               if (champion[j] != null) {
                  System.out.println(champion[j].name + "가 공격당할 차례");
               }
               for (int k = 0; k < champion.length; k++) {
                  if (j != k && champion[k] != null && champion[j] != null) {
                     System.out.println(champion[k].name + "가 공격합니다.");
                     champion[j].underAttack(champion[k].power);
                     champion[j].isLive();
                  }
               }
            }
         }

      } else if (inputString.equals("n")) {
         System.out.println("종료되었습니다.");
      }
      
      System.out.println("1등 : "+winner+" 2등 : "+rank.get(4)+" 3등 : "+rank.get(3)+" 4등 : "+rank.get(2)+" 5등 : "+rank.get(1)+" 6등 : "+rank.get(0));
   }
}