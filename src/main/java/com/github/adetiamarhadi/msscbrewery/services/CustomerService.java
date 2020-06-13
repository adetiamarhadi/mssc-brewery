package com.github.adetiamarhadi.msscbrewery.services;

import com.github.adetiamarhadi.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
