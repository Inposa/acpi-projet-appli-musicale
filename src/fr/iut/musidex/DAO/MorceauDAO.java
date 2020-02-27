package fr.iut.musidex.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MorceauDAO {
	
	private static MorceauDAO instance;
	private Connection cn;
	private Statement st;
	private CallableStatement cstInsererMorceau;
	private CallableStatement cstModifierMorceau;
	private ResultSet rs;
	
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
			rs = st.executeQuery("SELECT m.* FROM Morceaux m");
			cstInsererMorceau = cn.prepareCall("{CALL insererMorceau(?,?,?,?)}");
			cstModifierMorceau = cn.prepareCall("{CALL modifierMorceau(?,?,?,?)}");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void fermerConnexion() {
		try {
			rs.close();
			cst.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void insererMorceau(I_Morceau morceau) {
		cstInsererMorceau.setString(1, morceau.getTitre());
		cstInsererMorceau.setString(2, morceau.getInterprete());
		cstInsererMorceau.setString(3, morceau.getTonalite());
		cstInsererMorceau.setFloat(4, morceau.getDuree());
		cstInsererMorceau.execute();
	}
	
	public void modifierMorceau(I_Morceau morceau) {
		cstModifierMorceau.setString(1, morceau.getTitre());
		cstModifierMorceau.setString(2, morceau.getInterprete());
		cstModifierMorceau.setString(3, morceau.getTonalite());
		cstModifierMorceau.setFloat(4, morceau.getDuree());
		cstModifierMorceau.execute();
	}
	
	public void supprimerMorceau(I_Morceau morceau) {
		
	}
	

}
