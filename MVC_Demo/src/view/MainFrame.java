package view;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	private MainPanel contentPanel = new MainPanel();
	
	public MainFrame() {
		this.setTitle("MVC Demo");
		this.setResizable(false);
		this.setSize(640, 240);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(contentPanel);
	}

	public MainPanel getContentPanel() {
		return contentPanel;
	}
}
