
public class Room {
	int number;
	int money;
	String pay;
	String requirement;
	
	public Room() {
	}
	
	public Room(int number, int money) {
		this.number = number;
		this.money = money;
	}
	
	public Room(int number, int money, String pay, String requirement) {
		this.number = number;
		this.money = money;
		this.pay = pay;
		this.requirement = requirement;
	}
	
	public void  printInfo() {
		System.out.println("number:"+number+" money:"+money+" pay method:"+ pay+" requirement:"+requirement);
	}

}
