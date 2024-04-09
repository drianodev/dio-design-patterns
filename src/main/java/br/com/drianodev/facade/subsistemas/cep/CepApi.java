package br.com.drianodev.facade.subsistemas.cep;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Fortaleza";
    }

    public String recuperarEstado(String cep) {
        return "Ceara";
    }
}
