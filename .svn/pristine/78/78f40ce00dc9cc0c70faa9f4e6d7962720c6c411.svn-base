package frame;

import java.awt.Color;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class MainPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	CanvasPanel canvasPanel = null;
	public MainPanel() {
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		add(Box.createVerticalStrut(10));
		canvasPanel = new CanvasPanel();
		add(canvasPanel);
	}
	public CanvasPanel getCanvasPanel() {
		return canvasPanel;
	}
	public void setCanvasPanel(CanvasPanel canvasPanel) {
		this.canvasPanel = canvasPanel;
	}
}
