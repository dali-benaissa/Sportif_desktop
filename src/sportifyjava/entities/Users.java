/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportifyjava.entities;

/**
 *
 * @author 21653
 */
public abstract class Users {
    
    private int id;
    private int age;
    private String phonenumber;
    private String firstname;
    private String lastname;
    private String bio;
    private String image;
    private String email;
    private String password;
    private String role;

    public Users(){};
    
    /**
     *
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }
    
     public void setBio(String bio) {
        this.bio = bio;
    }

     public void setLastname(String lastname) {
        this.lastname = lastname;
    }
     
    public void setId(int id) {
        this.id = id;
    }
    
     public void setAge(int age) {
        this.age = age;
    }
     
     public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setRole(String role) {
        this.role = role;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getrole() {
        return role;
    }
    
    public String getPhonenumber() {
        return phonenumber;
    }
    
    public String getLastname() {
        return lastname;
    }

  
    public String getImage() {
        return image;
    }
    
    public String getBio() {
        return bio;
    }
    
    /**
     *
     * @param id
     * @param firstname
     * @param lastname
     * @param email
     * @param password
     * @param phonenumber
     * @param role
     * @param image
     */
   
    public Users(int id, String firstname, String lastname, String email, String password, String phonenumber, String role, String image) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.phonenumber = phonenumber;
        this.role = role;
        this.image = image;
     
    }
   
}

