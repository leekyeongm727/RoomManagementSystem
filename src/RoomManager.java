import java.util.Scanner;

public class RoomManager {
	Room room;
	Scanner input;
	RoomManager(Scanner input){
		this.input = input;
	}
	
	public void addRoom() {
		room = new Room();
		System.out.print("Room Number:");
		room.number =input.nextInt();
		System.out.print("Received Amount:");
		room.money =input.nextInt();
		System.out.print("Payment method:");
		room.pay=input.next();
		System.out.print("Requirements:");
		room.requirement=input.next();


	}
	
	public void deleteRoom() {
		System.out.print("Room Number:");
		int roomNum=input.nextInt();
		if (room == null) {
			System.out.println("the room has not been registered");
			return;
		}
		if (room.number == roomNum) {
			room  = null;
			System.out.println("the room is deleted");
		}
	}
	
	public void editRoom() {		
		System.out.print("Room Number:");
		int roomNum=input.nextInt();
		if (room.number == roomNum) {
			System.out.println("the room to be edited is "+roomNum);
		}
	}
	
    public void viewRoom() {
		System.out.print("Room Number:");
		int roomNum=input.nextInt();
		if (room.number == roomNum) {
			room.printInfo();
		}
	}

}
