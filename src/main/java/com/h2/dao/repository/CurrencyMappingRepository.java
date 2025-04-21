package com.h2.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.h2.dao.entity.CurrencyMapping;

import java.util.Optional;

@Repository
public interface CurrencyMappingRepository extends JpaRepository<CurrencyMapping, String> {

    /**
     * Find a CurrencyMapping by its currency code.
     *
     * @param currencyCode The currency code to search for
     * @return An Optional containing the CurrencyMapping if found
     */
    Optional<CurrencyMapping> findByCurrencyCode(String currencyCode);
}
