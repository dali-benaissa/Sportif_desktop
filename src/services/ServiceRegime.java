  /*    (ServiceExercice)
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services; 

import interfaces.IServiceRegime;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Regime ;
import utils.MaConnexion;

/**
 *
 * @author admin
 */
public class ServiceRegime implements IServiceRegime{
    
    //var
    MaConnexion instance = MaConnexion.getInstance();
    Connection cnx = instance.getCnx();

    @Override
    public void createRegime(Regime p) {
        
        //request
        String req = "INSERT INTO `Regime`(`aliments_autorises`, `aliments_interdits`, `petit_dejeuner`, `collation1`, `dejeuner`, `collation2`, `diner`, `conseils`) VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement st = cnx.prepareStatement(req);
            st.setString(1, p.getAlimentsAutorises());
            st.setString(2, p.getAlimentsInterdits());
            st.setString(3, p.getPetitDejeuner());
            st.setString(4, p.getCollation1());
            st.setString(5, p.getDejeuner());
            st.setString(6, p.getCollation2());
            st.setString(7, p.getDiner());
            st.setString(8, p.getConseils());

            st.executeUpdate();
            System.out.println("Regime ajoutée avec succes.");
            
        } catch (SQLException ex) {
            
            ex.printStackTrace(); 
        }
        
        
    }

    @Override
    public List<Regime> readRegimes() {
        ArrayList<Regime> Regimes = new ArrayList();
        
        try {
            Statement st = cnx.createStatement();
            String req = "SELECT * FROM Regime";
            ResultSet rs = st.executeQuery(req);
            
            while (rs.next()) {                
                
                Regimes.add(new Regime(rs.getInt(1), rs.getString("AlimentsAutorises"), rs.getString("AlimentsInterdits"),rs.getString("PetitDejeuner"), rs.getString("Collation1"), rs.getString("Dejeuner"), rs.getString("Collation2"),rs.getString("Diner"),rs.getString("Conseils")));
                
            }
            
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
        
        return Regimes;
    }

}




