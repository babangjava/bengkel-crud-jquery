/*
 * Created on 25 Jul 2021 ( Time 02:07:52 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package org.demo.bean;

import java.io.Serializable;

import javax.validation.constraints.*;

import java.util.Date;

public class ReturPenjualan implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @NotNull
    private Integer idreturPenjualan;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @NotNull
    private Double harga;

    @NotNull
    private Integer jumlah;

    @NotNull
    @Size( min = 1, max = 45 )
    private String namaBarang;

    @NotNull
    private Date tanggal;

    @NotNull
    private Double total;


    private Integer penjualanHeader;



    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setIdreturPenjualan( Integer idreturPenjualan ) {
        this.idreturPenjualan = idreturPenjualan ;
    }

    public Integer getIdreturPenjualan() {
        return this.idreturPenjualan;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    public void setHarga( Double harga ) {
        this.harga = harga;
    }
    public Double getHarga() {
        return this.harga;
    }

    public void setJumlah( Integer jumlah ) {
        this.jumlah = jumlah;
    }
    public Integer getJumlah() {
        return this.jumlah;
    }

    public void setNamaBarang( String namaBarang ) {
        this.namaBarang = namaBarang;
    }
    public String getNamaBarang() {
        return this.namaBarang;
    }

    public void setTanggal( Date tanggal ) {
        this.tanggal = tanggal;
    }
    public Date getTanggal() {
        return this.tanggal;
    }

    public void setTotal( Double total ) {
        this.total = total;
    }
    public Double getTotal() {
        return this.total;
    }

    public void setPenjualanHeader( Integer penjualanHeader ) {
        this.penjualanHeader = penjualanHeader;
    }
    public Integer getPenjualanHeader() {
        return this.penjualanHeader;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 
        public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(idreturPenjualan);
        sb.append("|");
        sb.append(harga);
        sb.append("|");
        sb.append(jumlah);
        sb.append("|");
        sb.append(namaBarang);
        sb.append("|");
        sb.append(tanggal);
        sb.append("|");
        sb.append(total);
        sb.append("|");
        sb.append(penjualanHeader);
        return sb.toString(); 
    } 


}
