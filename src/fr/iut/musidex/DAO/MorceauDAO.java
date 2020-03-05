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
	
	private String getMorceauxQuery = "SELECT m.* FROM Morceau m";
	
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
		setDataIntoCallableStatement(cstInsererMorceau, morceau.getId(), morceau.getNom(), morceau.getInterprete(),
				morceau.getParoles(), morceau.getPartition(), morceau.getTonaliteOriginale().toString(),
				morceau.getTonaliteJouee().toString(), morceau.getDuree(), morceau.getCommentaire(),
				morceau.getLienYT(), morceau.getImage());
		cstInsererMorceau.execute();
		getMorceauxFromDB();
	}
	
	public void modifierMorceau(I_Morceau morceau) throws SQLException {
		setDataIntoCallableStatement(cstModifierMorceau, morceau.getId(), morceau.getNom(), morceau.getInterprete(),
				morceau.getParoles(), morceau.getPartition(), morceau.getTonaliteOriginale().toString(),
				morceau.getTonaliteJouee().toString(), morceau.getDuree(), morceau.getCommentaire(),
				morceau.getLienYT(), morceau.getImage());
		cstModifierMorceau.execute();
		getMorceauxFromDB();
	}
	
	public void supprimerMorceau(I_Morceau morceau) throws SQLException {
		cstSupprimerMorceau.setInt(1, morceau.getId());
		cstSupprimerMorceau.execute();
		getMorceauxFromDB();
	}
	
	
	private void setDataIntoCallableStatement(CallableStatement cst, int id, String nom, String interprete,
			String paroles, String partition, String tonaliteOriginale, String tonaliteJouee,
			float duree, String commentaire, String lienYT, String image) {
		try {
			cst.setInt(1, id);
			cst.setString(2, nom);
			cst.setString(3, interprete);
			cst.setString(4, paroles);
			cst.setString(5, partition);
			cst.setString(6, tonaliteOriginale);
			cst.setString(7, tonaliteJouee);
			cst.setFloat(8, duree);
			cstInsererMorceau.setString(9, commentaire);
			cstInsererMorceau.setString(10, lienYT);
			cstInsererMorceau.setString(11, image);
		} catch (SQLException e) {
			e.printStackTrace();
		}
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
