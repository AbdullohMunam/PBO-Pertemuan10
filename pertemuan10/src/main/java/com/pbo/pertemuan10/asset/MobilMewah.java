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
public class MobilMewah extends Mobil{
    private double pajakBarangMewah = 200.00;
    private String asalNegara;

    public MobilMewah(String asalNegara) {
        this.asalNegara = asalNegara;
    }

    public MobilMewah(String warna, int kecepatan, double harga, String merk) {
        super(warna, kecepatan, harga, merk);
        this.asalNegara = asalNegara;
    }
    
    
}
