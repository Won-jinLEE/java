import java.util.Scanner;

public class Store {
	Goods goods[] = new Goods[1000];
	Bilge bilge[] = new Bilge[1000];
	int goodsCount = 0;
	int bilgeCount = 0;

	public void createGoods() {
		goods[goodsCount] = new Goods();
		goods[goodsCount].registration();
		System.out.println("등록하신 상품의 정보 : ");
		goods[goodsCount].info();
		goodsCount = goodsCount + 1;
	}

	public void goodsInfo() {
		if (goodsCount == 0) {
			System.out.println("등록된 상품이 없습니다.");
			return;
		} else {
			System.out.println("현재 등록된 상품의 정보는 ");
			System.out.println();
			for (int j = 0; j < goodsCount; j++) {
				goods[j].info();
			}
		}
	}

	public void goodsStatistics() {
		if (goodsCount == 0) {
			System.out.println("등록된 상품이 없습니다.");
			return;
		} else {
			double fullPrice = 0;
			for (int j = 0; j < goodsCount; j++) {
				fullPrice = fullPrice + goods[j].price;
			}
			double avgPrice = (fullPrice / (double) goodsCount);
			System.out.println("현재 상품은 " + goodsCount + "개가 등록되어있고, 평균 가격은 " + avgPrice + "원입니다.");
			System.out.println();
		}
	}

	public void goodsSort() {
		Scanner scanner = new Scanner(System.in);
		if (goodsCount == 0) {
			System.out.println("등록된 상품이 없습니다.");
			return;
		} else {
			System.out.println("정렬 방법을 선택해주세요.[1] 높은 가격순 [2] 낮은 가격순 [3] 할인율 높은순[4] 할인율 낮은순");
			String inputAction2 = scanner.nextLine();
			Goods tmp = new Goods();
			if (inputAction2.equals("1")) {
				for (int j = 0; j < goodsCount; j++) {
					for (int k = 0; k < goodsCount; k++) {
						if (j != k && goods[j].price > goods[k].price) {
							tmp = goods[j];
							goods[j] = goods[k];
							goods[k] = tmp;
						}
					}
				}
				System.out.println("높은 가격순으로 정렬 후 상품의 정보는 : ");
				System.out.println();
				for (int j = 0; j < goodsCount; j++) {
					goods[j].info();
				}
			}

			else if (inputAction2.equals("2")) {
				for (int j = 0; j < goodsCount; j++) {
					for (int k = 0; k < goodsCount; k++) {
						if (j != k && goods[j].price < goods[k].price) {
							tmp = goods[j];
							goods[j] = goods[k];
							goods[k] = tmp;
						}
					}
				}
				System.out.println("낮은 가격순으로 정렬 후 상품의 정보는 : ");
				System.out.println();
				for (int j = 0; j < goodsCount; j++) {
					goods[j].info();
				}
			}

			else if (inputAction2.equals("3")) {
				for (int j = 0; j < goodsCount; j++) {
					for (int k = 0; k < goodsCount; k++) {
						if (j != k && goods[j].discount > goods[k].discount) {
							tmp = goods[j];
							goods[j] = goods[k];
							goods[k] = tmp;
						}
					}
				}
				System.out.println("높은 할인율순으로 정렬 후 상품의 정보는 : ");
				System.out.println();
				for (int j = 0; j < goodsCount; j++) {
					goods[j].info();
				}
			}

			else if (inputAction2.equals("4")) {
				for (int j = 0; j < goodsCount; j++) {
					for (int k = 0; k < goodsCount; k++) {
						if (j != k && goods[j].discount < goods[k].discount) {
							tmp = goods[j];
							goods[j] = goods[k];
							goods[k] = tmp;
						}
					}
				}
				System.out.println("낮은 할인율순으로 정렬 후 상품의 정보는 : ");
				System.out.println();
				for (int j = 0; j < goodsCount; j++) {
					goods[j].info();
				}
			}

		}
	}

	public void createBilge() {
		Scanner scanner = new Scanner(System.in);
		if (goodsCount == 0) {
			System.out.println("등록된 상품이 없습니다.");
			return;
		} else {
			bilge[bilgeCount] = new Bilge();
			System.out.println("구매하실 상품을 골라주세요");
			for (int j = 0; j < goodsCount; j++) {
				System.out.println();
				System.out.println((j + 1) + "번 상품");
				System.out.println();
				goods[j].info();
				System.out.println();
			}
			String inputGoodsValue = scanner.nextLine();
			int goodsValue = Integer.parseInt(inputGoodsValue) - 1;
			if (goods[goodsValue].inventory == 0) {
				System.out.println("고르신 상품은 품절입니다.");
				return;
			} else {
				bilge[bilgeCount].inputInfo2(goods[goodsValue].name,
						goods[goodsValue].price - (goods[goodsValue].price * goods[goodsValue].discount));
				bilge[bilgeCount].inputInfo1();
				bilgeCount = bilgeCount + 1;
				goods[goodsValue].sell();
			}
		}
	}

	public void bilgeInfo() {
		if (bilgeCount == 0) {
			System.out.println("등록된 구매서가 없습니다.");
			return;
		} else {
			for (int j = 0; j < bilgeCount; j++) {
				System.out.println((j + 1) + "번 구매서");
				System.out.println();
				bilge[j].info();
				System.out.println();
			}
		}
	}

	public void inventoryChange() {
		if (goodsCount == 0) {
			System.out.println("등록된 상품이 없습니다.");
			return;
		} else {
			System.out.println("몇번 상품의 재고량을 바꾸시겠습니까?");
			for (int i = 0; i < goodsCount; i++) {
				System.out.println();
				System.out.println((i + 1) + "번 상품");
				goods[i].info();
				System.out.println();
			}
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			int goodsValue = Integer.parseInt(input) - 1;
			goods[goodsValue].Change();
		}
	}

	public void modifyBilge() {
		if (bilgeCount == 0) {
			System.out.println("등록된 구매서가 없습니다.");
			return;
		} else {
			for (int j = 0; j < bilgeCount; j++) {
				System.out.println((j + 1) + "번 구매서");
				System.out.println();
				bilge[j].info();
				System.out.println();
			}

			Scanner scanner = new Scanner(System.in);
			System.out.println("몇번 구매서를 수정하시겠습니까?(연락처, 주소만 수정가능)");
			String input = scanner.nextLine();
			int bilgeValue = Integer.parseInt(input) - 1;
			bilge[bilgeValue].modify();
		}
	}

}
