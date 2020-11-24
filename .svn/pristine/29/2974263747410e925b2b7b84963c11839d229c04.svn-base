package menubar;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu.Separator;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;



public class CustomMenuBar extends JMenuBar {

	private static final long serialVersionUID = 1L;
	
	public CustomMenuBar() {
		setBackground(Color.white);
		JMenu menuFile = new JMenu("File");
		menuFile.setFont(new Font("Calibri", 0, 18));
		menuFile.setMnemonic(KeyEvent.VK_F);
		initMenuFile(menuFile);
		add(menuFile);

		JMenu menuEdit= new JMenu("Edit");
		menuEdit.setFont(new Font("Calibri", 0, 18));
		menuEdit.setMnemonic(KeyEvent.VK_F);
		initMenuEdit(menuEdit);
		add(menuEdit);
		
		JMenu menuModify = new JMenu("Modify");
		menuModify.setFont(new Font("Calibri", 0, 18));
		menuModify.setMnemonic(KeyEvent.VK_M);
		initMenuModify(menuModify);
		add(menuModify);
		
		JMenu menuHelp = new JMenu("Help");
		menuHelp.setFont(new Font("Calibri", 0, 18));
		menuHelp.setMnemonic(KeyEvent.VK_H);
		initMenuHelp(menuHelp);
		add(menuHelp);
		
		add(Box.createHorizontalGlue());
		JButton helpButton = new JButton(new ImageIcon("icons/question-frame.png"));
		helpButton.setPreferredSize(new Dimension(20,20));
		helpButton.setMinimumSize(new Dimension(20,20));
		helpButton.setMaximumSize(new Dimension(20,20));
		helpButton.setActionCommand("showDialog");
	
		
		add(helpButton);
		add(Box.createRigidArea(new Dimension(12, 5)));
	}
	
