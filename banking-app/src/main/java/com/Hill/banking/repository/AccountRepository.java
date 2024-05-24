package com.Hill.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hill.banking.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
