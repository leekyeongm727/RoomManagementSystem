package room;

import java.util.Scanner;

import exceptions.RequirementFormatException;

public abstract class LongTermRoom extends Room {

	public LongTermRoom(RoomKind kind) {
		super(kind);
	}

	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void  printInfo() {
		String skind =getKindString();
		System.out.println("kind:"+skind+" number:"+number+" money:"+money+" pay method:"+ pay+" requirement:"+requirement);
	}

	public void setRoomRequirementwithYN(Scanner input) {
		char answer ='x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have requirements? (Y/N)");
			answer = input.next().charAt(0);
			try{
				if (answer == 'y' || answer =='Y') {
					System.out.print(" Requirement: ");
					String requirement = input.next();
					this.setRequirement(requirement);
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
				System.out.println("Incorrext Requirement Format. Put the Requirement that contains -");
			}
		}

	}
}
