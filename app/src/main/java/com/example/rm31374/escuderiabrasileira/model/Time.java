package com.example.rm31374.escuderiabrasileira.model;


import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rm31374 on 28/11/2016.
 */
public class Time implements Parcelable{

    private String nome;
    private String estado;
    private String escudo;
    @SerializedName("anofundacao")
    private String anoFundacao;

    protected Time(Parcel in){
        nome        = in.readString();
        estado      = in.readString();
        escudo      = in.readString();
        anoFundacao = in.readString();
    }

    public static final Creator<Time> CREATOR = new Parcelable.Creator<Time>()
    {
        @Override
        public Time createFromParcel(Parcel in) {
            return new Time(in);
        }

        @Override
        public Time[] newArray(int size) {
            return new Time[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nome);
        parcel.writeString(estado);
        parcel.writeString(escudo);
        parcel.writeString(anoFundacao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }

    public String getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(String anoFundacao) {
        this.anoFundacao = anoFundacao;
    }
}

