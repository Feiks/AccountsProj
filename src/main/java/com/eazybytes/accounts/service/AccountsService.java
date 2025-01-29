package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface AccountsService {
    /**
     *
     * @param customerDto
     */
    void createAccount(CustomerDto customerDto);
}
