package tree;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.TreeSelectionModel;


import tree.model.CustomTreeModel;
import tree.renderer.CustomTreeCellReneder;

public class TreePanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	JTree stablo = null;
	
	public TreePanel() {
		setLayout(new BorderLayout());
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(230, 0));
		setBorder(BorderFactory.createLineBorder(new Color(240, 240, 240)));
	
		stablo = new JTree(new CustomTreeModel());
		stablo.setRootVisible(false);
		stablo.setShowsRootHandles(true);
		
		stablo.setCellRenderer(new CustomTreeCellReneder());
		
		stablo.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		
		
		JScrollPane scrollPane = new JScrollPane(stablo);
		add(scrollPane, BorderLayout.CENTER);
	}
	

}
