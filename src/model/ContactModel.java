package model;

public class ContactModel {

	private int id;
	private String nom;
	private String prenom;
	private String email;
	private String tel;
        
	public ContactModel() {
		this.id = 0;
		this.nom = "";
		this.prenom = "";
		this.email = "";
		this.tel = "";
		
		
		
	}
	
	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param id
	 */
	public void setId(int id) {
		this.id =id;
	}
	
	/**
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom =nom;
	}
	
	/**
	 * @return prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	
	/**
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom =prenom;
	}
	
	/**
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email
	 */
	public void setEmail(String email) {
		this.email =email;
	}
	
	/**
	 * @return tel
	 */
	public String getTel() {
		return tel;
	}
	
	/**
	 * @param tel
	 */
	public void setTel(String tel) {
		this.tel =tel;
	}

    @Override
    public String toString() {
        //return "id : " + this.getId() + ", nom : " + this.getNom() + ", prenom : " + this.getPrenom() + ", email : " + this.getEmail() + ", tel : " + this.getTel(); 
        //To change body of generated methods, choose Tools | Templates.
        return "," + this.getId() + "," + this.getNom() + "," + this.getPrenom() + "," + this.getEmail() + "," + this.getTel(); 
        //To change body of generated methods, choose Tools | Templates.
 
    }
        
        
	
}
