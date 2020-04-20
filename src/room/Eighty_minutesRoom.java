package room;

import java.util.Scanner;

public class Eighty_minutesRoom extends Room {
	
	protected String dutch_pay;
	protected String co_requirement;
	
	public Eighty_minutesRoom(RoomKind kind) {
		this.kind=kind;
	}

	public void getUserInput(Scanner input) {
		System.out.print("Room Number:");
		int number =input.nextInt();
		this.setNumber(number);

		System.out.print("Received Amount:");
		int money =input.nextInt();
		this.setMoney(money);

		System.out.print("Payment method:");
		String pay=input.next();
		this.setPay(pay);

		char answer ='x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have requirements? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer =='Y') {
				System.out.print("Requirements:");
				String requirement=input.next();
				this.setRequirement(requirement);
				break;
			}
			else if (answer == 'n' || answer =='N') {
				this.setRequirement("");
				break;
			}
			else {
			}
		}
		answer ='x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have a team who came with ? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer =='Y') {
				System.out.print("room number who came with:");
				String requirement=input.next();
				this.setRequirement(requirement);
				break;
			}
			else if (answer == 'n' || answer =='N') {
				this.setRequirement("");
				break;
			}
			else {
			}
		}

	}
	
	public void  printInfo() {
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
		System.out.println("kind:"+skind+" number:"+number+" money:"+money+" pay method:"+ pay+" requirement:"+requirement+"  dutch_pay:"+ pay+" team_came_with:"+requirement);
	}
}
