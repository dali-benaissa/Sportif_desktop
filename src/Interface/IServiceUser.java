/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;


public interface IServiceUser {

    public String verifier_data(String id, String password);

    public boolean verifier_id_email_bd(String id, String email);

    public boolean verifier_id_bd(String id);

    public void modifier_password(String id, String password);

  

    boolean test_num_telephonique(String phonenumber);

    public boolean test_phonenumber(String phonenumber);

    public boolean test_Email(String cin);

    public boolean test_Password(String password);

    public boolean check_password(String id, String password);

    public void modifierPassword(String id, String password);

    public boolean verifier_phonenumber_bd(String phonenumber);

    public boolean verifier_email_bd(String email);

    public boolean verifier_phonenumber_bd_modify(String phonenumber, String id);

    public boolean verifier_email_bd_modify(String email, String id);

    public int nb_admins();

    public int nb_clients();

    public int nb_coachsV();

    public int nb_coachsNV();

    public String crypter_password(String password);

 

    public String getRole(String id);

    public void modifierImage(String id, String image);

   

}