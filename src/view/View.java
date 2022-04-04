package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import java.awt.Component;
import java.awt.Button;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;
import java.awt.List;
import javax.swing.JEditorPane;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class View {

	public JFrame frame;
	public JTextField textFieldNom;
	public JTextField textFieldPrenom;
	public JTextField textFieldMail;
	public JTextField textFieldTel;
	private JList list;
	private JButton BtnAjouter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
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
	public View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 894, 546);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 340, 509);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Nom:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.setLayout(new GridLayout(0, 2, 20, 20));
		panel.add(lblNewLabel);
		
		textFieldNom = new JTextField();
		textFieldNom.setColumns(10);
		panel.add(textFieldNom);
		
		JLabel lblNewLabel_1 = new JLabel("Prenom:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);
		
		// >Funcion adjuntar contacto
		BtnAjouter = new JButton("Ajouter");
		
		textFieldPrenom = new JTextField();
		textFieldPrenom.setColumns(10);
		panel.add(textFieldPrenom);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1_1);
		
		textFieldMail = new JTextField();
		textFieldMail.setColumns(10);
		panel.add(textFieldMail);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Tel:");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1_1_1);
		
		textFieldTel = new JTextField();
		textFieldTel.setColumns(10);
		panel.add(textFieldTel);
		panel.add(BtnAjouter);
		
		JButton BtnModifier = new JButton("Modifier");
		panel.add(BtnModifier);
		
		JButton BtnSupprimer = new JButton("Supprimer");
		panel.add(BtnSupprimer);
		
		JButton btnSupprimer = new JButton("Effacer");
		panel.add(btnSupprimer);
		
		JLabel label = new JLabel("");
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("");
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("");
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("");
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("");
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("");
		panel.add(label_6);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(340, 0, 540, 809);
		frame.getContentPane().add(scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
	}

	public JButton getBtnNewButton_1() {
		return BtnAjouter;
	}

	public void setBtnNewButton_1(JButton btnNewButton_1) {
		this.BtnAjouter = btnNewButton_1;
	}

	public JList getList() {
		return list;
	}

	public void setList(JList list) {
		this.list = list;
	}

    public JTextField getTextFieldNom() {
        return textFieldNom;
    }

    public void setTextFieldNom(JTextField textFieldNom) {
        this.textFieldNom = textFieldNom;
    }

    public JTextField getTextFieldPrenom() {
        return textFieldPrenom;
    }

    public void setTextFieldPrenom(JTextField textFieldPrenom) {
        this.textFieldPrenom = textFieldPrenom;
    }

    public JTextField getTextFieldMail() {
        return textFieldMail;
    }

    public void setTextFieldMail(JTextField textFieldMail) {
        this.textFieldMail = textFieldMail;
    }

    public JTextField getTextFieldTel() {
        return textFieldTel;
    }

    public void setTextFieldTel(JTextField textFieldTel) {
        this.textFieldTel = textFieldTel;
    }
	
}
