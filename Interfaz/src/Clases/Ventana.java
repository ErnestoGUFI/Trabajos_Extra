package Clases;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JList;
import java.awt.Font;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		interfaz();
	}
	
	public void interfaz() {
		contentPane.setLayout(null);
		JPanel panel = new JPanel();
		panel.setBounds(93, 90, 881, 522);
		panel.setBorder(new LineBorder(new Color(128, 0, 0), 3));
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("VEHICLE NO");
		lblNewLabel_1.setBounds(30, 41, 71, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CLIENT ID");
		lblNewLabel_1_1.setBounds(30, 66, 71, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("ISSUE DATE");
		lblNewLabel_1_2.setBounds(30, 91, 71, 14);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("NO OF DATES");
		lblNewLabel_1_3.setBounds(30, 116, 71, 14);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("CHARGE");
		lblNewLabel_1_4.setBounds(30, 141, 71, 14);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("ADVANCE");
		lblNewLabel_1_5.setBounds(30, 166, 71, 14);
		panel.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("BALANCE");
		lblNewLabel_1_6.setBounds(30, 191, 71, 14);
		panel.add(lblNewLabel_1_6);
		
		textField = new JTextField();
		textField.setBounds(110, 38, 227, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(110, 63, 227, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(110, 88, 227, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(110, 113, 227, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(110, 138, 227, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(110, 163, 227, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(110, 188, 227, 20);
		panel.add(textField_6);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(347, 38, 227, 170);
		panel.add(textArea);
		
		JButton btnNewButton = new JButton("RETURN");
		btnNewButton.setBackground(new Color(128, 255, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(605, 41, 245, 68);
		panel.add(btnNewButton);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.setBackground(new Color(255, 0, 255));
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPrint.setBounds(583, 116, 111, 68);
		panel.add(btnPrint);
		
		JButton btnNewButton_1_1 = new JButton("CLEAR");
		btnNewButton_1_1.setBackground(new Color(255, 255, 0));
		btnNewButton_1_1.setBounds(760, 116, 111, 68);
		panel.add(btnNewButton_1_1);
		
		String[][] data = {
	            {"ABC123", "CID001", "2024-05-16", "5", "200", "50", "150", "2024-05-21"},
	            {"XYZ456", "CID002", "2024-05-17", "3", "150", "30", "120", "2024-05-20"},
	            {"XYZ456", "CID002", "2024-05-17", "3", "150", "30", "120", "2024-05-20"},
	            {"XYZ456", "CID002", "2024-05-17", "3", "150", "30", "120", "2024-05-20"},
	            {"XYZ456", "CID002", "2024-05-17", "3", "150", "30", "120", "2024-05-20"},
	            {"XYZ456", "CID002", "2024-05-17", "3", "150", "30", "120", "2024-05-20"},
	            {"XYZ456", "CID002", "2024-05-17", "3", "150", "30", "120", "2024-05-20"},
	            {"XYZ456", "CID002", "2024-05-17", "3", "150", "30", "120", "2024-05-20"},
	            {"XYZ456", "CID002", "2024-05-17", "3", "150", "30", "120", "2024-05-20"},
	            {"XYZ456", "CID002", "2024-05-17", "3", "150", "30", "120", "2024-05-20"},
	            {"XYZ456", "CID002", "2024-05-17", "3", "150", "30", "120", "2024-05-20"},
	            {"XYZ456", "CID002", "2024-05-17", "3", "150", "30", "120", "2024-05-20"},
	            {"XYZ456", "CID002", "2024-05-17", "3", "150", "30", "120", "2024-05-20"},
	            {"XYZ456", "CID002", "2024-05-17", "3", "150", "30", "120", "2024-05-20"},
	            {"XYZ456", "CID002", "2024-05-17", "3", "150", "30", "120", "2024-05-20"},
	            {"XYZ456", "CID002", "2024-05-17", "3", "150", "30", "120", "2024-05-20"}
	        };

	        // Nombres de las columnas
	        String[] columnNames = {"VEHICLE NUMBER", "CID", "ISSUE DATE", "NUMBERS OF D", "CHARGE", "ADVANCE", "BALANCE", "RETURN DATE"};

	    
	        DefaultTableModel model = new DefaultTableModel(data, columnNames);

	    
	        JTable table = new JTable(model);

	        JScrollPane scrollPane = new JScrollPane(table);

	        panel.add(scrollPane);

	     
	        scrollPane.setBounds(30, 252, 820, 234);

		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(128, 0, 0));
		panel2.setBounds(0, 0, 1064, 77);
		panel2.setOpaque(true);
		getContentPane().add(panel2);
		panel2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADD VEHICLE");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(50, 11, 74, 14);
		panel2.add(lblNewLabel);
		
		JLabel lblAddClients = new JLabel("ADD CLIENTS");
		lblAddClients.setForeground(Color.WHITE);
		lblAddClients.setBounds(143, 11, 74, 14);
		panel2.add(lblAddClients);
		
		JLabel lblRent = new JLabel("RENT");
		lblRent.setForeground(Color.WHITE);
		lblRent.setBounds(245, 11, 74, 14);
		panel2.add(lblRent);
		
		JLabel lblReturn = new JLabel("RETURN");
		lblReturn.setForeground(Color.WHITE);
		lblReturn.setBounds(329, 11, 74, 14);
		panel2.add(lblReturn);
		
		JLabel lblReport = new JLabel("REPORT");
		lblReport.setForeground(Color.WHITE);
		lblReport.setBounds(413, 11, 74, 14);
		panel2.add(lblReport);
		
		JLabel lblClients = new JLabel("CLIENTS");
		lblClients.setForeground(Color.WHITE);
		lblClients.setBounds(497, 11, 74, 14);
		panel2.add(lblClients);
		
		JLabel lblVehicles = new JLabel("VEHICLES");
		lblVehicles.setForeground(Color.WHITE);
		lblVehicles.setBounds(581, 11, 74, 14);
		panel2.add(lblVehicles);
		
		JLabel lblNewLabel_2 = new JLabel("VEHICLE RENTAL SERVICE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(93, 623, 238, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("2019-07-20");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(392, 623, 132, 28);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("1:15:2");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1_1.setBounds(890, 623, 84, 28);
		contentPane.add(lblNewLabel_2_1_1);
		
		
		

		
		
	}
}
