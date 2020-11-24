package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class RightPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	public RightPanel() {
		setBackground(Color.white);
		setPreferredSize(new Dimension(350,0));
		setLayout(new BorderLayout());
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.white);
		tabbedPane.addTab("Page properties", new PageProperties());
		tabbedPane.addTab("Text properties", new TextProperties());
		tabbedPane.addTab("Symbols", new SymbolProperties());

		JPanel tabNaslov = new JPanel(new FlowLayout(FlowLayout.LEFT, 0 , 0));
		JLabel naslov = new JLabel(tabbedPane.getTitleAt(0));
		tabNaslov.setBackground(Color.white);
		tabNaslov.add(naslov);
		tabbedPane.setTabComponentAt(0, tabNaslov);
		
		
		
		
		add(tabbedPane,BorderLayout.CENTER);
		
		
	}
}
