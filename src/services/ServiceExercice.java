/*    (ServiceExercice)
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import interfaces.IServiceExercice;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Exercice;
import utils.MaConnexion;

/**
 *
 * @author admin
 */
public class ServiceExercice implements IServiceExercice {

    //var
    MaConnexion instance = MaConnexion.getInstance();
    Connection cnx = instance.getCnx();

    public void createExercice(Exercice p) {

        //request
        try {
            String req = "INSERT INTO `Exercice`(`code`, `mouvement`, `description`) VALUES (?,?,?)";

            PreparedStatement st = cnx.prepareStatement(req);
            st.setString(1, p.getCode_exercice());
            st.setString(2, p.getMouvement());
            st.setString(3, p.getDescription());

            st.executeUpdate();
            System.out.println("Exercice ajoutée avec succes.");

        } catch (SQLException ex) {

            ex.printStackTrace();
        }

    }

    public List<Exercice> readExercices() {
        ArrayList<Exercice> Exercices = new ArrayList();

        try {
            Statement st = cnx.createStatement();
            String req = "SELECT * FROM Exercice";
            ResultSet rs = st.executeQuery(req);

            while (rs.next()) {

                Exercices.add(new Exercice(rs.getInt(1), rs.getString("mouvement"), rs.getString("description"), rs.getInt(3), rs.getString(4), rs.getDate(5)));

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return Exercices;
    }

}
