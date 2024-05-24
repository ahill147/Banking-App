package com.Hill.banking.repository.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountDTO {
	
	private Long id;
	private String accountHolderName;
	private double balance;
	
	public Long getId() {
        return id;
    }
	
	public AccountDTO(Long id, String accountHolderName, double balance) {
		super();
		this.id = id;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public String getAccountHolderName() {
        return accountHolderName;
    }
	
	public double getBalance() {
        return balance;
    }
	
	
	// Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}


