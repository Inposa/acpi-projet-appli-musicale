package fr.iut.musidex.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.iut.musidex.entity.I_Morceau;
import fr.iut.musidex.entity.Morceau;
import fr.iut.musidex.entity.Tonalite;

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
			cstInsererMorceau = cn.prepareCall("{CALL insererMorceau(?,?,?,?,?,?,?,?)}");
			cstModifierMorceau = cn.prepareCall("{CALL modifierMorceau(?,?,?,?,?,?,?,?)}");
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
		cstInsererMorceau.setString(4, morceau.getParoles());
		cstInsererMorceau.setString(5, morceau.getPartition());
		cstInsererMorceau.setString(6, morceau.getTonalite().toString());
		cstInsererMorceau.setFloat(7, morceau.getDuree());
		cstInsererMorceau.setString(8, morceau.getLienYT());
		cstInsererMorceau.execute();
		getMorceauxFromDB();
	}
	
	public void modifierMorceau(I_Morceau morceau) throws SQLException {
		cstModifierMorceau.setInt(1, morceau.getId());
		cstModifierMorceau.setString(2, morceau.getNom());
		cstModifierMorceau.setString(3, morceau.getInterprete());
		cstModifierMorceau.setString(4, morceau.getParoles());
		cstModifierMorceau.setString(5, morceau.getPartition());
		cstModifierMorceau.setString(6, morceau.getTonalite().toString());
		cstModifierMorceau.setFloat(7, morceau.getDuree());
		cstModifierMorceau.setString(8, morceau.getLienYT());
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
				int id = rs.getInt("id");
				String nom = rs.getString("nom");
				String interprete = rs.getString("interprete");
				String paroles = rs.getString("paroles");
				String partition = rs.getString("partition");
				Tonalite tonalite = Tonalite.valueOf(rs.getString("tonalite"));
				float duree = rs.getFloat("duree");
				String lienYT = rs.getString("lienYT");
				I_Morceau morceau = new Morceau(id, nom, interprete, paroles, partition, tonalite, duree, lienYT);
				morceaux.add(morceau);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return morceaux;
	}

}
