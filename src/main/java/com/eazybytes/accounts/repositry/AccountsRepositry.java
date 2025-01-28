package com.eazybytes.accounts.repositry;

import com.eazybytes.accounts.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepositry  extends JpaRepository<Accounts,Long> {
}
