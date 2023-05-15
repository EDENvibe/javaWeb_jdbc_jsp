/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controleur;
import AccesBD.MonAcces;
import java.sql.ResultSet;
import model.voiture;
/**
 *
 * @author PC
 */
public class controleurVoiture {
    
    public void insertionVoiture(voiture insert){ //le client eo anarana class n'ilay model (mba akana ao am le geter sy seter
		String sql = "INSERT INTO voitures(matricule, marque, type)  VALUES ('"+insert.getMatricule()+"', '"+insert.getMarque()+"', '"+insert.getType()+"')";
		MonAcces bdd = new MonAcces();
		bdd.loadDriver();
		bdd.executeUpdate(sql);
		bdd.closeConnection();
	} 
    public ResultSet ReadVoiture(){
		String sql = "SELECT * FROM voitures";
		MonAcces bdd = new MonAcces();
		bdd.loadDriver();
		ResultSet rs = bdd.executeSelect(sql);
                return rs;
        }
    
     public ResultSet edition(voiture ins){
            String sql = "Select * from voitures Where idVoiture = '"+ins.getIdVoitur()+"'";
            MonAcces bdd = new MonAcces();
            bdd.loadDriver();
            ResultSet rs = bdd.executeSelect(sql);
            return rs;
        }
      public void suppVoiture(voiture ins){
            String sql = "Delete from voitures where idVoiture = '"+ins.getIdVoitur()+"'";
            MonAcces bdd = new MonAcces();
            bdd.loadDriver();
            bdd.executeUpdate(sql);
            bdd.closeConnection();
    } 
      public void editVoiture(voiture ins){
            String sql = "UPDATE voitures SET matricule = '"+ins.getMatricule()+"', marque = '"+ins.getMarque()+"', type = '"+ins.getType()+"' WHERE idVoiture = '"+ins.getIdVoitur()+"' ";
            MonAcces bdd = new MonAcces();
            bdd.loadDriver();
            bdd.executeUpdate(sql);
            bdd.closeConnection();
        }
}
