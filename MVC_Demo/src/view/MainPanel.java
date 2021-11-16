package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MainPanel extends JPanel{
	
	private JPanel pnl_north = new JPanel();
	private JPanel pnl_center = new JPanel();
	private JPanel pnl_east = new JPanel();
	private JPanel pnl_south = new JPanel();
	private JPanel pnl_west = new JPanel();
	
	private JTextField txtF_south = new JTextField(5);
	private JLabel lbl_north = new JLabel("Ein Label für die GUI");
	private JButton btn_west = new JButton();
	private JButton btn_east = new JButton();
	private JTextField txtF_center_name = new JTextField(1);
	private JTextField txtF_center_vorname = new JTextField(1);
	private JTextField txtF_center_addresse = new JTextField(1);
	
	public MainPanel() {
		this.setLayout(new BorderLayout(10, 0));
		
		this.add(pnl_north, BorderLayout.NORTH);
		pnl_north.add(lbl_north);
		
		this.add(pnl_center, BorderLayout.CENTER);
		pnl_center.setLayout(new GridLayout(0, 2, 1, 1));
		pnl_center.add(new JLabel("Vorname"));
		pnl_center.add(txtF_center_vorname);
		pnl_center.add(new JLabel("Name"));
		pnl_center.add(txtF_center_name);
		pnl_center.add(new JLabel("Addresse"));
		pnl_center.add(txtF_center_addresse);
		
		this.add(pnl_east, BorderLayout.EAST);
		Dimension dim = new Dimension(120, 60);
		btn_east.setPreferredSize(dim);
		pnl_east.setPreferredSize(dim);
		pnl_east.add(btn_east);
		
		this.add(pnl_west, BorderLayout.WEST);
		btn_west.setPreferredSize(dim);
		pnl_west.setPreferredSize(dim);
		pnl_west.add(btn_west);
		
		this.add(pnl_south, BorderLayout.SOUTH);
		pnl_south.add(txtF_south);
		pnl_south.setLayout(new GridLayout());
		pnl_south.setBorder(new EmptyBorder(10, 10, 10, 10));
	}

	public JPanel getPnl_north() {
		return pnl_north;
	}

	public JPanel getPnl_center() {
		return pnl_center;
	}

	public JPanel getPnl_east() {
		return pnl_east;
	}

	public JPanel getPnl_south() {
		return pnl_south;
	}

	public JPanel getPnl_west() {
		return pnl_west;
	}

	public JTextField getTxtF_south() {
		return txtF_south;
	}

	public JLabel getLbl_north() {
		return lbl_north;
	}

	public JButton getBtn_west() {
		return btn_west;
	}

	public JButton getBtn_east() {
		return btn_east;
	}

	public JTextField getTxtF_center_name() {
		return txtF_center_name;
	}

	public JTextField getTxtF_center_vorname() {
		return txtF_center_vorname;
	}

	public JTextField getTxtF_center_addresse() {
		return txtF_center_addresse;
	}
	
	
}
