import java.util.ArrayList;
import java.util.Scanner;

public class RoomManager {
	ArrayList<Room> rooms = new ArrayList<Room>();
	Scanner input;
	RoomManager(Scanner input){
		this.input = input;
	}
	
	public void addRoom() {
		Room room = new Room();
		System.out.print("Room Number:");
		room.number =input.nextInt();
		System.out.print("Received Amount:");
		room.money =input.nextInt();
		System.out.print("Payment method:");
		room.pay=input.next();
		System.out.print("Requirements:");
		room.requirement=input.next();
		rooms.add(room);
	}
	
	public void deleteRoom() {
		System.out.print("Room Number:");
		int roomNum=input.nextInt();
		int index = -1;
		for (int i = 0; i<rooms.size(); i++) {
			if (rooms.get(i).number == roomNum) {
				index = i;
				break;
			}
		}
		if (index >= 0) {
			rooms.remove(index);
			Room.numRoomsRegistered--;
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
		if (room.number == roomNum) {
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
					room.number =input.nextInt();
				}
				else if (num==2) {
					System.out.print("Received Amount:");
					room.money =input.nextInt();
				}
				else if (num==3) {
					System.out.print("Payment method:");
					room.pay=input.next();
			    }
				else if (num==4) {
					System.out.print("Requirements:");
					room.requirement=input.next();
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
    	System.out.println("# of registered rooms:" +Room.numRoomsRegistered);
		for (int i = 0; i<rooms.size(); i++) {
			rooms.get(i).printInfo();
		}
	}
}
