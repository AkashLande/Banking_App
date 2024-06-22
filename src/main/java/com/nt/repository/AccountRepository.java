package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
