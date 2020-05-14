package room;

import java.util.Scanner;

public class One_hourRoom extends LongTermRoom {
	
	public One_hourRoom(RoomKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setRoomNumber(input);
		setRoomMoney(input);
		setRoomPay(input);
		setRoomRequirements(input);
	}
	
}
