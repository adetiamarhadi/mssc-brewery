package com.github.adetiamarhadi.msscbrewery.services;

import com.github.adetiamarhadi.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .customerId(customerId)
                .customerName("Adetia Marhadi")
                .build();
    }
}
