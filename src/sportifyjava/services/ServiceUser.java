/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sportifyjava.Services;




import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import sportifyjava.utils.MyConnection;

/**
 *
 * @author SeifBS
 */
public class ServiceUser implements IServiceUser {

    private Connection Connexion;

    public ServiceUser() {
        cnx = MyConnection.getInstance().getCnx();

    }

    Connection cnx;

    public String verifier_data(String id, String password) { //Login user

        Statement stm = null;
        ResultSet rst = null;

        try {
            stm = cnx.createStatement();
            String query = "SELECT * FROM `user` WHERE (id='" + id + "' OR phonenumber='" + id + "'OR email='" + id + "') AND password='" + password + "'  ";
            rst = stm.executeQuery(query);
            if (rst.next()) {
              
              
                if ("Admin".equals(rst.getString("role"))) {
                    return "Admin";
                }
              
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        return "No";
    }

    public boolean check_password(String id, String password) { //Check password for modifier password

        Statement stm = null;
        ResultSet rst = null;

        try {
            stm = cnx.createStatement();
            String query = "SELECT * FROM `user` WHERE id='" + id + "' AND password='" + password + "'  ";
            rst = stm.executeQuery(query);
            if (rst.next()) {
                return true;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        return false;
    }

    public boolean verifier_id_email_bd(String id, String email) { //Mot De Passe oublié verification id et email

        Statement stm = null;
        ResultSet rst = null;

        try {
            stm = cnx.createStatement();
            String query = "SELECT * FROM `user` WHERE id='" + id + "' AND email='" + email + "' AND role!='CoachNV'  ";
            rst = stm.executeQuery(query);
            if (rst.next()) {
                return true;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

        return false;

    }

    public void modifier_password(String id, String password) {

        Statement stm;
        try {
            stm = cnx.createStatement();

            String query = "UPDATE user SET password='" + password + "' WHERE id='" + id + "'";
            stm.executeUpdate(query);

        } catch (SQLException ex) {
            Logger.getLogger(ServiceUser.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean verifier_id_bd(String id) { //Controle De Saisie si id existe
        Statement stm = null;
        ResultSet rst = null;

        try {
            stm = cnx.createStatement();
            String query = "SELECT * FROM `user` WHERE id='" + id + "'";
            rst = stm.executeQuery(query);
            if (rst.next()) {
                return true;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

        return false;
    }

    public boolean verifier_email_bd(String email) { //Controle De Saisie si id existe
        Statement stm = null;
        ResultSet rst = null;

        try {
            stm = cnx.createStatement();
            String query = "SELECT * FROM `user` WHERE email='" + email + "'";
            rst = stm.executeQuery(query);
            if (rst.next()) {
                return true;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

        return false;
    }

    public boolean verifier_phonenumber_bd(String phonenumber) { //Controle De Saisie si id existe
        Statement stm = null;
        ResultSet rst = null;

        try {
            stm = cnx.createStatement();
            String query = "SELECT * FROM `user` WHERE phonenumber='" + phonenumber + "'";
            rst = stm.executeQuery(query);
            if (rst.next()) {

                return true;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

        return false;
    }

    public boolean verifier_email_bd_modify(String email, String id) { //Controle De Saisie si id existe lors de la modifciation
        Statement stm = null;
        ResultSet rst = null;

        try {
            stm = cnx.createStatement();
            String query = "SELECT * FROM `user` WHERE email='" + email + "' AND id!='" + id + "'";
            rst = stm.executeQuery(query);
            if (rst.next()) {
                return true;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

        return false;
    }

    public boolean verifier_phonenumber_bd_modify(String phonenumber, String id) { //Controle De Saisie si id existe lors de la modifciation
        Statement stm = null;
        ResultSet rst = null;

        try {
            stm = cnx.createStatement();
            String query = "SELECT * FROM `user` WHERE phonenumber='" + phonenumber + "' AND id!='" + id + "'";
            rst = stm.executeQuery(query);
            if (rst.next()) {
                return true;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

        return false;
    }
}