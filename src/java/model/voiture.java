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
public class voiture {
    
    private int idVoitur ;
    private String  matricule;
    private String marque;
    private String type;

    public int getIdVoitur() {
        return idVoitur;
    }

    public void setIdVoitur(int idVoitur) {
        this.idVoitur = idVoitur;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

   
    
}
