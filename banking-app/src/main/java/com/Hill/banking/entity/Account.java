package com.Hill.banking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "accounts")
public class Account {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "account_holder_name")
    private String accountHolderName;
    private double balance;
    
 // Explicit no-argument constructor
    public Account() {
    }

    // Constructor
    public Account(Long id, String accountHolderName, double balance) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

    // Getters and setters
    // You can generate getters and setters using your IDE or Lombok annotations
    
    
  //@Setter
  //@Getter
  //@NoArgsConstructor
  //@AllArgsConstructor
  //@Table(name= "accounts")
  //@Data
  //@Entity
  //public class Account {
  //	
//  	@Id
//  	@GeneratedValue(strategy = GenerationType.IDENTITY)
//  	private Long id;
//  	@Column(name = "account_holder_name")
//  	private String accountHolderName;
//  	private double balance;
  //}


  //import javax.persistence.Column;
  //import javax.persistence.Entity;
  //import javax.persistence.GeneratedValue;
  //import javax.persistence.GenerationType;
  //import javax.persistence.Id;
  //import javax.persistence.Table;
}