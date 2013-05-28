package entitats;
// Generated 28-may-2013 11:38:32 by Hibernate Tools 3.2.1.GA



/**
 * Entrada generated by hbm2java
 */
public class Entrada  implements java.io.Serializable {


     private Integer idEntrada;
     private Butaca butaca;
     private Tarifa tarifa;
     private Pase pase;

    public Entrada() {
    }

    public Entrada(Butaca butaca, Tarifa tarifa, Pase pase) {
       this.butaca = butaca;
       this.tarifa = tarifa;
       this.pase = pase;
    }
   
    public Integer getIdEntrada() {
        return this.idEntrada;
    }
    
    public void setIdEntrada(Integer idEntrada) {
        this.idEntrada = idEntrada;
    }
    public Butaca getButaca() {
        return this.butaca;
    }
    
    public void setButaca(Butaca butaca) {
        this.butaca = butaca;
    }
    public Tarifa getTarifa() {
        return this.tarifa;
    }
    
    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }
    public Pase getPase() {
        return this.pase;
    }
    
    public void setPase(Pase pase) {
        this.pase = pase;
    }




}


