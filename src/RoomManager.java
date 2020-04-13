import java.util.ArrayList;
import java.util.Scanner;

import room.CoinRoom;
import room.Room;

public class RoomManager {
	ArrayList<Room> rooms = new ArrayList<Room>();
	Scanner input;
	RoomManager(Scanner input){
		this.input = input;
	}
	
	public void addRoom() {
		int kind=0;
		Room room;
		while (kind !=1 && kind !=2) {
			System.out.print(" 1 for Coin ");
			System.out.print(" 2 for Half_hour ");
			System.out.print(" Select num for Room Kind between 1 and 2: ");
			kind = input.nextInt();
			if (kind == 1) {
				room = new CoinRoom();
				room.getUserInput(input);
				rooms.add(room);
				break;
			}
			else if (kind ==2){
				room = new Room();
				room.getUserInput(input);
				rooms.add(room);
				break;
			}
			else {
				System.out.print("Select num for Room Kind between 1 and 2:");
			}
		}
	}
	
	public void deleteRoom() {
		System.out.print("Room Number:");
		int roomNum=input.nextInt();
		int index = -1;
		for (int i = 0; i<rooms.size(); i++) {
			if (rooms.get(i).getNumber() == roomNum) {
				index = i;
				break;
			}
		}
		if (index >= 0) {
			rooms.remove(index);
			System.out.println("the room "+ roomNum+" is deleted");
		}
		else {
			System.out.println("the room has not been registered");
			return;	
		}	
	}
	
	public void editRoom() {		
		System.out.print("Room Number:");
		int roomNum=input.nextInt();
		for (int i = 0; i<rooms.size(); i++) {
			Room room = rooms.get(i);
		if (room.getNumber() == roomNum) {
			int num =-1;
			while(num !=5) {
				System.out.println("** Room Info EditMenu ** ");
				System.out.println(" 1. Edit Room Number ");
				System.out.println(" 2. Edit Money ");
				System.out.println(" 3. Edit Pay Method ");
				System.out.println(" 4. Edit Requirements ");
				System.out.println(" 5. Exit ");
				System.out.println(" Select one number between 1-5 : ");
				num=input.nextInt();
				if (num==1) {
					System.out.print("Room Number:");
					int number =input.nextInt();
					room.setNumber(number);
				}
				else if (num==2) {
					System.out.print("Received Amount:");
					int money =input.nextInt();
					room.setMoney(money);
				}
				else if (num==3) {
					System.out.print("Payment method:");
					String pay=input.next();
					room.setPay(pay);
			    }
				else if (num==4) {
					System.out.print("Requirements:");
					String requirement=input.next();
					room.setRequirement(requirement);
			    }
				else {
					continue;
				} //if
			} //while
			break;
		  } //if
		} //for
	}
	
    public void viewRooms() {
//		System.out.print("Room Number:");
//		int roomNum=input.nextInt();
    	System.out.println("# of registered rooms:" + rooms.size());
		for (int i = 0; i<rooms.size(); i++) {
			rooms.get(i).printInfo();
		}
	}
}
