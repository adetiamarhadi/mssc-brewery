package com.github.adetiamarhadi.msscbrewery.services;

import com.github.adetiamarhadi.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
