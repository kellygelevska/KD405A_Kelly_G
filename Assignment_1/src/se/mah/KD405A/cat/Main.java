package se.mah.KD405A.cat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JScrollBar;
import java.awt.List;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField Namn;
	private JTextField Personnummer;
	private JTextField Adress;
	private JTextField Telefonnummer;
	private JTextField Epost;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 315);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem = new JCheckBoxMenuItem("Skriv ut");
		mnArkiv.add(chckbxmntmNewCheckItem);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnArkiv.add(mntmAvsluta);
		
		JMenu mnNewMenu_1 = new JMenu("Medlem");
		menuBar.add(mnNewMenu_1);
		
		JCheckBoxMenuItem chckbxmntmNyMedlem = new JCheckBoxMenuItem("Ny medlem");
		mnNewMenu_1.add(chckbxmntmNyMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta medlem");
		mnNewMenu_1.add(mntmHittaMedlem);
		
		JMenu mnNewMenu = new JMenu("Hjälp");
		menuBar.add(mnNewMenu);
		
		JMenu mnHjlp = new JMenu("Hjälp");
		mnNewMenu.add(mnHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om programmet");
		mnHjlp.add(mntmOmProgrammet);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Main.class.getResource("/se/mah/KD405A/cat/Gym/maja.jpg")));
		label_1.setBounds(161, 58, 112, 121);
		contentPane.add(label_1);
		
		Adress = new JTextField();
		Adress.setHorizontalAlignment(SwingConstants.CENTER);
		Adress.setText("Kanalgatan 14");
		Adress.setColumns(10);
		Adress.setBounds(391, 115, 130, 26);
		contentPane.add(Adress);
		
		Personnummer = new JTextField();
		Personnummer.setHorizontalAlignment(SwingConstants.CENTER);
		Personnummer.setText("940512 - 7892");
		Personnummer.setColumns(10);
		Personnummer.setBounds(391, 77, 130, 26);
		contentPane.add(Personnummer);
		
		JLabel lblNamn = new JLabel("Namn:");
		lblNamn.setForeground(Color.BLACK);
		lblNamn.setBounds(341, 43, 43, 21);
		contentPane.add(lblNamn);
		
		Namn = new JTextField();
		Namn.setText("Maja Petersson");
		Namn.setHorizontalAlignment(SwingConstants.CENTER);
		Namn.setBounds(391, 40, 130, 26);
		contentPane.add(Namn);
		Namn.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Personnummer:");
		lblNewLabel.setBounds(285, 77, 99, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblAdress = new JLabel("Adress:");
		lblAdress.setBounds(341, 118, 48, 21);
		contentPane.add(lblAdress);
		
		Telefonnummer = new JTextField();
		Telefonnummer.setHorizontalAlignment(SwingConstants.CENTER);
		Telefonnummer.setText("0732008864");
		Telefonnummer.setBounds(391, 153, 130, 26);
		contentPane.add(Telefonnummer);
		Telefonnummer.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Telefonnummer:");
		lblNewLabel_1.setBounds(285, 154, 104, 25);
		contentPane.add(lblNewLabel_1);
		
		Epost = new JTextField();
		Epost.setHorizontalAlignment(SwingConstants.CENTER);
		Epost.setText("Maja.P@gmail.com");
		Epost.setBounds(391, 186, 130, 26);
		contentPane.add(Epost);
		Epost.setColumns(10);
		
		JLabel lblEpost = new JLabel("E-post:");
		lblEpost.setBounds(341, 189, 48, 21);
		contentPane.add(lblEpost);
		
		JButton btnSpara = new JButton("Spara");
		btnSpara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSpara.setBounds(443, 224, 78, 29);
		contentPane.add(btnSpara);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 134, 259);
		contentPane.add(scrollPane);
		
		JList list_1 = new JList();
		scrollPane.setViewportView(list_1);
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"Kelly Gelevska ", "Marcus Hansson", "Amina Nilsson", "Emmie Nilsson", "Magnus Eriksson", "Hanna Larsson", "Emma Olsson", "Johan Persson", "Malin Svensson", "Niklas Gustafsson", "Maja Pettersson", "Madelene Jonsson", "Hans Jansson", "Bengt Bengtsson", "Carl Carlsson", "Peter Petersson", "Johan Lindberg", "Kelly Magnusson", "Kristina Lindström", "Isabella Gustavsson", "Sara Olofsson"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Main.class.getResource("/se/mah/KD405A/cat/Gym/1508061_stock-photo-gym-and-fitness-smiling-people.jpg")));
		label.setBounds(0, 0, 527, 271);
		contentPane.add(label);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
