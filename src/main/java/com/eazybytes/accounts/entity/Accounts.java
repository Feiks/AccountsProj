package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Accounts extends BaseEntity {
    @Column(name = "customer_id")
    private Long id;

    @Column(name = "account_number")
    @Id
    private Long accountNumber;

    private String accountType;
    private String branchAddress;

}
