package entitats;
// Generated 28-may-2013 11:38:32 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * TipusSala generated by hbm2java
 */
public class TipusSala  implements java.io.Serializable {


     private Integer idtipusSales;
     private String nom;
     private Set butacas = new HashSet(0);
     private Set salas = new HashSet(0);

    public TipusSala() {
    }

    public TipusSala(String nom, Set butacas, Set salas) {
       this.nom = nom;
       this.butacas = butacas;
       this.salas = salas;
    }
   
    public Integer getIdtipusSales() {
        return this.idtipusSales;
    }
    
    public void setIdtipusSales(Integer idtipusSales) {
        this.idtipusSales = idtipusSales;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Set getButacas() {
        return this.butacas;
    }
    
    public void setButacas(Set butacas) {
        this.butacas = butacas;
    }
    public Set getSalas() {
        return this.salas;
    }
    
    public void setSalas(Set salas) {
        this.salas = salas;
    }




}


