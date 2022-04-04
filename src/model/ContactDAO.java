package model;

import java.sql.*;
import java.util.*;

/*
 * <<<data access Object (DAO) pour le contact	
 * 
 * 
 */
public class ContactDAO {

    private Connection conn;

    // constructor
    public ContactDAO() {
        conn = Maconnexion.getConnection();
    }

    /**
     *
     * @param contM : un objet ContacModel contM) {
     */
    public void ajouterContact(ContactModel contM) {
        try {
            PreparedStatement preparedStatement = conn
                    .prepareStatement("insert into contacts (nom_cont,prenom_cont,email_cont,tel_cont) values (?,?,?,?)");

            preparedStatement.setString(1, contM.getNom());
            preparedStatement.setString(2, contM.getPrenom());
            preparedStatement.setString(3, contM.getEmail());
            preparedStatement.setString(4, contM.getTel());
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("SQLException : " + ex.getMessage());
            System.out.println("SQLState : " + ((SQLException) ex).getSQLState());
            System.out.println("VendorError : " + ((SQLException) ex).getErrorCode());
        }
    }

    public ArrayList<ContactModel> getAllContacts() {

        ArrayList<ContactModel> contMListe = new ArrayList<ContactModel>();
        try {
            Statement statement = conn.createStatement();
            ResultSet resultats = statement.executeQuery("select * from contacts order by id_cont");
            while (resultats.next()) {
                ContactModel contM = new ContactModel();
                contM.setId(resultats.getInt("id_cont"));
                contM.setNom(resultats.getString("nom_cont"));
                contM.setPrenom(resultats.getString("prenom_cont"));
                contM.setEmail(resultats.getString("email_cont"));
                contM.setTel(resultats.getString("tel_cont"));
                contMListe.add(contM);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contMListe;
    }

}