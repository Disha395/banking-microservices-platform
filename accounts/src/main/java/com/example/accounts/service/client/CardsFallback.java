package com.example.accounts.service.client;

import com.example.accounts.dto.CardsDto;
import org.springframework.http.ResponseEntity;

public class CardsFallback implements CardsFeignClient{
    /**
     * @param correlationId
     * @param mobileNumber
     * @return
     */
    @Override
    public ResponseEntity<CardsDto> fetchCardDetails(String correlationId, String mobileNumber) {
        return null;
    }
}
