package oop0319;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

class Product { //extends Object (자바의 최고 조상)
	public int price; //상품가격
	public int bonusPoint; //마일리지
	public Product() {}
	public Product(int price) {
		this.price = price;
		this.bonusPoint = (int)(price*0.1);
	}
	
}
class SmartTV extends Product{
	public SmartTV() {
		super(100); //부모의 생성자함수 호출해서 가격 초기값 잡아준당
		//보너스 포인트는 자동으루~
	}
	@Override
	public String toString() {
		return "스마트티비";
	}
}
class Notebook extends Product{
	public Notebook(){
		super(200);
	}
	@Override
	public String toString() {
		return "노트북";
	}
}
class Handphone extends Product{
	public Handphone() {
		super(150);
	}

	@Override
	public String toString() {
		return "핸드폰";
	}
	
}

//상품 구매하는 사람
class Buyer{
	private int myMoney = 1000;
	private int myMilige = 0;
	//구매목록
	private List<Product> items = new ArrayList();
	private Product[] list = new Product[10];
	private int i = 0;
	
	public void buy(Product product) {
		
		if(myMoney < product.price) {
			System.out.println("잔액이 부족합니다.");
		}else {
			this.myMoney -= product.price;
			this.myMilige += product.bonusPoint;
			items.add(product);
			list[i++]= product;
			
			System.out.println(product.toString() + " 을/를 구매하였습니다.");
		}
		
	}
	public void disp() {
		System.out.println("남은 재산 : " + this.myMoney);
		System.out.println("마일리지 : " + this.myMilige);
		System.out.print("구매 목록 : ");
		items.forEach((i)-> System.out.print(i.toString() + ", "));
		items.forEach(i->System.out.println(" 사용 재산 : "+ i.price+" "));
	}
	
	public void disp2() {
		StringBuilder shoplist = new StringBuilder();
		int hap = 0;
		
		for(int n =0; n<list.length ; n++ ) {
			if(list[n]==null) {
				break;
			}
			shoplist.append(list[n].toString() + " ");
			hap += list[n].price;
		}
		System.out.println("사용 재산2 : "+ hap);
		System.out.println("구매 목록 2 : " + shoplist);
	}
}

class Order{
	private int myMoney = 1000;
	private int myMileage = 0;
	
	Vector<Product> items = new Vector();
	public void disp() {
		System.out.print("order 목록 :");
		items.stream().distinct().forEach(i -> System.out.print(i+ " "));
		System.out.println();
		System.out.println("마일리지 : " + myMileage);
		int hap = items.stream().mapToInt(i -> i.price).sum();
		System.out.println("사용재산 : " + hap);
	};
	public void buy(Product product) {
		if(product.price> myMoney) {
			System.out.println("잔액이 부족합니다!");
			return;
		}
		myMoney-=product.price;
		myMileage += product.bonusPoint;
		items.add(product);
	}
	public void refund(Product product) {
		if(items.contains(product)) {
		myMoney += product.price;
		myMileage -= product.bonusPoint;
		System.out.println("반품에 성공하였습니다. ");
		System.out.println("남은 재산 : " + myMoney);
		System.out.println("마일리지 : " + myMileage);
		}
		else System.out.println("구매한 적이 없습니다. ");
			return;
		
	};
}
public class Test01_Buyer {

	public static void main(String[] args) {
		SmartTV smartTV= new SmartTV();
		Notebook notebook = new Notebook();
		Handphone handphone = new Handphone();
		
		Buyer kim = new Buyer();
		kim.buy(smartTV);
		kim.buy(smartTV);
		kim.buy(notebook);
		kim.buy(handphone);
		kim.buy(handphone);
		kim.buy(handphone);
	
		
		kim.disp();
		System.out.println("------------------------------");
		kim.disp2();
		
		System.out.println("------------------------------");
		Order order = new Order();
		order.buy(handphone);
		order.buy(handphone);
		order.buy(smartTV);
		order.buy(notebook);
		order.buy(notebook);
		
		order.disp();
		System.out.println("----------------------------반품");
		order.refund(notebook);
	}
}
