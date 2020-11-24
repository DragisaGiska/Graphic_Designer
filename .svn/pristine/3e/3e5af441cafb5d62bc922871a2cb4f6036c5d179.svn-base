package toolbar;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class ToolbarPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public ToolbarPanel() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		setBackground(Color.white);
		setPreferredSize(new Dimension(0,40));
		setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.gray));
		
		add(new FileToolBar());
		
		JToolBar.Separator separator = new JToolBar.Separator(new Dimension(20, 20));
		separator.setOrientation(JToolBar.Separator.VERTICAL);
		add(separator);
		
		add(new EditToolBar());
	

		
	}
}
