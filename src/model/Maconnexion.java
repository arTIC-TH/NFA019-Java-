package model;

import java.io.*;
import java.sql.*;
import java.util.*;

//class de connexion avec la basse de donnes
public class Maconnexion {

	private static String dbURL = "jdbc:mysql://localhost:3306/bdcontact";
	private static String user = "root";
	private static String password = "770829-Terol";
	private static Connection connexion = null;
			

	/**
	 * Contructeur par defaut
	 */
			
	public Maconnexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connexion = DriverManager.getConnection(dbURL, user, password);
			System.out.println("Conection ok!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Cr�er ou retourner une connexion 
	 * @return connexion
	 */

	public static Connection getConnection() {
		if (connexion == null) {
			new Maconnexion ();
		}
		return connexion;
	}
	
	/**
	 * Fermer la connexion � la base de donn�es
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
