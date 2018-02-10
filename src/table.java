import java.awt.*;
import javax.swing.*;

public class table extends JFrame {
	private JTable table;
	String[] names = {"Country", "Region", "Population"};
	String[][] body = {{"China", "Asia", "1,409,517,397"}, {"India", "Asia", "1,339,180,127"}, 
			{"United States", "North America", "324,459,463"}, {"Indonesia", "Asia", "263,991,379"}, 
			{"Brazil", "South America", "209,288,278"}};
	
	public table() {
		super("JTable Demo");
		
		table = new JTable(body, names);
		table.setBackground(Color.ORANGE);
		table.setPreferredScrollableViewportSize(new Dimension(500, 300));
		table.setFillsViewportHeight(true);
		add(new JScrollPane(table));
	}
}
