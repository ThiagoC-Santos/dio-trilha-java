package subsystem2.cep;

public class CepApi {
    private static CepApi instance = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String retrieveCity(String zipCode) {
        return "Example City";
    }

    public String retrieveState(String zipCode) {
        return "Example State";
    }
}
