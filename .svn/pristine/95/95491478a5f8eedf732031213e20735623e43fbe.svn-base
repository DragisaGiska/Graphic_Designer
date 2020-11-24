package toolbar;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class EditToolBar extends JToolBar {

	private static final long serialVersionUID = 1L;
	
	JButton btnUndo = null;
	JButton btnRedo = null;
	JButton btnCut = null;
	JButton btnCopy = null;
	JButton btnPaste = null;
	
	public EditToolBar() {
		setBackground(Color.white);
		btnUndo = new JButton(new ImageIcon("icons/arrow-curve-180-left.png"));
		btnUndo.setBackground(Color.white);
		add(btnUndo);
		
		btnRedo = new JButton(new ImageIcon("icons/arrow-curve.png"));
		btnRedo.setBackground(Color.white);
		add(btnRedo);
		
		addSeparator();
		
		btnCut = new JButton(new ImageIcon("icons/scissors.png"));
		btnCut.setBackground(Color.white);
		add(btnCut);
		
		btnCopy = new JButton(new ImageIcon("icons/document-copy.png"));
		btnCopy.setBackground(Color.white);
		add(btnCopy);
		
		btnPaste = new JButton(new ImageIcon("icons/clipboard-paste.png"));
		btnPaste.setBackground(Color.white);
		add(btnPaste);

		
		
		setFloatable(false);
	}

}
