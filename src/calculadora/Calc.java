package calculadora;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Calc extends JFrame {

	public Calc() throws Exception {
		super("Calculadora");
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 350);
		setLocation(400, 200);

		setLayout(new BorderLayout());
		
		TextPanel textPanel = new TextPanel();
		add(BorderLayout.NORTH, textPanel);
		
		JPanel digitaPanel = new JPanel();
		digitaPanel.setLayout(new BorderLayout());
		digitaPanel.add(BorderLayout.CENTER, new NumbersPanel(textPanel.getTxtNumber()));
		
		
		digitaPanel.add(BorderLayout.EAST, new OperationPanel(textPanel.getTxtNumber()));
		
		add(BorderLayout.CENTER, digitaPanel);

			
		setVisible(true);

	}

	public static void main(String[] args) throws Exception {
		new Calc();

	}
}
