package project_kassenbon.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class NewArtikelFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txt_artNum;
	private JTextField txt_artBez;
	private JTextField txt_artPreis;
	private JButton btn_addArt;

	/**
	 * Create the frame.
	 */
	public NewArtikelFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 300, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Artikelnummer");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		txt_artNum = new JTextField();
		contentPane.add(txt_artNum);
		txt_artNum.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Bezeichnung");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1);
		
		txt_artBez = new JTextField();
		contentPane.add(txt_artBez);
		txt_artBez.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Einzelpreis");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_2);
		
		txt_artPreis = new JTextField();
		contentPane.add(txt_artPreis);
		txt_artPreis.setColumns(10);
		
		btn_addArt = new JButton("New button");
		contentPane.add(btn_addArt);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JTextField getTxt_artNum() {
		return txt_artNum;
	}

	public JTextField getTxt_artBez() {
		return txt_artBez;
	}

	public JTextField getTxt_artPreis() {
		return txt_artPreis;
	}

	public JButton getBtn_addArt() {
		return btn_addArt;
	}

}
