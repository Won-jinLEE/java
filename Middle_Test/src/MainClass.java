import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Store store = new Store();
		for (int i = 0; i < 9999999; i++) {
			System.out.println(
					"하고 싶은 작업을 입력해주세요. [1] 상품등록 [2] 상품 목록 출력 [3] 상품 통계 [4] 상품 정렬 [5] 구매서 작성 [6] 구매서 목록 조회 [7] 재고량 변경 [8] 구매서 수정 [q] 종료");
			String inputAction = scanner.nextLine();

			if (inputAction.equals("1")) {
				store.createGoods();
			}

			else if (inputAction.equals("2")) {
				store.goodsInfo();
			}

			else if (inputAction.equals("3")) {
				store.goodsStatistics();
			}

			else if (inputAction.equals("4")) {
				store.goodsSort();
			}

			else if (inputAction.equals("5")) {
				store.createBilge();
			}

			else if (inputAction.equals("6")) {
				store.bilgeInfo();
			}

			else if (inputAction.equals("7")) {
				store.inventoryChange();
			}

			else if (inputAction.equals("8")) {
				store.modifyBilge();
			}

			else if (inputAction.equals("q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			else {
				System.out.println("오입력 감지, 메뉴로 돌아갑니다.");
				continue;
			}

		}

	}
}
