/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbo.pertemuan10.asset;

/**
 *
 * @author A-14
 */
public class Mobil {
    private String warna;
    private int kecepatan;
    private double harga;
    private String merk;

    public Mobil(){
        this.harga = 300000.00;
        this.merk = "Toyota Innova";
        this.kecepatan = 250;
        this.warna = "Merah";
    }

    public Mobil(String warna, int kecepatan, double harga, String merk) {
        this.warna = warna;
        this.kecepatan = kecepatan;
        this.harga = harga;
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
