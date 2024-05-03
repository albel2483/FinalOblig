package com.example.finaloblig;

public class Billett {
    private String film;
    private int antall;
    private String fornavn;
    private String etternavn;
    private String telefon;
    private String Epost;
    public Billett(String film, int antall, String fornavn, String etternavn, String telefon, String Epost) {
        this.film = film;
        this.antall = antall;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefon = telefon;
        this.Epost = Epost;
    }
    public Billett() { }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public int getAntall() {
        return antall;
    }

    public void setAntall(int antall) {
        this.antall = antall;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEpost() {
        return Epost;
    }

    public void setEpost(String Epost) {
        this.Epost = Epost;
    }
}

