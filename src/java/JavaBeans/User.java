/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBeans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String zipcode;
    private String state;
    private String city;
    private String address;
    private String username;
    private String password;
    
    public User() {
        firstName = "";
        lastName = "";
        email = "";
        zipcode ="";
        city = "";
        state ="";
        phone = "";
        username = "";
        password = "";
    } 
    public long getUserId() {
        return userId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getZipCode() {
        return zipcode;
    }
    public void setZipCode(String ZipCode) {
        this.zipcode = ZipCode;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String State) {
        this.state = State;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String Phone) {
        this.phone = Phone;
    }
    public String getusername() {
        return username;
    }
    public void setUsername(String Username) {
        this.username = Username;
    }
    public String getpassword() {
        return password;
    }
    public void setPassword(String Password) {
        this.password = Password;
    }
    public String getaddress() {
        return address;
    }
    public void setAddress(String Address) {
        this.address = Address;
    }
}
