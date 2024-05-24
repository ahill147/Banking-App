package com.Hill.banking.service;

import java.util.List;

import com.Hill.banking.repository.dto.AccountDTO;

public interface AccountService {

	AccountDTO createAccount(AccountDTO accountDTO);
	
	AccountDTO getAccountById (Long id);
	
	AccountDTO deposit(Long id, double amount);
	
	AccountDTO withdraw(Long id, double amount);
	
	List<AccountDTO> getAllAccounts();
	
	void deleteAccount(Long id);
}
