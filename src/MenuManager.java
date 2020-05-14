import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		RoomManager roomManager = new RoomManager(input);
		
		selectMenu(input, roomManager);
	}
	
	public static void selectMenu(Scanner input,RoomManager roomManager) {
		int num =-1;
		while(num !=5) {
			try {
				showMenu();
				num=input.nextInt();
				switch(num) {
				case 1:
					roomManager.addRoom();
					break;
				case 2:
					roomManager.deleteRoom();
					break;
				case 3:
					roomManager.editRoom();
					break;
				case 4:
					roomManager.viewRooms();
					break;
				default:
					continue;	
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	public static void showMenu() {
		System.out.println("*** Room Management System *** ");
		System.out.println(" 1. Add Room ");
		System.out.println(" 2. Delete Room ");
		System.out.println(" 3. Edit Room ");
		System.out.println(" 4. View Rooms ");
		System.out.println(" 5. Exit ");
		System.out.println(" Select one number between 1-5 : ");

	}
//	public static void addRoom() {
//		Scanner input=new Scanner(System.in);
//
//		System.out.print("Room Number:");
//		int roomNum=input.nextInt();
//		System.out.print("Received Amount:");
//		int money=input.nextInt();
//		System.out.print("Payment method:");
//		String pay=input.next();
//		System.out.print("Requirements:");
//		String requirement=input.next();
//
//
//	}

//	public static void deleteRoom() {
//		Scanner input=new Scanner(System.in);
//
//		System.out.print("Room Number:");
//		int roomNum=input.nextInt();
//	}
//
//	public static void editRoom() {
//		Scanner input=new Scanner(System.in);
//
//		System.out.print("Room Number:");
//		int roomNum=input.nextInt();
//
//	}

//	public static void viewRoom() {
//		Scanner input=new Scanner(System.in);
//
//		System.out.print("Room Number:");
//		int roomNum=input.nextInt();
//	}
}


