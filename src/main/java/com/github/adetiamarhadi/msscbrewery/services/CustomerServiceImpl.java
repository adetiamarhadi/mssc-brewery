package com.github.adetiamarhadi.msscbrewery.services;

import com.github.adetiamarhadi.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .customerId(customerId)
                .customerName("Adetia Marhadi")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .customerId(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        log.info("updating customer by id {}, to new value {}", customerId.toString(), customerDto.toString());
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        log.info("deleting customer by id {}", customerId.toString());
    }
}
