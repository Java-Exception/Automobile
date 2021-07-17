package com.MichaelSuder.Automobile;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Project2 extends JFrame {

	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private JPanel contentPane;
	private JTextField txtMakeModel;
	private JTextField txtSalesPrice;
	private JTextField txtMilesPerGallon;
	private JTextField txtWeight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project2 frame = new Project2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public String getSelected() {
		
		return null;
	}
	/**
	 * Create the frame.
	 */
	public Project2() {
		
		ButtonGroup bg = new ButtonGroup();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	    } catch (Exception e) {
	       e.printStackTrace();
	    }
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(494, 345);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMakeAndModel = new JLabel("Make and Model");
		lblMakeAndModel.setFont(new Font("Verdana", Font.BOLD, 12));
		lblMakeAndModel.setBounds(112, 21, 123, 21);
		contentPane.add(lblMakeAndModel);
		
		JLabel lblSalesPrice = new JLabel("Sales Price");
		lblSalesPrice.setFont(new Font("Verdana", Font.BOLD, 12));
		lblSalesPrice.setBounds(112, 46, 123, 21);
		contentPane.add(lblSalesPrice);
		
		txtMakeModel = new JTextField();
		txtMakeModel.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtMakeModel.setBounds(245, 22, 123, 20);
		contentPane.add(txtMakeModel);
		txtMakeModel.setColumns(10);
		
		txtSalesPrice = new JTextField();
		txtSalesPrice.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtSalesPrice.setColumns(10);
		txtSalesPrice.setBounds(245, 47, 123, 20);
		contentPane.add(txtSalesPrice);
		
		Panel panel = new Panel();
		panel.setBounds(72, 88, 339, 118);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton otherButton = new JRadioButton("Other");
		otherButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		otherButton.setBounds(6, 63, 63, 25);
		panel.add(otherButton);
		otherButton.setFont(new Font("Verdana", Font.BOLD, 12));
		bg.add(otherButton);
		
		JRadioButton electricButton = new JRadioButton("Electric");
		electricButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		electricButton.setBounds(6, 35, 75, 25);
		panel.add(electricButton);
		electricButton.setFont(new Font("Verdana", Font.BOLD, 12));
		bg.add(electricButton);

		JRadioButton hybridButton = new JRadioButton("Hybrid");
		hybridButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hybrid");
			}
		});
		hybridButton.setBounds(6, 7, 69, 25);
		panel.add(hybridButton);
		hybridButton.setFont(new Font("Verdana", Font.BOLD, 12));
		bg.add(hybridButton);

		txtMilesPerGallon = new JTextField();
		txtMilesPerGallon.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtMilesPerGallon.setBounds(221, 10, 108, 20);
		panel.add(txtMilesPerGallon);
		txtMilesPerGallon.setColumns(10);
		
		txtWeight = new JTextField();
		txtWeight.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtWeight.setBounds(221, 38, 108, 20);
		panel.add(txtWeight);
		txtWeight.setColumns(10);
		
		JLabel lblMilesPerGallon = new JLabel("Miles Per Gallon");
		lblMilesPerGallon.setFont(new Font("Verdana", Font.BOLD, 12));
		lblMilesPerGallon.setBounds(89, 12, 108, 14);
		panel.add(lblMilesPerGallon);
		
		JLabel lblNewLabel = new JLabel("Weight in Pounds");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel.setBounds(89, 40, 122, 14);
		panel.add(lblNewLabel);
		
		
		JButton btnComputeSalesTax = new JButton("Compute Sales Tax");
		btnComputeSalesTax.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnComputeSalesTax.setFont(new Font("Verdana", Font.BOLD, 12));
		btnComputeSalesTax.setBounds(72, 212, 173, 30);
		contentPane.add(btnComputeSalesTax);
		
		JButton btnClearFields = new JButton("Clear Fields");
		btnClearFields.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMakeModel.setText("");
				txtSalesPrice.setText("");
				txtMilesPerGallon.setText("");
				txtWeight.setText("");
			}
		});
		btnClearFields.setFont(new Font("Verdana", Font.BOLD, 12));
		btnClearFields.setBounds(72, 252, 173, 30);
		contentPane.add(btnClearFields);
		
		JButton btnDisplayReport = new JButton("Display Report");
		btnDisplayReport.setFont(new Font("Verdana", Font.BOLD, 12));
		btnDisplayReport.setBounds(252, 252, 149, 31);
		contentPane.add(btnDisplayReport);
		
		Panel emptyButtonPanel = new Panel();
		emptyButtonPanel.setBounds(251, 212, 150, 30);
		contentPane.add(emptyButtonPanel);
		
	}
}
