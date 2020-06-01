package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame{

	MenuSelection menuselection;
	RoomAdder roomadder;
	RoomViewer roomviwer;

	public WindowFrame() {
		this.menuselection = new MenuSelection(this);
		this.roomadder = new RoomAdder(this);
		this. roomviwer = new RoomViewer(this);
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public RoomAdder getRoomadder() {
		return roomadder;
	}

	public void setRoomadder(RoomAdder roomadder) {
		this.roomadder = roomadder;
	}

	public RoomViewer getRoomviwer() {
		return roomviwer;
	}

	public void setRoomviwer(RoomViewer roomviwer) {
		this.roomviwer = roomviwer;
	}

	
}
