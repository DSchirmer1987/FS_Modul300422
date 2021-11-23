package project_kassenbon.view;


import java.awt.GridLayout;
import java.text.NumberFormat;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.NumberFormatter;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.DropMode;
import javax.swing.JSplitPane;
import java.awt.Dimension;

public class ArtikelFrame extends JFrame {

	private JPanel contentPane;
	private JFormattedTextField txtField_menge;
	private JComboBox<Object> cBox_artikel;
	private JButton btn_addArtikel;
	private JSplitPane splitPane;
	private JButton btn_newArt;
	
	/**
	 * Create the frame.
	 */
	public ArtikelFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 300, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lbl_artNummer = new JLabel("ArtikelNummer");
		lbl_artNummer.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbl_artNummer);
		
		splitPane = new JSplitPane();
		contentPane.add(splitPane);
		
		cBox_artikel = new JComboBox<Object>();
		cBox_artikel.setMinimumSize(new Dimension(175, 21));
		splitPane.setLeftComponent(cBox_artikel);
		
		btn_newArt = new JButton("New button");
		btn_newArt.setMinimumSize(new Dimension(50, 21));
		splitPane.setRightComponent(btn_newArt);
		
		JLabel lbl_Menge = new JLabel("Menge");
		lbl_Menge.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbl_Menge);
		
		NumberFormat n_Format = NumberFormat.getInstance();
		NumberFormatter n_Formatter = new NumberFormatter(n_Format);
		n_Formatter.setValueClass(Integer.class);
		n_Formatter.setMinimum(0);
		n_Formatter.setMaximum(Integer.MAX_VALUE);
		n_Formatter.setAllowsInvalid(false);
		n_Formatter.setCommitsOnValidEdit(true);
		txtField_menge = new JFormattedTextField(n_Formatter);
		txtField_menge.setDropMode(DropMode.INSERT);
		contentPane.add(txtField_menge);
		
		btn_addArtikel = new JButton("New button");
		contentPane.add(btn_addArtikel);
	}

	public JButton getBtn_addArtikel() {
		return btn_addArtikel;
	}

	public JButton getBtn_newArt() {
		return btn_newArt;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JTextField getTxtField_menge() {
		return txtField_menge;
	}

	public JComboBox<Object> getcBox_artikel() {
		return cBox_artikel;
	}

}
