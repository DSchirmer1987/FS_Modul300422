package project_kassenbon.view;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class KassenFrame extends JFrame {

	private JPanel contentPane;
	private JButton btn_kassenbon;
	private JTextPane txtPane_kassenbon;
	private JButton btn_art;
	private JTextPane txtPane_laden;
	private JLabel lbl_laden;

	/**
	 * Create the frame.
	 */
	public KassenFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		lbl_laden = new JLabel("Kasse");
		lbl_laden.setFont(new Font("Consolas", Font.BOLD, 18));
		lbl_laden.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbl_laden);
		
		txtPane_laden = new JTextPane();
		txtPane_laden.setOpaque(false);
		txtPane_laden.setFont(new Font("Consolas", Font.PLAIN, 14));
		txtPane_laden.setEditable(false);
		contentPane.add(txtPane_laden);
		
		btn_art = new JButton("New button");
		contentPane.add(btn_art);
		
		txtPane_kassenbon = new JTextPane();
		txtPane_kassenbon.setOpaque(false);
		txtPane_kassenbon.setFont(new Font("Consolas", Font.PLAIN, 14));
		txtPane_kassenbon.setEditable(false);
		contentPane.add(txtPane_kassenbon);
		
		btn_kassenbon = new JButton("New button");
		contentPane.add(btn_kassenbon);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JButton getBtn_kassenbon() {
		return btn_kassenbon;
	}

	public void setBtn_kassenbon(JButton btn_kassenbon) {
		this.btn_kassenbon = btn_kassenbon;
	}

	public JTextPane getTxtPane_kassenbon() {
		return txtPane_kassenbon;
	}

	public void setTxtPane_kassenbon(JTextPane txtPane_kassenbon) {
		this.txtPane_kassenbon = txtPane_kassenbon;
	}

	public JButton getBtn_art() {
		return btn_art;
	}

	public void setBtn_art(JButton btn_art) {
		this.btn_art = btn_art;
	}

	public JTextPane getTxtPane_laden() {
		return txtPane_laden;
	}

	public void setTxtPane_laden(JTextPane txtPane_laden) {
		this.txtPane_laden = txtPane_laden;
	}

	public JLabel getLbl_laden() {
		return lbl_laden;
	}

	public void setLbl_laden(JLabel lbl_laden) {
		this.lbl_laden = lbl_laden;
	}

}
