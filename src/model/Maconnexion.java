package model;

import java.io.*;
import java.sql.*;
import java.util.*;

//class de connexion avec la basse de donneés
public class Maconnexion {

	private static String dbURL = "jdbc:mysql://localhost:3306/bdcontact?useSSL=false&serverTimezone=UTC";
	private static String user = "root";
	private static String password = "770829-Terol";
	private static Connection connexion = null;
			

	/**
	 * Contructeur par défaut
	 */
			
	public Maconnexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connexion = DriverManager.getConnection(dbURL, user, password);
			System.out.println("Conectée ok!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Créer ou retourner une connexion 
	 * @return connexion
	 */

	public static Connection getConnection() {
		if (connexion == null) {
			new Maconnexion ();
		}
		return connexion;
	}
	
	/**
	 * Fermer la connexion à la base de données
	 */
	public static void stop() {
		if (connexion != null) {
			try {
				connexion.close();
			} catch (SQLException e) {
				e.printStackTrace();			
			}
		}
	}
	
	public static void main(String[] args) {
		getConnection();
	}
}
