package br.com.drianodev.facade;

import br.com.drianodev.facade.subsistemas.cep.CepApi;
import br.com.drianodev.facade.subsistemas.crm.CrmService;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
