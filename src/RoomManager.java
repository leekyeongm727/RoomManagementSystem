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
				}
			}
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
