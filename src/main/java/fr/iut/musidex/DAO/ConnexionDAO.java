package fr.iut.musidex.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionDAO {
	private Connection cn;
	private static ConnexionDAO instance = null;
	
	public static ConnexionDAO getInstance() {
		if(ConnexionDAO.instance == null){
			ConnexionDAO.instance = new ConnexionDAO();
		}
		return ConnexionDAO.instance;
	}
	
	private ConnexionDAO() {
		this.ouvrirConnexion();
	}
	
	public Connection getConnection() {
		return this.cn;
	}
	
	private void ouvrirConnexion() {
		String url = "jdbc:oracle:thin:@162.38.222.149:1521:iut";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String login = "pechh";
		String mdp = "OracleHippo";
		
		try {
			Class.forName(driver);
			
			try {
				this.cn = DriverManager.getConnection(url, login, mdp);
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
	
	public void fermerConnexion() throws SQLException {
		this.cn.close();
	}
}
