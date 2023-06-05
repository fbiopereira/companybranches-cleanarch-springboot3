package com.fbiopereira.companybranchescleanarchspringboot3.dataprovider.rest.response;

public class EnderecoApiResponse {


    //<editor-fold desc="PROPERTIES">
    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String uf;

    private int status_http;

    private String mensagem;


    //</editor-fold>

    //<editor-fold desc="GETTERS AND SETTERS">
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
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

    public int getStatus_http() {
        return status_http;
    }

    public void setStatus_http(int http_status) {
        this.status_http = http_status;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    //</editor-fold>
}
