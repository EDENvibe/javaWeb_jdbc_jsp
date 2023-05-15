/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controleur;
import AccesBD.MonAcces;
import java.sql.ResultSet;
import model.client;
/**
 *
 * @author PC
 */
public class controleur {
	public void insertionClient(client insert){ //le client eo anarana class n'ilay model (mba akana ao am le geter sy seter
		String sql = "INSERT INTO client(Num, Nom, Prenoms, Adresse, idVoiture	)  VALUES ('"+insert.getNum()+"', '"+insert.getNom()+"', '"+insert.getPrenom()+"', '"+insert.getAdress()+"', '"+insert.getIdVoiture()+"')";
		MonAcces bdd = new MonAcces();
		bdd.loadDriver();
		bdd.executeUpdate(sql);
		bdd.closeConnection();
	} 
    public ResultSet ReadClient(){
		String sql = "SELECT * FROM client";
		MonAcces bdd = new MonAcces();
		bdd.loadDriver();
		ResultSet rs = bdd.executeSelect(sql);
                return rs;
        }
    
     public ResultSet edition(client ins){
            String sql = "Select * from client Where Num = '"+ins.getNum()+"'";
            MonAcces bdd = new MonAcces();
            bdd.loadDriver();
            ResultSet rs = bdd.executeSelect(sql);
            return rs;
        }
      public void suppClient(client ins){
            String sql = "Delete from client where Num = '"+ins.getNum()+"'";
            MonAcces bdd = new MonAcces();
            bdd.loadDriver();
            bdd.executeUpdate(sql);
            bdd.closeConnection();
    } 
      public void editClient(client ins){
            String sql = "UPDATE client SET Nom = '"+ins.getNom()+"', Prenoms = '"+ins.getPrenom()+"', Adresse = '"+ins.getAdress()+"',idVoiture = '"+ins.getIdVoiture()+"' WHERE Num = '"+ins.getNum()+"' ";
            MonAcces bdd = new MonAcces();
            bdd.loadDriver();
            bdd.executeUpdate(sql);
            bdd.closeConnection();
        }
      
      public ResultSet ReadList(){
		String sql = "SELECT matricule,marque,Nom,Prenoms,Num,type FROM voitures INNER JOIN client ON client.idVoiture = voitures.idVoiture ORDER BY matricule ";
		MonAcces bdd = new MonAcces();
		bdd.loadDriver();
		ResultSet rs = bdd.executeSelect(sql);
                return rs;
        }
      
}