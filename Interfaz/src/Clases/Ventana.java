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
	private JTable table;
	private JTextField textField_7;

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

	    JLabel lblNewLabel_1 = new JLabel("Cedula");
	    lblNewLabel_1.setBounds(461, 66, 71, 14);
	    panel.add(lblNewLabel_1);

	    JLabel lblNewLabel_1_1 = new JLabel("Nombre");
	    lblNewLabel_1_1.setBounds(30, 66, 71, 14);
	    panel.add(lblNewLabel_1_1);

	    JLabel lblNewLabel_1_2 = new JLabel("Direccion");
	    lblNewLabel_1_2.setBounds(30, 120, 71, 14);
	    panel.add(lblNewLabel_1_2);

	    JTextField textField = new JTextField();
	    textField.setBounds(111, 63, 227, 20);
	    panel.add(textField);
	    textField.setColumns(10);

	    JTextField textField_1 = new JTextField();
	    textField_1.setColumns(10);
	    textField_1.setBounds(542, 63, 227, 20);
	    panel.add(textField_1);

	    JTextField textField_2 = new JTextField();
	    textField_2.setColumns(10);
	    textField_2.setBounds(111, 117, 227, 20);
	    panel.add(textField_2);

	    JButton btnNewButton = new JButton("Eliminar");
	    btnNewButton.setBackground(new Color(128, 255, 0));
	    btnNewButton.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            // Acción para el botón Eliminar
	        }
	    });
	    btnNewButton.setBounds(760, 488, 111, 23);
	    panel.add(btnNewButton);

	    JTextField textField_7 = new JTextField();
	    textField_7.setColumns(10);
	    textField_7.setBounds(542, 117, 227, 20);
	    panel.add(textField_7);

	    JLabel lblNewLabel_1_7 = new JLabel("Telefono");
	    lblNewLabel_1_7.setBounds(461, 120, 71, 14);
	    panel.add(lblNewLabel_1_7);

	    JButton btnAgregar = new JButton("Agregar");
	    btnAgregar.setBackground(new Color(128, 255, 0));
	    btnAgregar.setBounds(760, 454, 111, 23);
	    panel.add(btnAgregar);

	    JLabel lblNewLabel_1_2_1 = new JLabel("Lista de Productos");
	    lblNewLabel_1_2_1.setBounds(30, 266, 120, 14);
	    panel.add(lblNewLabel_1_2_1);

	    String[][] data = {
	        {"Manzanas", "Golden", "10", "0.50"},
	        {"Platanos", "Cavendish", "5", "0.30"},
	        {"Naranjas", "Valencia", "8", "0.40"},
	        {"Leche", "Entera", "3", "1.20"},
	        {"Pan", "Integral", "2", "1.50"}
	    };

	    String[] columnNames = {"Producto", "Modelo", "Cantidad", "Precio"};

	    DefaultTableModel model = new DefaultTableModel(data, columnNames);
	    JTable table = new JTable(model);

	    JScrollPane scrollPane = new JScrollPane(table);
	    scrollPane.setBounds(30, 290, 820, 150);
	    panel.add(scrollPane);

	    JPanel panel2 = new JPanel();
	    panel2.setBackground(new Color(255, 128, 128));
	    panel2.setBounds(0, 0, 1064, 77);
	    panel2.setOpaque(true);
	    getContentPane().add(panel2);
	    panel2.setLayout(null);
	}

}
