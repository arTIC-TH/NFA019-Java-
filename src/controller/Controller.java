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
    private ArrayList<ContactModel> arrayContacts = null;

    public Controller(ContactModel modele, View vue) {

        this.modele = modele;
        this.vue = vue;
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
        vue.getBtnNewButton_1().addActionListener(ActionEvent -> ajouterContact());
		// codigo prof vue.getBtnAjouter().addActionListener(ActionEvent -> ajouterContact());
		vue.getList().addListSelectionListener(ListSlectionEvent -> selectionnerContact());
		// verificar el nombre del boton
		vue.getBtnModifier().addActionListener(ActionEvent -> modifierContact());

    }

    private void ajouterContact() {

        String nom = vue.getTextFieldNom().getText();
        String prenom = vue.getTextFieldPrenom().getText();
        String email = vue.getTextFieldMail().getText();
        String tel = vue.getTextFieldTel().getText();

        modele = new ContactModel();
        modele.setNom(nom);
        modele.setPrenom(prenom);
        modele.setEmail(email);
        modele.setTel(tel);

        contactDao.ajouterContact(modele);

        arrayContacts = contactDao.getAllContacts();
        vue.getList().setListData(arrayContacts.toArray());
        
    }
    
    
    private void selectionnerContact() {
    	int index = vue.getList().getSelectedIndex();
    	if (index == -1)
		return;

    	ContactModel modele = (ContactModel) arrayContacts.get(index);

    	vue.getLabelID().setText(modele.getId() + "");
    	vue.getTextFieldNom().setText(modele.getNom());
    	vue.getTextFieldPrenom().setText(modele.getPrenom());
    	vue.getTextFieldMail().setText(modele.getEmail());
    	vue.getTextFieldTel().setText(modele.getTel());

    }

    private void modifierContact() {

    	// revisar el objeto en VIEW y como llamar el ID
    	String idcontact = vue.getLabelID().getText();
    	int contactId = Integer.parseInt(idcontact);
    	String nom = vue.getTextFieldNom().getText();
        String prenom = vue.getTextFieldPrenom().getText();
        String email = vue.getTextFieldMail().getText();
        String tel = vue.getTextFieldTel().getText();

        modele = new ContactModel();
        modele.setId(contactId);
        modele.setNom(nom);
        modele.setPrenom(prenom);
        modele.setEmail(email);
        modele.setTel(tel);
        contactDao.modifierContact(modele);
        
        arrayContacts = contactDao.getAllContacts();
        vue.getList().setListData(arrayContacts.toArray());

    }


    }

