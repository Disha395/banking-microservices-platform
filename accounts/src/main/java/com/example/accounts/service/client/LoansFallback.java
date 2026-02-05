package com.example.accounts.service.client;

import com.example.loans.dto.LoansDto;
import org.springframework.http.ResponseEntity;

public class LoansFallback implements LoansFeignClient{
    /**
     * @param correlationId
     * @param mobileNumber
     * @return
     */
    @Override
    public ResponseEntity<LoansDto> fetchLoanDetails(String correlationId, String mobileNumber) {
        return null;
    }
}
