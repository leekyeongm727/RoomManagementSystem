package room;

import java.util.Scanner;

public class CoinRoom extends LongTermRoom {
	
	public CoinRoom(RoomKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setRoomNumber(input);
		setRoomMoney(input);
		setRoomPay(input);
		setRoomRequirementwithYN(input);
	}
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:"+skind+" number:"+number+" money:"+money+" pay method:"+ pay+" requirement:"+requirement);
	}
	

}
