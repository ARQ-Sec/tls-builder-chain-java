package com.arq.tlsbuilderchainjava.service;

import com.arq.tlsbuilderchainjava.repository.PartnerRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PartnerServiceTest {
    @Test
    void returnsSeedData() {
        PartnerService service = new PartnerService(new PartnerRepository());
        assertFalse(service.summarize().isEmpty());
    }
}
