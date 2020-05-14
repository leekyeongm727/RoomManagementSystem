package room;

import java.util.Scanner;

import exceptions.RequirementFormatException;

public interface RoomInput {
	
	public int getNumber();
	
	public void setNumber(int number);
	
	public void setMoney(int money);
	
	public void setPay(String pay);
	
	public void setRequirement(String requirement) throws RequirementFormatException;
	
	public void getUserInput(Scanner input);
	
	public void  printInfo();
	
	public void setRoomNumber(Scanner input);
	
	public void setRoomMoney(Scanner input);
	
	public void setRoomPay(Scanner input);
	
	public void setRoomRequirements(Scanner input);
	
}
