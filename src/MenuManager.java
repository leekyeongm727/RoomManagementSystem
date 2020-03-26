import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num =5;

		while(num !=6) {
			System.out.println("*** Room Management System *** ");
			System.out.println(" 1. Add Room ");
			System.out.println(" 2. Delete Room ");
			System.out.println(" 3. Edit Room ");
			System.out.println(" 4. View Room ");
			System.out.println(" 5. Show a menu ");
			System.out.println(" 6. Exit ");
			System.out.println(" Select one number between 1-6 : ");
			num=input.nextInt();
			if (num==1) {
				addRoom();
			}
			else if (num==2) {
				deleteRoom();
			}
			else if (num==3) {
				editRoom();
		    }
			else if (num==4) {
				viewRoom();
		    }
			else {
				continue;
			}
		}
		
	}
	public static void addRoom() {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Room Number:");
		int roomNum=input.nextInt();
		System.out.print("Received Amount:");
		int money=input.nextInt();
		System.out.print("Payment method:");
		String pay=input.next();
		System.out.print("Requirements:");
		String requirements=input.next();


	}
	
	public static void deleteRoom() {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Room Number:");
		int roomNum=input.nextInt();
	}
	
	public static void editRoom() {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Room Number:");
		int roomNum=input.nextInt();
		
	}
	
    public static void viewRoom() {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Room Number:");
		int roomNum=input.nextInt();
	}
	}


