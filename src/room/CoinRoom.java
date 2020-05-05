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
	

}
