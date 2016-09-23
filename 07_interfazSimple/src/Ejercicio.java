import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class Ejercicio {

	private JFrame frame;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio window = new Ejercicio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 250, 325, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel labelNom = new JLabel("Nom");
		labelNom.setBounds(10, 15, 150, 15);
		frame.getContentPane().add(labelNom);
		
		JTextField textFieldNom = new JTextField();
		textFieldNom.setBounds(10, 32, 207, 19);
		frame.getContentPane().add(textFieldNom);
		textFieldNom.setColumns(10);
		
		JLabel labelPrenom = new JLabel("Prénom");
		labelPrenom.setBounds(10, 56, 150, 15);
		frame.getContentPane().add(labelPrenom);
		
		JTextField textFieldPrenom = new JTextField();
		textFieldPrenom.setBounds(10, 73, 207, 19);
		frame.getContentPane().add(textFieldPrenom);
		textFieldPrenom.setColumns(10);
		
		JLabel labelAdresse = new JLabel("Adresse");
		labelAdresse.setBounds(10, 99, 70, 15);
		frame.getContentPane().add(labelAdresse);

		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBounds(10, 117, 207, 79);
		frame.getContentPane().add(textArea);
		Border border = BorderFactory.createLineBorder(Color.GRAY);
		textArea.setBorder(border);
		textFieldNom.setBorder(border);
		textFieldPrenom.setBorder(border);
		
		panel = new JPanel();
		panel.setBounds(50, 200, 167, 35);
		frame.getContentPane().add(panel);
		
		JRadioButton rdbtnHomme = new JRadioButton("Homme");
		buttonGroup.add(rdbtnHomme);
		rdbtnHomme.setSelected(true);
		panel.add(rdbtnHomme);
		
		JRadioButton rdbtnFemme = new JRadioButton("Femme");
		buttonGroup.add(rdbtnFemme);
		panel.add(rdbtnFemme);
		
		JCheckBox chckbxTennis = new JCheckBox("Tennis");
		chckbxTennis.setBounds(220, 11, 129, 23);
		frame.getContentPane().add(chckbxTennis);
		
		JCheckBox chckbxSquash = new JCheckBox("Squash");
		chckbxSquash.setBounds(220, 37, 129, 23);
		frame.getContentPane().add(chckbxSquash);
		
		JCheckBox chckbxNatation = new JCheckBox("Natation");
		chckbxNatation.setBounds(220, 63, 129, 23);
		frame.getContentPane().add(chckbxNatation);
		
		JCheckBox chckbxAthletisme = new JCheckBox("Athletisme");
		chckbxAthletisme.setBounds(220, 89, 129, 23);
		frame.getContentPane().add(chckbxAthletisme);
		
		JCheckBox chckbxRandonne = new JCheckBox("Randonne");
		chckbxRandonne.setBounds(220, 115, 129, 23);
		frame.getContentPane().add(chckbxRandonne);
		
		JCheckBox chckbxFoot = new JCheckBox("Foot");
		chckbxFoot.setBounds(220, 141, 129, 23);
		frame.getContentPane().add(chckbxFoot);
		
		JCheckBox chckbxBasket = new JCheckBox("Basket");
		chckbxBasket.setBounds(220, 167, 129, 23);
		frame.getContentPane().add(chckbxBasket);
		
		JCheckBox chckbxVolley = new JCheckBox("Volley");
		chckbxVolley.setBounds(220, 193, 129, 23);
		frame.getContentPane().add(chckbxVolley);
		
		JCheckBox chckbxPetanque = new JCheckBox("Petanque");
		chckbxPetanque.setBounds(220, 219, 129, 23);
		frame.getContentPane().add(chckbxPetanque);
		
		JLabel labelSexe = new JLabel("Sexe");
		frame.getContentPane().add(labelSexe);
		labelSexe.setBounds(10, 208, 34, 15);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(43, 263, 117, 25);
		frame.getContentPane().add(btnOk);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(172, 263, 117, 25);
		frame.getContentPane().add(btnAnnuler);
	}
}






