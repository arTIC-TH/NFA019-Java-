package controller;

import java.awt.event.ActionEvent;
import java.util.*;

import model.ContactDAO;
import model.ContactModel;
import view.View;

/**
 * 
 * @param modele
 * @param vue
 */
public class Controller {

	private ContactModel modele;
	private View vue;
	private ContactDAO contactDao;
	private ArrayList<ContactModel> arrayContacts=null;
	
	public Controller(ContactModel modele, View vue) {
		
		this.modele = modele;
		this.vue= vue;
		contactDao = new ContactDAO();
		initController();
		
	}
/*
 * *
 * *@param vue: interface graphique
 */
	public Controller(View vue) {
		this.vue = vue;
		contactDao = new ContactDAO();
		arrayContacts = contactDao.getAllContacts();
		vue.getList().setListData(arrayContacts.toArray());
		initController();
	}
/*
 * *
 */
	private void initController() {
		vue.getBtnNewButton_1().addActionListener(ActionEvent -> ajouterContact ());	
		
	
}

/*
 * 
 */
private void ajouterContact() {
	
	String nom = vue.getTxFieldNom().getText();
	String prenom = vue.getTxFieldPrenom().getText();
	String email = vue.getTxFieldMail().getText();
	String tel = vue.getTxFieldTel().getText();

	modele = new ContactModel ();
	modele.setNom(nom);
	modele.setPrenom(prenom);
	modele.setEmail(email);
	modele.setEmail(tel);
	
	contactDao.ajouterContact (modele);
	
	arrayContacts = contactDao.getAllContacts();
	vue.getList().setListData(arrayContacts.toArray());
	
	vue.getLblMessage().setText("Contact ajouté");
}