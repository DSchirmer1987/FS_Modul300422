import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.AbstractAction;
import javax.swing.AbstractButton;

import java.awt.event.ActionEvent;
import javax.swing.Action;

public class MyFrame extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();
	private JLabel lbl_north;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lbl_north = new JLabel("Ich bin ein Label");
		lbl_north.setForeground(Color.RED);
		lbl_north.setBackground(Color.BLUE);
		lbl_north.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_north.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbl_north, BorderLayout.NORTH);
		
		JToggleButton tgl_btn_lbl_north = new JToggleButton("Mach das Label Blau");
		tgl_btn_lbl_north.setAction(action);
		contentPane.add(tgl_btn_lbl_north, BorderLayout.CENTER);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.out.println("Gedrückt");
			AbstractButton ab = (AbstractButton) e.getSource();
			if(ab.getModel().isSelected()) {
				lbl_north.setOpaque(true);
//				lbl_north.setForeground(Color.BLUE);
			} else {
				lbl_north.setOpaque(false);
//				lbl_north.setForeground(Color.GREEN);
			}
		}
	}
}
