import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);
		RoomManager roomManager = getObject("roommaneger.ser");
		if (roomManager == null) {
			roomManager = new RoomManager(input);
		}

		selectMenu(input, roomManager);
		putObject(roomManager, "roommaneger.ser");
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
					logger.log("add a room");
					break;
				case 2:
					roomManager.deleteRoom();
					logger.log("delete a room");
					break;
				case 3:
					roomManager.editRoom();
					logger.log("edit a room");
					break;
				case 4:
					roomManager.viewRooms();
					logger.log("view a list of room");
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
	
	public static RoomManager getObject(String filename) {
		RoomManager roomManager = null;

		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			roomManager = (RoomManager) in.readObject();

			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return roomManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return roomManager;
	}

	public static void putObject(RoomManager roomManager,String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(roomManager);

			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


