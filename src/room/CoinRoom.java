package room;

import java.util.Scanner;

public class CoinRoom extends Room {
	
	public CoinRoom(RoomKind kind) {
		super(kind);
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

	}

}
