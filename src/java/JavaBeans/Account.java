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
public class Account implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountId;
    private User user;
    private double balance;
    
    public Account() {
    } 
    
    public Account(User user) {
        this.user = user;
        balance = 0;
    } 
    public long getAccountId() {
        return accountId;
    }
    public void setAddress(long accountId) {
        this.accountId = accountId;
    }
    public void credit (double amount) {
        this.balance += amount;
    }
    public void debit (double amount) {
        this.balance -= amount;
    }
    public double getBalance() {
        return this.balance;
    }
}
