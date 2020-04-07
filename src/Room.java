
public class Room {
	int number;
	int money;
	String pay;
	String requirement;
	static int numRoomsRegistered = 0;
	
	public Room() {
		numRoomsRegistered++;
	}
	
	public Room(int number, int money) {
		this.number = number;
		this.money = money;
		numRoomsRegistered++;
	}
	
	public Room(int number, int money, String pay, String requirement) {
		this.number = number;
		this.money = money;
		this.pay = pay;
		this.requirement = requirement;
		numRoomsRegistered++;
	}
	
	public void  printInfo() {
		System.out.println("number:"+number+" money:"+money+" pay method:"+ pay+" requirement:"+requirement);
	}

}
