package frame;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class TextProperties extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public TextProperties() {
		setBackground(Color.white);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.white);
		panel1.setPreferredSize(new Dimension(340,80));
		panel1.setLayout(null);
		
		JButton colorButton = new JButton();
		colorButton.setIcon(new ImageIcon("icons\\paint-brush.png"));
		colorButton.setSize(70,70);
		colorButton.setLocation(10, 10);
		colorButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JColorChooser.showDialog(null, "Choose color ", Color.RED);
			}
		});	
		panel1.add(colorButton);
		
		String[] fonts = {
				"Abadi MT Condensed Light " ,
				"Albertus Extra Bold \r\n" , 
				"Albertus Medium \r\n" , 
				"Antique Olive \r\n" , 
				"Arial \r\n" , 
				"Arial Black \r\n" , 
				"Arial MT \r\n" , 
				"Arial Narrow \r\n" , 
				"Bazooka \r\n" , 
				"Book Antiqua \r\n" , 
				"Bookman Old Style \r\n" , 
				"Boulder \r\n" , 
				"Calisto MT \r\n" , 
				"Calligrapher \r\n" , 
				"Century Gothic \r\n" , 
				"Century Schoolbook \r\n" , 
				"Cezanne \r\n" , 
				"CG Omega \r\n" , 
				"CG Times \r\n" , 
				"Charlesworth \r\n" , 
				"Chaucer \r\n" , 
				"Clarendon Condensed \r\n" , 
				"Comic Sans MS \r\n" , 
				"Copperplate Gothic Bold \r\n" , 
				"Copperplate Gothic Light \r\n" , 
				"Cornerstone \r\n" , 
				"Coronet ",
				"Courier \r\n" ,
				"Courier New \r\n" ,
				"Cuckoo \r\n" , 
				"Dauphin \r\n",
				"Denmark \r\n" ,
				"Fransiscan \r\n",
				"Garamond \r\n" ,
				"Geneva \r\n" ,
				"Haettenschweiler \r\n",
				"Heather \r\n" ,
				"Helvetica \r\n" ,
				"Herald \r\n" ,
				"Impact \r\n" ,
				"Jester \r\n" ,
				"Letter Gothic \r\n" ,
				"Lithograph \r\n", 
				"Lithograph Light \r\n" ,
				"Long Island \r\n" ,
				"Lucida Console \r\n" , 
				"Lucida Handwriting \r\n",
				"Lucida Sans \r\n" , 
				"Lucida Sans Unicode \r\n" , 
				"Marigold \r\n" ,
				"Market \r\n" ,
				"Matisse ITC \r\n", 
				"MS LineDraw \r\n" , 
				"News GothicMT \r\n" ,
				"OCR A Extended \r\n" ,
				"Old Century \r\n" ,
				"Pegasus \r\n" ,
				"Pickwick \r\n" ,
				"Poster \r\n",
				"Pythagoras \r\n" , 
				"Sceptre \r\n",
				"Sherwood \r\n" , 
				"Signboard \r\n" ,
				"Socket \r\n" ,
				"Steamer \r\n",
				"Storybook \r\n", 
				"Subway \r\n" , 
				"Tahoma \r\n" , 
				"Technical \r\n",
				"Teletype \r\n" , 
				"Tempus Sans ITC \r\n" , 
				"Times \r\n" , 
				"Times New Roman \r\n" , 
				"Times New Roman PS \r\n",
				"Trebuchet MS \r\n", 
				"Tristan \r\n" ,
				"Tubular \r\n" , 
				"Unicorn \r\n" , 
				"Univers \r\n" , 
				"Univers Condensed \r\n" , 
				"Vagabond \r\n" , 
				"Verdana \r\n" , 
				"Westminster	"
				};
		JComboBox<String> fontsList = new JComboBox<String>(fonts);
		fontsList.setSize(230,30);
		fontsList.setLocation(90, 10);
		panel1.add(fontsList);
		
		String[] fontsStyle = {
				"Light",
				"Light Italic",
				"Regular",
				"Semi-Bold",
				"Semi-Bold Italic",
				"Bold",
				"Bold Italic",
				"Extra-Bold",
				"Extra-Bold Italic",
				
		};
		
		JComboBox<String> fontsList1 = new JComboBox<String>(fontsStyle);
		fontsList1.setSize(150,30);
		fontsList1.setLocation(90, 50);
		panel1.add(fontsList1);
		
		String[] fontsSyze = {
				"6",
				"7",
				"8",
				"9",
				"10",
				"11",
				"12",
				"14",
				"18",
				"21",
				"24",
				"36",
				"48",
				"60",
				"72",
				
		};
		
		JComboBox<String> fontsSyzeList = new JComboBox<String>(fontsSyze);
		fontsSyzeList.setSize(70,30);
		fontsSyzeList.setLocation(250, 50);
		panel1.add(fontsSyzeList);
		
		add(panel1);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		panel2.setPreferredSize(new Dimension(340,40));
		panel2.setBackground(Color.white);
		
		JLabel decoration = new JLabel("Decoration");
		decoration.setFont(new Font("Arial",0,13));
		decoration.setPreferredSize(new Dimension(70,30));
		panel2.add(decoration);
		
		JButton boldButton = new JButton("B");
		boldButton.setFont(new Font("Cambria",1,15));
		boldButton.setPreferredSize(new Dimension(45,30));
		panel2.add(boldButton);
		
		JButton italicButton = new JButton("I");
		italicButton.setFont(new Font("Cambria",2,15));
		italicButton.setPreferredSize(new Dimension(45,30));
		panel2.add(italicButton);
		
		JButton underlineButton = new JButton(new ImageIcon("icons\\font (1).png"));
		underlineButton.setFont(new Font("Cambria",0,15));
		underlineButton.setPreferredSize(new Dimension(45,30));
		panel2.add(underlineButton);
		
		JButton striketrough = new JButton(new ImageIcon("icons\\strikethrough-text-interface-sign.png"));
		striketrough.setPreferredSize(new Dimension(45,30));
		panel2.add(striketrough);
		
		add(panel2);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout());
		panel3.setPreferredSize(new Dimension(340,40));
		panel3.setBackground(Color.white);
		
		JLabel alingment = new JLabel("Alingment");
		alingment.setFont(new Font("Arial",0,13));
		alingment.setPreferredSize(new Dimension(70,30));
		panel3.add(alingment);
		

		JButton leftAlingment = new JButton(new ImageIcon("icons\\icons8-align-left-24.png"));
		leftAlingment.setPreferredSize(new Dimension(45,30));
		panel3.add(leftAlingment);
		
		JButton centerAlingment = new JButton(new ImageIcon("icons\\icons8-align-center-24 (1).png"));
		centerAlingment.setFont(new Font("Cambria",2,15));
		centerAlingment.setPreferredSize(new Dimension(45,30));
		panel3.add(centerAlingment);
		
		JButton rightAlingment = new JButton(new ImageIcon("icons\\icons8-align-right-24.png"));
		rightAlingment.setFont(new Font("Cambria",0,15));
		rightAlingment.setPreferredSize(new Dimension(45,30));
		panel3.add(rightAlingment);
		
		JButton justify = new JButton(new ImageIcon("icons\\icons8-align-justify-24.png"));
		justify.setPreferredSize(new Dimension(45,30));
		panel3.add(justify);
		
		add(panel3);

		JPanel panel4 = new JPanel();
		panel4.setLayout(new FlowLayout());
		panel4.setPreferredSize(new Dimension(340,40));
		panel4.setBackground(Color.white);
		
		JLabel blendingLabel = new JLabel("Blending");
		blendingLabel.setFont(new Font("Arial",0,13));
		blendingLabel.setPreferredSize(new Dimension(70,30));
		panel4.add(blendingLabel);
		
	
		String[] blending = {
				"Normal",
				"Multiply",
				"Overlay",
				"Screen",
				"Darken",
				"Lighten",
				"Color Dodge",
				"Color Burn",
				"Hard Light",
				"Soft Light",
				"Difference",
				"Exclusion",
				"Hue",
				"Saturation",
				"Linear Burn",
				
		};
		
		JComboBox<String> blendingList = new JComboBox<String>(blending);
		blendingList.setPreferredSize(new Dimension(195,30));
		panel4.add(blendingList);
		
		add(panel4);
	}

}
