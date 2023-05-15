/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author PC
 */
public class client {
    private int idVoiture;
    private int Num;
    private String Nom;
    private String Prenom;
    private String Adress;

    public int getIdVoiture() {
        return idVoiture;
    }

    public void setIdVoiture(int idVoiture) {
        this.idVoiture = idVoiture;
    }
    
    
    public int getNum() {
        return Num;
    }
    public void setNum(int Num) {
        this.Num = Num;
    }
   /* public int getNum() {
        return Num;
    }

    public void setNum(int Num) {
        this.Num = Num;
    }*/

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

}
