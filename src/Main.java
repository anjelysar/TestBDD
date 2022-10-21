import java.sql.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clavier = new Scanner (System.in);
		
		Connection connexion = null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection nom_connexion = DriverManager.getConnection("jdbc:mysql://172.16.203.203/bdd_Personne?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC", "sio", "slam");
		nom_connexion.close(); // Fermeture de la connexion
		} 
		
		catch (ClassNotFoundException e)
		{
			System.out.println("Erreur du chargement du pilote");
		}
		catch(SQLException erreur) { 
			System.out.println("La connexion à la base de données a échoué ou Erreur SQL…" + erreur);
		}
		try {
			Statement st = connexion.createStatement();
			st.executeUpdate("INSERT INTO Personne (idPersonne, nomPersonne, prenomPersonne, emailPersonne) VALUES (3, 'Sarvananthan', 'Anjely', 's.anjely@hotmail.fr');");
		}
		catch(SQLException erreur) { 
			System.out.println("La connexion à la base de données a échoué ou Erreur SQL…" + erreur);
		}
		try {
			int id;
			String nom;
			String prenom;
			Statement st;
			ResultSet rs = st.executeQuery("SELECT * FROM Personne");
			while (rs.next()) {
				id = rs.getInt(id);
				nom = rs.getString(1);
				prenom = rs.getString(2);
				System.out.println("id = " + nom + "nom = " + prenom + "prenom = ");
		}
		rs.close();
		nom_connexion.close();
		
		catch(SQLException e) { 
			System.out.println();
		}
		

	}

}
