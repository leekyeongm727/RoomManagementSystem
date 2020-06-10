package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.RoomManager;

public class WindowFrame extends JFrame{

	RoomManager roomManager;
	MenuSelection menuSelection;
	RoomAdder roomadder;
	RoomViewer roomviwer;

	public WindowFrame(RoomManager roomManager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.roomManager = roomManager;
		menuSelection = new MenuSelection(this);
		roomadder = new RoomAdder(this);
		roomviwer = new RoomViewer(this, this.roomManager);
		
		this.add(menuSelection);
		
		this.setVisible(true);
	}
	
	public MenuSelection getMenuselection() {
		return menuSelection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuSelection = menuselection;
	}

	public RoomAdder getRoomadder() {
		return roomadder;
	}

	public void setRoomadder(RoomAdder roomadder) {
		this.roomadder = roomadder;
	}

	public RoomViewer getRoomviewer() {
		return roomviwer;
	}

	public void setRoomviwer(RoomViewer roomviwer) {
		this.roomviwer = roomviwer;
	}

	
}
