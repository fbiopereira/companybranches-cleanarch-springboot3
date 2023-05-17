package com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.rest.response;

public class EnderecoApiResponse {


    //<editor-fold desc="PROPERTIES">
    private String cep;
    private String rua;
    private String cidade;
    private String uf;

    //</editor-fold>

    //<editor-fold desc="GETTERS AND SETTERS">
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    //</editor-fold>
}
