/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package admincine;

import entitats.Genere;
import entitats.Pase;
import entitats.Pelicula;
import entitats.Sala;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author torandell9
 */
public class recursosBD {

    Session session;

    public recursosBD() {
        this.session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
    }

    public ArrayList<Pelicula> getPelicules() {
        return (ArrayList<Pelicula>) this.getSelect("from Pelicula");
    }

    public void borrarPelicula(Pelicula p) {
        session.delete(p);
        session.getTransaction().commit(); //tanca la sessió perque fagi el commit. 
        session.beginTransaction();
    }

    public void actualitzarPelicula(Pelicula p) {
        session.update(p);
        session.getTransaction().commit(); //tanca la sessió perque fagi el commit. 
        session.beginTransaction();//reinicia sessió
    }

    public void guardarPelicula(Pelicula p) {
        session.save(p);
        session.getTransaction().commit(); //tanca la sessió perque fagi el commit. 
        session.beginTransaction();//reinicia sessió
    }

    public ArrayList<Genere> getGeneres() {
        return this.getSelect("from Genere");
    }

    /**
     * *************** *
     * PANEL DE PASES * ****************
     */
    public ArrayList<Pase> getPases() {
        Date date = (Date) Calendar.getInstance().getTime();
        SimpleDateFormat dataAvui = new SimpleDateFormat("yyyy-MM-dd");
        String avui = dataAvui.format(date);
        String hql = "from Pase p where p.dia>='" + avui + "' order by dia, hora asc";
        return this.getSelect(hql);
    }

    public ArrayList<Sala> getSales() {
        return this.getSelect("from Sala");
    }
    
    public void guardarPase(Pase p) {
        session.save(p);
        session.getTransaction().commit(); //tanca la sessió perque fagi el commit. 
        session.beginTransaction();//reinicia sessió
    }

    /**
     * Métode generic al que se l'hi passa la sentencia HQL i retorna un
     * ArrayList dels resultats
     *
     * @param hql : Sentencia hql que s'ha d'executar
     * @return ArrayList amb els resultats de la consulta
     */
    private ArrayList getSelect(String hql) {
        try {
            Query q = session.createQuery(hql);
            ArrayList resultList = (ArrayList) q.list();
            return resultList;
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        return null;
    }
}
