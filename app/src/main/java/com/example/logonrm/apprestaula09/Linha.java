package com.example.logonrm.apprestaula09;

import com.google.gson.annotations.SerializedName;

public class Linha {

    private String cor;
    private String numero;
    @SerializedName("urlImagem")
    private String urlImage;


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
