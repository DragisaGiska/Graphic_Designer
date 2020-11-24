package toolbar;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class FileToolBar extends JToolBar{

	private static final long serialVersionUID = 1L;
	
	public FileToolBar() {
		setBackground(Color.white);
		JButton btnNew = new JButton("New", new ImageIcon("icons/application_add.png"));
		btnNew.setBackground(Color.white);
		add(btnNew);
		
		JButton btnOpen = new JButton("Open", new ImageIcon("icons/folder-open.png"));
		btnOpen.setBackground(Color.white);
		add(btnOpen);
		
		addSeparator();
		
		JButton btnSave = new JButton(new ImageIcon("icons/disk.png"));
		btnSave.setBackground(Color.white);
		add(btnSave);
		
		JButton btnSaveAll = new JButton(new ImageIcon("icons/disks.png"));
		btnSaveAll.setBackground(Color.white);
		add(btnSaveAll);
		
		setFloatable(false);
	}

}
