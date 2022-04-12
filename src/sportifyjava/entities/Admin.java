/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportifyjava.entities;

 
public class Admin extends Users {

    public Admin( int id, String firstname, String lastname, String email, String password, String phonenumber, String role, String image) {
        super(id, firstname, firstname, email, password, phonenumber, role,image);
    }

    /*    private Admin(String id, String firstname, String firstname0, String email, String password, String phonenumber, String role, String image) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */

    public Admin() {}


    @Override
    public String toString() {
        return  super.getFirstname()+super.getFirstname()+ " ";
    }
    

}