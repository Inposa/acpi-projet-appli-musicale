package fr.umontpellier.etu.musidex.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.umontpellier.etu.musidex.modele.I_Morceau;
import fr.umontpellier.etu.musidex.modele.Morceau;

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
		this.cn = ConnexionDAO.getInstance().getConnection();
		createStatements();
	}

	public static MorceauDAO getInstance() {
		if (MorceauDAO.instance == null) {
			MorceauDAO.instance = new MorceauDAO();
		}
		return MorceauDAO.instance;
	}
	
	private void createStatements() {
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
			cstSupprimerMorceau.close();
			st.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
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
	
	public List<I_Morceau> getListeMorceaux() {
		List<I_Morceau> morceaux = new ArrayList<I_Morceau>();
		try {
			rs.beforeFirst();
			while (rs.next()) {
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return morceaux;
	}

}
