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

        /*vue.getLblMessage().setText("Contact ajouté");
        vue.getLbID_2().setText(modele.getId() + "");*/

    }

}
