package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.RoomManager;
import room.RoomInput;

public class RoomViewer extends JPanel{

	WindowFrame frame;
	

	RoomManager roomManager;
	
	public RoomViewer(WindowFrame frame, RoomManager roomManager) {
		
		this.frame = frame;
		this.roomManager = roomManager;
		
		System.out.println("***"+ roomManager.size()+"***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Number");
		model.addColumn("Money");
		model.addColumn("Pay_Method");
		model.addColumn("Requirements");
		
		for (int i=0; i<roomManager.size(); i++) {
			Vector row = new Vector();
			RoomInput ri = roomManager.get(i);
			row.add(ri.getNumber());
			row.add(ri.getMoney());
			row.add(ri.getPay());
			row.add(ri.getRequirement());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);			
	}
}
