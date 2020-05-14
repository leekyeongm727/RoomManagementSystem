package room;

import java.util.Scanner;

import exceptions.RequirementFormatException;

public class Eighty_minutesRoom extends LongTermRoom {

	protected String dutch_pay;
	protected String co_requirement;

	public Eighty_minutesRoom(RoomKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setRoomNumber(input);
		setRoomMoney(input);
		setRoomPay(input);
		setRoomRequirementwithYN(input);
		setTeamRequirementwithYN(input);

	}
	public void setTeamRequirementwithYN(Scanner input) {
		char answer ='x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have a team who came with ? (Y/N)");
			answer = input.next().charAt(0);
			try{
				if (answer == 'y' || answer =='Y') {

					setRoomRequirements(input);
					break;
				}
				else if (answer == 'n' || answer =='N') {
					this.setRequirement("");
					break;
				}
				else {
				}
			}
			catch(RequirementFormatException e) {
				System.out.println("Incorrect Requirement Format. put the requirement that contains -");
			}
		}
	}



	public void  printInfo() {
		String skind =getKindString();
		System.out.println("kind:"+skind+" number:"+number+" money:"+money+" pay method:"+ pay+" requirement:"+requirement+"  dutch_pay:"+ pay+" team_came_with:"+requirement);
	}
}
