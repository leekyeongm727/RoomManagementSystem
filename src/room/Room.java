package room;

import java.io.Serializable;
import java.util.Scanner;

import exceptions.RequirementFormatException;

public abstract class Room implements RoomInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8116529501112589592L;
	protected RoomKind kind = RoomKind.Half_hour; 
	protected int number;
	protected int money;
	protected String pay;
	protected String requirement;

	public Room() {
	}

	public Room(RoomKind kind) {
		this.kind=kind;
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

	public Room(RoomKind kind, int number, int money, String pay, String requirement) {
		this.kind = kind;
		this.number = number;
		this.money = money;
		this.pay = pay;
		this.requirement = requirement;
	}

	public RoomKind getKind() {
		return kind;
	}

	public void setKind(RoomKind kind) {
		this.kind = kind;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public String getRequirement() {
		return requirement;
	}

	public void setRequirement(String requirement) throws RequirementFormatException {
		if (!requirement.contains("-")&& !requirement.contentEquals("")) {
			throw new RequirementFormatException();
		}
		this.requirement = requirement;
	}

	public abstract void  printInfo();

	public void setRoomNumber(Scanner input) {
		System.out.print("Room Number:");
		int number =input.nextInt();
		this.setNumber(number);
	}

	public void setRoomMoney(Scanner input) {
		System.out.print("Received Amount:");
		int money =input.nextInt();
		this.setMoney(money);
	}

	public void setRoomPay(Scanner input) {
		System.out.print("Payment method:");
		String pay=input.next();
		this.setPay(pay);
	}

	public void setRoomRequirements(Scanner input) {
		System.out.print("Requirements:");
		String requirement=input.next();
		try {
			this.setRequirement(requirement);
		} catch(RequirementFormatException e) {
			e.printStackTrace();
		}
	}

	public String getKindString() {
		String skind = "none";
		switch(this.kind) {
		case Coin:
			skind="Coin";
			break;
		case Half_hour:
			skind="30 minutes";
			break;
		case One_hour:
			skind="1 hour";
			break;
		case Eighty_minutes:
			skind="80 minutes";
			break;
		default:		
		}
		return skind;
	}
}

