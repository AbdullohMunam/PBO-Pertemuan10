/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbo.pertemuan10.maincode;
import com.pbo.pertemuan10.asset.Mobil;

/**
 *
 * @author A-14
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        System.out.println("Merk mobil 1 = " + mobil1.getMerk());
        Mobil mobil2 = new Mobil("Hitam", 200000, 230, "Avanza");
        System.out.println("Merek mobil 2 = " + mobil2.getMerk());
    }
}
