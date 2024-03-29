package com.example.InternshipProgram.bankTransfer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankTransferHistory {
    private String bankName;
    private String branchName;
    private String bankAccountType;
    private Integer bankAccountNum;
    private String name;
    private Integer money;
    private Date transferDateTime;
}

