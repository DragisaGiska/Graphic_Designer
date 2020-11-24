package tree.model;

import javax.swing.tree.DefaultMutableTreeNode;

public class CustomTreeModel extends DefaultMutableTreeNode {
	private static final long serialVersionUID = 1L;
	public CustomTreeModel() {
		super("Root");
		
		DefaultMutableTreeNode project1 = new DefaultMutableTreeNode("Project 1");

		DefaultMutableTreeNode document1 = new DefaultMutableTreeNode(new Document("Document_1").getTitle());
		project1.add(document1);
		DefaultMutableTreeNode document2 = new DefaultMutableTreeNode(new Document("Document_2").getTitle());
		project1.add(document2);
		add(project1);
		
		DefaultMutableTreeNode project2 = new DefaultMutableTreeNode("Project 2");
		DefaultMutableTreeNode document4 = new DefaultMutableTreeNode(new Document("Document_1").getTitle());
		project2.add(document4);
		DefaultMutableTreeNode document5 = new DefaultMutableTreeNode(new Document("Document_2").getTitle());
		project2.add(document5);
		add(project2);
		
		DefaultMutableTreeNode project3 = new DefaultMutableTreeNode("Project 3");
		DefaultMutableTreeNode document7 = new DefaultMutableTreeNode(new Document("Document_1").getTitle());
		project3.add(document7);
		DefaultMutableTreeNode document8 = new DefaultMutableTreeNode(new Document("Document_2").getTitle());
		project3.add(document8);
		add(project3);
	}

}
