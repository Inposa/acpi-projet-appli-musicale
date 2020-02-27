package fr.umontpellier.etu.musidex.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import fr.umontpellier.etu.musidex.modele.I_Morceau;

public class MorceauDAO {
	
	private static MorceauDAO instance;
	private Connection cn;
	private Statement st;
	private CallableStatement cstInsererMorceau;
	private CallableStatement cstModifierMorceau;
	private CallableStatement cstSupprimerMorceau;
	private ResultSet rs;
	
	private String getMorceauxQuery = "SELECT m.* FROM Morceaux m";
	
	private MorceauDAO() {
		ouvrirConnexion();
		creationDesStatements();
	}

	public static MorceauDAO getInstance() {
		if (instance == null) {
			instance = new MorceauDAO();
		}
		return instance;
	}
	
	private void ouvrirConnexion() {
		String url = "jdbc:oracle:thin:@162.38.222.149:1521:iut";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String login = "pechh";
		String mdp = "OracleHippo";
		
		try {
			Class.forName(driver);
			
			try {
				cn = DriverManager.getConnection(url, login, mdp);
				System.out.println("Connexion à la base de données réussie");
				
			} catch (SQLException e) {
				System.out.println("Echec de la connexion à la base de données");
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("Driver non trouvé");
			e.printStackTrace();
		}
	}
	
	private void creationDesStatements() {
		try {
			st = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery(getMorceauxQuery);
			cstInsererMorceau = cn.prepareCall("{CALL insererMorceau(?,?,?,?,?)}");
			cstModifierMorceau = cn.prepareCall("{CALL modifierMorceau(?,?,?,?,?)}");
			cstModifierMorceau = cn.prepareCall("{CALL supprimerMorceau(?)");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void fermerConnexion() {
		try {
			rs.close();
			cstInsererMorceau.close();
			cstModifierMorceau.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	public void insererMorceau(I_Morceau morceau) throws SQLException {
		cstInsererMorceau.setInt(1, morceau.getId());
		cstInsererMorceau.setString(2, morceau.getNom());
		cstInsererMorceau.setString(3, morceau.getInterprete());
		cstInsererMorceau.setString(4, morceau.getTonalite().toString());
		cstInsererMorceau.setFloat(5, morceau.getDuree());
		cstInsererMorceau.execute();
		getMorceauxFromDB();
	}
	
	public void modifierMorceau(I_Morceau morceau) throws SQLException {
		cstModifierMorceau.setInt(1, morceau.getId());
		cstModifierMorceau.setString(1, morceau.getNom());
		cstModifierMorceau.setString(2, morceau.getInterprete());
		cstModifierMorceau.setString(3, morceau.getTonalite().toString());
		cstModifierMorceau.setFloat(4, morceau.getDuree());
		cstModifierMorceau.execute();
		getMorceauxFromDB();
	}
	
	public void supprimerMorceau(I_Morceau morceau) throws SQLException {
		cstSupprimerMorceau.setInt(1, morceau.getId());
		cstSupprimerMorceau.execute();
		getMorceauxFromDB();
	}
	
	private void getMorceauxFromDB() {
		try {
			rs = st.executeQuery(getMorceauxQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
