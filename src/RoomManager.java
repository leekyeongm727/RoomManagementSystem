import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import room.CoinRoom;
import room.Eighty_minutesRoom;
import room.One_hourRoom;
import room.Room;
import room.RoomInput;
import room.RoomKind;

public class RoomManager {
	ArrayList<RoomInput> rooms = new ArrayList<RoomInput>();
	Scanner input;
	RoomManager(Scanner input){
		this.input = input;
	}

	public void addRoom() {
		int kind=0;
		RoomInput roomInput;
		while (kind <1 || kind >3) {
			try { 
				System.out.println(" 1 for Coin ");
				System.out.println(" 2 for One_hour");
				System.out.println(" 3 for Eighty_minutes ");
				System.out.print(" Select num 1, 2, or 3 for Room Kind: ");
				kind = input.nextInt();
				if (kind == 1) {
					roomInput = new CoinRoom(RoomKind.Coin);
					roomInput.getUserInput(input);
					rooms.add(roomInput);
					break;
				}
				else if (kind ==2){
					roomInput = new One_hourRoom(RoomKind.One_hour);
					roomInput.getUserInput(input);
					rooms.add(roomInput);
					break;
				}
				else if (kind ==3){
					roomInput = new Eighty_minutesRoom(RoomKind.Eighty_minutes);
					roomInput.getUserInput(input);
					rooms.add(roomInput);
					break;
				}
				else {
					System.out.print("Select num for Room Kind between 1 and 2:");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}

	public void deleteRoom() {
		System.out.print("Room Number:");
		int roomNum=input.nextInt();
		int index = findIndex(roomNum);
		removefromRooms(index, roomNum);
	}

	public int findIndex(int roomNum) {
		int index = -1;
		for (int i = 0; i<rooms.size(); i++) {
			if (rooms.get(i).getNumber() == roomNum) {
				index = i;
				break;
			}
		}
		return index;
	}

	public int removefromRooms(int index,int roomNum) {
		if (index >= 0) {
			rooms.remove(index);
			System.out.println("the room "+ roomNum+" is deleted");
			return 1;
		}
		else {
			System.out.println("the room has not been registered");
			return -1;	
		}	
	}

	public void editRoom() {	
		System.out.print("Room Number:");
		int roomNum=input.nextInt();
		for (int i = 0; i<rooms.size(); i++) {
			RoomInput room = rooms.get(i);
			if (room.getNumber() == roomNum) {
				int num =-1;
				while(num !=5) {
					showEditMenu();
					num=input.nextInt();
					switch(num){
					case 1:
						room.setRoomNumber(input);
						break;
					case 2:
						room.setRoomMoney(input);
						break;
					case 3:
						room.setRoomPay(input);
						break;
					case 4:
						room.setRoomRequirements(input);
						break;
					default:
						continue;
					}
				} //while
				break;
			} //if
		} //for
	}

	public void viewRooms() {
		System.out.println("# of registered rooms:" + rooms.size());
		for (int i = 0; i<rooms.size(); i++) {
			rooms.get(i).printInfo();
		}
	}



	public void showEditMenu() {
		System.out.println("** Room Info EditMenu ** ");
		System.out.println(" 1. Edit Room Number ");
		System.out.println(" 2. Edit Money ");
		System.out.println(" 3. Edit Pay Method ");
		System.out.println(" 4. Edit Requirements ");
		System.out.println(" 5. Exit ");
		System.out.println(" Select one number between 1-5 : ");
	}
}
