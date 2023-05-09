import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainClass {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();
      ArrayList<Base> champion = new ArrayList<Base>();
      ArrayList<String> rank = new ArrayList<String>();
      String winner = "";
      System.out.println("게임을 시작하겠습니까?(y/n)");
      String inputString = scanner.nextLine();
      if (inputString.equals("y")) {
         System.out.println("게임이 시작되었습니다.");
         champion.add(new Archer());
         champion.add(new Warrior());
         champion.add(new Wizard());
         champion.add(new Breserker());
         champion.add(new Masochist());
         champion.add(new Druger());
         int count = 0;
         for (int i = 0; i < 99999; i++) {
            if (count == 5) {
               for(int j =0; j<champion.size(); j++) {
                  if(champion.get(j)!=null) {
                     winner = champion.get(j).name;
                  }
               }
               break;
            }
            String stopString = scanner.nextLine();
            System.out.println((i + 1) + "번째 전투가 시작되었습니다.");
            for (int j = 0; j < champion.size(); j++) {
               if (champion.get(j)!=null) {
                  if (champion.get(j).live == false) {
                     System.out.println(champion.get(j).name + "은 사망하였습니다...!");
                     rank.add(champion.get(j).name);
                     champion.set(j, null);
                     count = count +1;
                     continue;
                  }
               }
               if (champion.get(j)!=null) {
                  System.out.println(champion.get(j).name + "가 공격당할 차례");
               }
               for (int k = 0; k < champion.size(); k++) {
                  if (j != k && champion.get(k) != null && champion.get(j) != null) {
                     System.out.println(champion.get(k).name + "가 공격합니다.");
                     champion.get(j).underAttack(champion.get(k).power);
                     champion.get(j).isLive();
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