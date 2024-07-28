package com.example.gof.facade;

import subsystem1.crm.CrmService;
import subsystem2.cep.CepApi;

public class Facade {
    public void migrateClient(String name, String zipCode) {
        String city = CepApi.getInstance().retrieveCity(zipCode);
        String state = CepApi.getInstance().retrieveState(zipCode);

        CrmService.saveClient(name, zipCode, city, state);
    }
}
