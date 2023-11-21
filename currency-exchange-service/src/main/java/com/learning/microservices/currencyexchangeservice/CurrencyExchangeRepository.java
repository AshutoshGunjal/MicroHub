package com.learning.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

// interface to connect API to the database
// two parameters that needs to be passed - entity to be managed i.e. currency exchange and the primary key
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {

    CurrencyExchange findByFromAndTo(String from, String to);
}
