/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemmanajemenjasaserviceac;

/**
 *
 * @author USER
 */
public class Service {

    String pelanggan;
    String jenisAc;
    String keluhan;
    String teknisi;
    double biaya;

    public Service(
        String pelanggan,
        String jenisAc,
        String keluhan,
        String teknisi,
        double biaya
    ) {
        this.pelanggan = pelanggan;
        this.jenisAc = jenisAc;
        this.keluhan = keluhan;
        this.teknisi = teknisi;
        this.biaya = biaya;
    }
}