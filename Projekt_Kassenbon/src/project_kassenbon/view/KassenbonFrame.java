package project_kassenbon.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextPane;

import java.awt.Font;
import javax.swing.JScrollPane;

public class KassenbonFrame extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextPane textPane;

	/**
	 * Create the frame.
	 */
	public KassenbonFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		textPane = new JTextPane();
		textPane.setFont(new Font("Consolas", Font.PLAIN, 14));
		textPane.setOpaque(false);
		textPane.setEditable(false);
		scrollPane = new JScrollPane(textPane);
		contentPane.add(scrollPane);
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public JTextPane getTextPane() {
		return textPane;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

}
