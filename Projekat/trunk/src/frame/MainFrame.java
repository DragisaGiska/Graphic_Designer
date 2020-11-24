package frame;

import java.awt.BorderLayout;
import java.awt.MenuBar;

import javax.swing.JFrame;

import frame.MainPanel;
import menubar.CustomMenuBar;
import toolbar.ToolbarPanel;
import tree.TreePanel;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	MainPanel mainPanel = null;
	public MainFrame() {
		setLayout(new BorderLayout());
		setSize(1900,950);
		setLocationRelativeTo(null);
		setTitle("Graphic designer");
		mainPanel = new MainPanel();		
		getContentPane().add(mainPanel,BorderLayout.CENTER);
		getContentPane().add(new ToolbarPanel(),BorderLayout.NORTH);
		getContentPane().add(new RightPanel(),BorderLayout.EAST);
		getContentPane().add(new TreePanel(), BorderLayout.WEST);
		setJMenuBar(new CustomMenuBar());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);

		
		
		
		
		setVisible(true);
	}
	public MainPanel getMainPanel() {
		return mainPanel;
	}
	public void setMainPanel(MainPanel mainPanel) {
		this.mainPanel = mainPanel;
	}

}