	public void initMenuFile(JMenu menuFile) {
		JMenuItem newMenuItem = new JMenuItem("New project");
		newMenuItem.setFont(new Font("Calibri", 0, 17));
		newMenuItem.setMnemonic(KeyEvent.VK_N);
		newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK));
		menuFile.add(newMenuItem);
		
		
		JMenuItem newDocumentMenuItem = new JMenuItem("New document");
		newDocumentMenuItem.setFont(new Font("Calibri", 0, 17));
		newDocumentMenuItem.setMnemonic(KeyEvent.VK_D);
		newDocumentMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.CTRL_MASK));
		menuFile.add(newDocumentMenuItem);
		menuFile.addSeparator();
		
		JMenu exportMenuItem = new JMenu("Export");
		exportMenuItem.setFont(new Font("Calibri", 0, 17));
		exportMenuItem.setMnemonic(KeyEvent.VK_E);
		exportMenu(exportMenuItem);
		menuFile.add(exportMenuItem);
		
		
		JMenu importMenuItem = new JMenu("Import");
		importMenuItem.setFont(new Font("Calibri", 0, 17));
		importMenuItem.setMnemonic(KeyEvent.VK_I);
		importMenu(importMenuItem);
		menuFile.add(importMenuItem);
		
		menuFile.addSeparator();
		
		JMenu saveMenuItem = new JMenu("Save");
		saveMenuItem.setFont(new Font("Calibri", 0, 17));
		saveMenuItem.setMnemonic(KeyEvent.VK_S);
		JMenuItem saveProject = new JMenuItem("Save project");
		saveProject.setFont(new Font("Calibri", 0, 17));
		saveMenuItem.add(saveProject);
		JMenuItem saveDocument = new JMenuItem("Save document");
		saveDocument.setFont(new Font("Calibri", 0, 17));
		saveMenuItem.add(saveDocument);
		menuFile.add(saveMenuItem);
		
		JMenu saveAsMenuItem = new JMenu("Save As...");
		saveAsMenuItem.setFont(new Font("Calibri", 0, 17));
		saveAsMenuItem.setMnemonic(KeyEvent.VK_A);
		JMenuItem saveAsProject = new JMenuItem("Save as project...");
		saveAsProject.setFont(new Font("Calibri", 0, 17));
		saveAsMenuItem.add(saveAsProject);
		JMenuItem saveAsDocument = new JMenuItem("Save as document...");
		saveAsDocument.setFont(new Font("Calibri", 0, 17));
		saveAsMenuItem.add(saveAsDocument);
		menuFile.add(saveAsMenuItem);
		
		menuFile.addSeparator();
		
		JMenu print = new JMenu("Print");
		print.setFont(new Font("Calibri", 0, 17));
		print.setMnemonic(KeyEvent.VK_P);
		printMenu(print);
		menuFile.add(print);
		
		menuFile.addSeparator();
		
		JMenuItem exitMenuItem = new JMenuItem("Exit");
		exitMenuItem.setFont(new Font("Calibri", 0, 17));
		exitMenuItem.setMnemonic(KeyEvent.VK_E);
		exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, KeyEvent.ALT_MASK));
		menuFile.add(exitMenuItem);
	}

	public void initMenuEdit(JMenu menuEdit) {
		JMenuItem undoMenuItem = new JMenuItem("Undo");
		undoMenuItem.setFont(new Font("Calibri", 0, 17));
		undoMenuItem.setMnemonic(KeyEvent.VK_U);
		undoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_MASK));
		undoMenuItem.setIcon(new ImageIcon("icons/arrow-curve-180-left.png"));
		menuEdit.add(undoMenuItem);
		
		JMenuItem redoMenuItem = new JMenuItem("Redo");
		redoMenuItem.setFont(new Font("Calibri", 0, 17));
		redoMenuItem.setMnemonic(KeyEvent.VK_R);
		redoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, KeyEvent.CTRL_MASK));
		redoMenuItem.setIcon(new ImageIcon("icons/arrow-curve.png"));
		menuEdit.add(redoMenuItem);
		
		menuEdit.addSeparator();
		
		JMenuItem cutMenuItem = new JMenuItem("Cut");
		cutMenuItem.setFont(new Font("Calibri", 0, 17));
		cutMenuItem.setMnemonic(KeyEvent.VK_C);
		cutMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_MASK));
		cutMenuItem.setIcon(new ImageIcon("icons/scissors.png"));
		menuEdit.add(cutMenuItem);
		
		JMenuItem copyMenuItem = new JMenuItem("Copy");
		copyMenuItem.setFont(new Font("Calibri", 0, 17));
		copyMenuItem.setMnemonic(KeyEvent.VK_O);
		copyMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_MASK));
		copyMenuItem.setIcon(new ImageIcon("icons/document-copy.png"));
		menuEdit.add(copyMenuItem);
		
		JMenuItem pasteMenuItem = new JMenuItem("Paste");
		pasteMenuItem.setFont(new Font("Calibri", 0, 17));
		pasteMenuItem.setMnemonic(KeyEvent.VK_P);
		pasteMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_MASK));
		pasteMenuItem.setIcon(new ImageIcon("icons/clipboard-paste.png"));
		menuEdit.add(pasteMenuItem);
		
		menuEdit.addSeparator();
		
		JMenu zoomMenu = new JMenu("Zoom");
		zoomMenu.setFont(new Font("Calibri", 0, 17));
		menuEdit.add(zoomMenu);
		
		JMenuItem magnifier = new JMenuItem("Magnifier");
		magnifier.setFont(new Font("Calibri", 0, 17));
		magnifier.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, KeyEvent.CTRL_MASK));
		magnifier.setIcon(new ImageIcon("icons/magnifier.png"));
		zoomMenu.add(magnifier);
		
		JMenuItem zoomIn = new JMenuItem("Zoom In");
		zoomIn.setFont(new Font("Calibri", 0, 17));
		zoomIn.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ADD, KeyEvent.CTRL_MASK));
		zoomIn.setIcon(new ImageIcon("icons/magnifier-zoom-in.png"));
		zoomMenu.add(zoomIn);
		
		JMenuItem zoomOut = new JMenuItem("Zoom Out");
		zoomOut.setFont(new Font("Calibri", 0, 17));
		zoomOut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, KeyEvent.CTRL_MASK));
		zoomOut.setIcon(new ImageIcon("icons/magnifier-zoom-out.png"));
		zoomMenu.add(zoomOut);		
	}

	public void initMenuHelp(JMenu menuHelp) {
		JMenuItem showHelpMenuItem = new JMenuItem("Show help");
		showHelpMenuItem.setFont(new Font("Calibri", 0, 17));
		showHelpMenuItem.setMnemonic(KeyEvent.VK_S);
		showHelpMenuItem.setAccelerator(KeyStroke.getKeyStroke("F1"));
		showHelpMenuItem.setIcon(new ImageIcon("icons/question-frame.png"));
		showHelpMenuItem.setActionCommand("showDialog");
		menuHelp.add(showHelpMenuItem);
	}
	public void exportMenu(JMenu export)
	{
		JMenuItem exportProject = new JMenuItem("Export project");
		exportProject.setFont(new Font("Calibri", 0, 17));
		export.add(exportProject);
		
		JMenuItem exportDocument = new JMenuItem("Export document");
		exportDocument.setFont(new Font("Calibri", 0, 17));
		export.add(exportDocument);
		
		JMenuItem exportPicture = new JMenuItem("Export picture");
		exportPicture.setFont(new Font("Calibri", 0, 17));
		export.add(exportPicture);
	}
	public void importMenu(JMenu importMenu)
	{
		JMenuItem importProject = new JMenuItem("Import project");
		importProject.setFont(new Font("Calibri", 0, 17));
		importMenu.add(importProject);
		
		JMenuItem importDocument = new JMenuItem("Import document");
		importDocument.setFont(new Font("Calibri", 0, 17));
		importMenu.add(importDocument);
		
		JMenuItem importPicture = new JMenuItem("Import picture");
		importPicture.setFont(new Font("Calibri", 0, 17));
		importMenu.add(importPicture);
	}

	public void initMenuModify(JMenu menuModify)
	{
		JMenu arrange = new JMenu("Arrange");
		arrange.setFont(new Font("Calibri", 0, 17));
		arrangeMenu(arrange);
		menuModify.add(arrange);
		
		JMenu alignMenu = new JMenu("Align");
		alignMenu.setFont(new Font("Calibri", 0, 17));
		alignMenu(alignMenu);
		menuModify.add(alignMenu);
		
		JMenu transform = new JMenu("Transform");
		transform.setFont(new Font("Calibri", 0, 17));
		transformMenu(transform);
		menuModify.add(transform);
		
		menuModify.addSeparator();
		
		JMenuItem grouMenuItem = new JMenuItem("Group");
		grouMenuItem.setFont(new Font("Calibri", 0, 17));
		menuModify.add(grouMenuItem);
		
		JMenuItem degroupMenuItem = new JMenuItem("Degroup");
		degroupMenuItem.setFont(new Font("Calibri", 0, 17));
		menuModify.add(degroupMenuItem);
		
	}
	
	public void arrangeMenu(JMenu arrange)
	{
		JMenuItem bringToFront = new JMenuItem("Bring to front");
		bringToFront.setFont(new Font("Calibri", 0, 17));
		arrange.add(bringToFront);
		
		JMenuItem bringToBack = new JMenuItem("Bring to back");
		bringToBack.setFont(new Font("Calibri", 0, 17));
		arrange.add(bringToBack);
		
		JMenuItem sentToBackWard = new JMenuItem("Bring to back");
		sentToBackWard.setFont(new Font("Calibri", 0, 17));
		arrange.add(sentToBackWard);
		
	}

	public void alignMenu(JMenu align)
	{
		JMenuItem alignLeft = new JMenuItem("Align left");
		alignLeft.setFont(new Font("Calibri", 0, 17));
		align.add(alignLeft);
		
		JMenuItem alignCenter = new JMenuItem("Align center");
		alignCenter.setFont(new Font("Calibri", 0, 17));
		align.add(alignCenter);
		
		JMenuItem alignRight = new JMenuItem("Align right");
		alignRight.setFont(new Font("Calibri", 0, 17));
		align.add(alignRight);
		
		align.addSeparator();
		
		JMenuItem alignTop = new JMenuItem("Align top");
		alignTop.setFont(new Font("Calibri", 0, 17));
		align.add(alignTop);
		
		JMenuItem alignMiddle = new JMenuItem("Align middle");
		alignMiddle.setFont(new Font("Calibri", 0, 17));
		align.add(alignMiddle);
		
		JMenuItem alignBottom = new JMenuItem("Align bottom");
		alignBottom.setFont(new Font("Calibri", 0, 17));
		align.add(alignBottom);
		
		align.addSeparator();
		
		JMenuItem sameWidth = new JMenuItem("Same width");
		sameWidth.setFont(new Font("Calibri", 0, 17));
		align.add(sameWidth);
		
		JMenuItem sameHeight = new JMenuItem("Same height");
		sameHeight.setFont(new Font("Calibri", 0, 17));
		align.add(sameHeight);
		
		
	}

	public void transformMenu(JMenu transform)
	{
		JMenuItem rotate45Left = new JMenuItem("Rotate 45° left");
		rotate45Left.setFont(new Font("Calibri", 0, 17));
		transform.add(rotate45Left);
		
		JMenuItem rotate90Left = new JMenuItem("Rotate 90° left");
		rotate90Left.setFont(new Font("Calibri", 0, 17));
		transform.add(rotate90Left);
		
		JMenuItem rotate180Left = new JMenuItem("Rotate 180° left");
		rotate180Left.setFont(new Font("Calibri", 0, 17));
		transform.add(rotate180Left);
		
		transform.addSeparator();
		
		JMenuItem rotate45Right = new JMenuItem("Rotate 45° right");
		rotate45Right.setFont(new Font("Calibri", 0, 17));
		transform.add(rotate45Right);
		
		JMenuItem rotate90Right = new JMenuItem("Rotate 90° right");
		rotate90Right.setFont(new Font("Calibri", 0, 17));
		transform.add(rotate90Right);
		
		JMenuItem rotate180Right = new JMenuItem("Rotate 180° right");
		rotate180Right.setFont(new Font("Calibri", 0, 17));
		transform.add(rotate180Right);
		
		transform.addSeparator();
		
		JMenuItem flipVertical = new JMenuItem("Flip vertical");
		flipVertical.setFont(new Font("Calibri", 0, 17));
		transform.add(flipVertical);
		
		JMenuItem flipHorizontal = new JMenuItem("Flip horizontal");
		flipHorizontal.setFont(new Font("Calibri", 0, 17));
		transform.add(flipHorizontal);
		
	}

	public void printMenu(JMenu print)
	{
		JMenuItem printItem = new JMenuItem("Print");
		printItem.setFont(new Font("Calibri", 0, 17));
		print.add(printItem);
		
		JMenuItem pageSetup = new JMenuItem("Page setup");
		pageSetup.setFont(new Font("Calibri", 0, 17));
		print.add(pageSetup);
		
		JMenuItem printPreview = new JMenuItem("Print preview");
		printPreview.setFont(new Font("Calibri", 0, 17));
		print.add(printPreview);
		
	
	}
}
