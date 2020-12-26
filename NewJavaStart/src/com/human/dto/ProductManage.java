package com.human.dto;

import com.human.dto.Product;

public class ProductManage {
	public int allProdNum=0;//현재 있는 상품 종류의 수
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	public Product productArr[]=new Product[allProdNum];
	
	public ProductManage() {}
	
	public int searchIndex(String searchname) {
		int index=0;
		for(int i=0;i<productArr.length;i++) {//상품명 검색
			if(searchname.equals(productArr[i].name)) {
				index=i;
				break;
			}else {
				index=-1;//없는 상품
			}
		}
		return index;
	}
	public boolean isExist(int index) {
		if(index==-1) {
			System.out.println("존재하지 않는 상품입니다");
			return false;
		}else {
			return true;
		}
		
	}
	public void addProduct(Product newdata) {
		allProdNum++;//productArr의 크기를 한칸 늘린 새로운 임시배열에 옮겨담는다
		Product tempArr[]=new Product[allProdNum];
		for(int i=0;i<productArr.length;i++) {
			tempArr[i]=productArr[i];
		}
		tempArr[allProdNum-1]=newdata;
		productArr=tempArr;
	}
	public void addProduct() {
		//새로운 상품 정보를 입력받는다
		System.out.println("<<새로운 상품 등록>>");
		System.out.print("상품명 : ");
		String newProductName=scanner.nextLine();
		System.out.print("개수 : ");
		int newProductNum=Integer.parseInt(scanner.nextLine());
		addProduct(new Product(newProductName,newProductNum));
	}
	public void delProduct() {
		allProdNum--;//상품이 하나 줄었으니 productArr의 크기를 한칸 줄일 것이다
		Product newProductArr[]=new Product[allProdNum];
		System.out.println("<<상품 삭제>>");
		System.out.print("삭제할 상품명 : ");
		String delProductName=scanner.nextLine();
		int index=searchIndex(delProductName);//상품목록에서 검색된 index
		if (isExist(index)) {
			for (int i = 0; i < index; i++) {//검색된 index 제외한 나머지값을 새 임시배열에 저장
				newProductArr[i] = productArr[i];
			}
			for (int i = index; i < productArr.length; i++) {
				newProductArr[i] = productArr[i + 1];
			}
			productArr = newProductArr;
		}
	}
	public void display() {
		System.out.println("<<상품 검색>>");
		System.out.print("검색할 상품명 : ");
		String searchProductName=scanner.nextLine();
		int index=searchIndex(searchProductName);
		if(isExist(index)) {
			productArr[index].showState();
		}
		
	}
	public void displayAll() {
		System.out.println("<<재고확인>>");
		for(int i=0;i<productArr.length;i++) {
			productArr[i].showState();
		}
	}
	public void addProductStock() {
		System.out.println("<<재고량 추가>>");
		System.out.print("추가할 상품명 : ");
		String addName=scanner.nextLine();
		int index = searchIndex(addName);
		if(isExist(index)) {
			System.out.print("추가할 재고량 : ");
			int addNum=Integer.parseInt(scanner.nextLine());
			productArr[index].addStock(addNum);
			System.out.printf("%s %d개 추가됨%n",addName,addNum);
		}
	}
	public void delProductStock() {
		System.out.println("<<재고 출고>>");
		System.out.print("출고할 상품명 : ");
		String delName=scanner.nextLine();
		int index = searchIndex(delName);
		if(isExist(index)) {
			System.out.print("출고할 재고량 : ");
			int delNum=Integer.parseInt(scanner.nextLine());
			productArr[index].delStock(delNum);
			System.out.printf("%s %d개 출고됨%n",delName,delNum);
		}
	}
	public void runManage() {
		run:for(;;) {
			System.out.println("1.상품등록 2.상품삭제 3.입고 4.출고 5.상품검색 6.재고확인 7.종료");
			System.out.print("원하는 메뉴를 입력하세요 : ");
			int menuInput=Integer.parseInt(scanner.nextLine());
			switch (menuInput) {
			case 1:
				addProduct();
				break;
			case 2:
				delProduct();
				break;
			case 3:
				addProductStock();
				break;
			case 4:
				delProductStock();
				break;
			case 5:
				display();
				break;
			case 6:
				displayAll();
				break;
			case 7:
				System.out.println("종료합니다");
				break run;
			default:
				System.out.println("1~6사이의 정수를 입력하세요");
				break;
			}
		}
		
	}
	
	
}
