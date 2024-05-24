package com.Hill.banking.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hill.banking.repository.dto.AccountDTO;
import com.Hill.banking.service.AccountService;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

	private AccountService accountService;

	public AccountController(AccountService accountService) {
		super();
		this.accountService = accountService;
	}
	
	// Add Account REST API
	@PostMapping
	public ResponseEntity<AccountDTO> addAccount(@RequestBody AccountDTO accountDTO) {
		return new ResponseEntity<>(accountService.createAccount(accountDTO), HttpStatus.CREATED);
	}
	
	// Get Account REST API
	@GetMapping("/{id}")
	public ResponseEntity<AccountDTO> getAccountById(@PathVariable Long id) {
		AccountDTO accountDTO = accountService.getAccountById(id);
		return ResponseEntity.ok(accountDTO);
	}
	
	// Deposit REST API
	@PutMapping("/{id}/deposit")
	public ResponseEntity<AccountDTO> deposit(@PathVariable Long id, @RequestBody Map<String, Double> request) {
		Double amount = request.get("amount");
		AccountDTO accountDTO = accountService.deposit(id, amount);
		return ResponseEntity.ok(accountDTO);
	}
	
	// Withdraw REST API
	@PutMapping("/{id}/withdraw")
	public ResponseEntity<AccountDTO> withdraw(@PathVariable Long id, @RequestBody Map<String, Double> request) {
		double amount = request.get("amount");
		AccountDTO accountDTO = accountService.withdraw(id, amount);
		return ResponseEntity.ok(accountDTO);
	}
	
	// Get All Accounts REST API
	@GetMapping
	public ResponseEntity<List<AccountDTO>> getAllAccounts() {
		List<AccountDTO> accounts = accountService.getAllAccounts();
		return ResponseEntity.ok(accounts);
	}
	
	// Delete Account REST API
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteAccount(@PathVariable Long id) {
		accountService.deleteAccount(id);
		return ResponseEntity.ok("Account Deleted!");
	}
}
