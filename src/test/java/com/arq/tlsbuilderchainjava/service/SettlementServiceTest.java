package com.arq.tlsbuilderchainjava.service;

import com.arq.tlsbuilderchainjava.repository.SettlementRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SettlementServiceTest {
    @Test
    void returnsSeedData() {
        SettlementService service = new SettlementService(new SettlementRepository());
        assertFalse(service.summarize().isEmpty());
    }
}
