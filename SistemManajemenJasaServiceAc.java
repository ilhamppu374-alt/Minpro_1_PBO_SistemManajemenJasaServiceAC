/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemmanajemenjasaserviceac;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author ADVAN
 */
public class SistemManajemenJasaServiceAc {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();
        ArrayList<Teknisi> daftarTeknisi = new ArrayList<>();
        ArrayList<Service> daftarService = new ArrayList<>();

        int pilihan;

        do {
            System.out.println("\n=== SISTEM MANAJEMEN JASA SERVIS AC ===");
            System.out.println("1. Data Pelanggan");
            System.out.println("2. Data Teknisi");
            System.out.println("3. Data Servis AC");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                // ================= DATA PELANGGAN =================
                case 1:
                    int pilihanPelanggan;

                    do {
                        System.out.println("\n=== DATA PELANGGAN ===");
                        System.out.println("1. Tambah Pelanggan");
                        System.out.println("2. Lihat Pelanggan");
                        System.out.println("3. Ubah Pelanggan");
                        System.out.println("4. Hapus Pelanggan");
                        System.out.println("0. Kembali");
                        System.out.print("Pilih menu: ");

                        pilihanPelanggan = input.nextInt();
                        input.nextLine();

                        switch (pilihanPelanggan) {

                            case 1:
                                System.out.print("Nama Pelanggan: ");
                                String nama = input.nextLine();

                                System.out.print("Alamat: ");
                                String alamat = input.nextLine();

                                System.out.print("Nomor HP: ");
                                int noHp = input.nextInt();
                                input.nextLine();

                                daftarPelanggan.add(
                                    new Pelanggan(nama, alamat, noHp)
                                );

                                System.out.println(
                                    "Pelanggan berhasil ditambahkan!"
                                );
                                break;

                            case 2:
                                if (daftarPelanggan.isEmpty()) {
                                    System.out.println(
                                        "Belum ada data pelanggan."
                                    );
                                } else {
                                    System.out.println(
                                        "\n=== DAFTAR PELANGGAN ==="
                                    );

                                    for (int i = 0;
                                         i < daftarPelanggan.size();
                                         i++) {

                                        Pelanggan p =
                                            daftarPelanggan.get(i);

                                        System.out.println(
                                            (i + 1) + ". " +
                                            p.nama + " | " +
                                            p.alamat + " | " +
                                            p.noHp
                                        );
                                    }
                                }
                                break;

                            case 3:
                                if (daftarPelanggan.isEmpty()) {
                                    System.out.println(
                                        "Belum ada data pelanggan."
                                    );
                                } else {
                                    System.out.print("Nomor pelanggan: ");
                                    int no = input.nextInt();
                                    input.nextLine();

                                    if (no >= 1 &&
                                        no <= daftarPelanggan.size()) {

                                        Pelanggan p =
                                            daftarPelanggan.get(no - 1);

                                        System.out.print(
                                            "Nama baru: "
                                        );
                                        p.nama = input.nextLine();

                                        System.out.print(
                                            "Alamat baru: "
                                        );
                                        p.alamat = input.nextLine();
                                        
                                        System.out.print(
                                            "Nomor HP baru: "
                                        );
                                        p.noHp = input.nextInt();
                                        input.nextLine();

                                        System.out.println(
                                            "Data pelanggan berhasil diubah!"
                                        );

                                    } else {
                                        System.out.println(
                                            "Nomor pelanggan tidak tersedia."
                                        );
                                    }
                                }
                                break;

                            case 4:
                                if (daftarPelanggan.isEmpty()) {
                                    System.out.println(
                                        "Belum ada data pelanggan."
                                    );
                                } else {
                                    System.out.print(
                                        "Nomor pelanggan: "
                                    );
                                    int no = input.nextInt();

                                    if (no >= 1 &&
                                        no <= daftarPelanggan.size()) {

                                        daftarPelanggan.remove(no - 1);

                                        System.out.println(
                                            "Pelanggan berhasil dihapus!"
                                        );

                                    } else {
                                        System.out.println(
                                            "Nomor pelanggan tidak tersedia."
                                        );
                                    }
                                }
                                break;
                        }

                    } while (pilihanPelanggan != 0);

                    break;


                // ================= DATA TEKNISI =================
                case 2:
                    int pilihanTeknisi;

                    do {
                        System.out.println("\n=== DATA TEKNISI ===");
                        System.out.println("1. Tambah Teknisi");
                        System.out.println("2. Lihat Teknisi");
                        System.out.println("3. Ubah Teknisi");
                        System.out.println("4. Hapus Teknisi");
                        System.out.println("0. Kembali");
                        System.out.print("Pilih menu: ");

                        pilihanTeknisi = input.nextInt();
                        input.nextLine();

                        switch (pilihanTeknisi) {

                            case 1:
                                System.out.print("Nama Teknisi: ");
                                String nama = input.nextLine();

                                System.out.print("Nomor HP: ");
                                int noHp = input.nextInt();
                                input.nextLine();
                                
                                daftarTeknisi.add(
                                    new Teknisi(
                                        nama,
                                        noHp
                                    )
                                );

                                System.out.println(
                                    "Teknisi berhasil ditambahkan!"
                                );
                                break;

                            case 2:
                                if (daftarTeknisi.isEmpty()) {
                                    System.out.println(
                                        "Belum ada data teknisi."
                                    );
                                } else {
                                    System.out.println(
                                        "\n=== DAFTAR TEKNISI ==="
                                    );

                                    for (int i = 0;
                                         i < daftarTeknisi.size();
                                         i++) {

                                        Teknisi t =
                                            daftarTeknisi.get(i);

                                        System.out.println(
                                            (i + 1) + ". " +
                                            t.nama + " | " +
                                            t.noHp
                                        );
                                    }
                                }
                                break;

                            case 3:
                                if (daftarTeknisi.isEmpty()) {
                                    System.out.println(
                                        "Belum ada data teknisi."
                                    );
                                } else {
                                    System.out.print(
                                        "Nomor teknisi: "
                                    );
                                    int no = input.nextInt();
                                    input.nextLine();

                                    if (no >= 1 &&
                                        no <= daftarTeknisi.size()) {

                                        Teknisi t =
                                            daftarTeknisi.get(no - 1);

                                        System.out.print(
                                            "Nama baru: "
                                        );
                                        t.nama = input.nextLine();

                                                                       
                                        System.out.print(
                                            "Nomor HP baru: "
                                        );
                                        t.noHp = input.nextInt();
                                        input.nextLine();

                                        System.out.println(
                                            "Data teknisi berhasil diubah!"
                                        );

                                    } else {
                                        System.out.println(
                                            "Nomor teknisi tidak tersedia."
                                        );
                                    }
                                }
                                break;

                            case 4:
                                if (daftarTeknisi.isEmpty()) {
                                    System.out.println(
                                        "Belum ada data teknisi."
                                    );
                                } else {
                                    System.out.print(
                                        "Nomor teknisi: "
                                    );
                                    int no = input.nextInt();

                                    if (no >= 1 &&
                                        no <= daftarTeknisi.size()) {

                                        daftarTeknisi.remove(no - 1);

                                        System.out.println(
                                            "Teknisi berhasil dihapus!"
                                        );

                                    } else {
                                        System.out.println(
                                            "Nomor teknisi tidak tersedia."
                                        );
                                    }
                                }
                                break;
                        }

                    } while (pilihanTeknisi != 0);

                    break;


                // ================= DATA SERVIS =================
                case 3:
                    int pilihanService;

                    do {
                        System.out.println("\n=== DATA SERVIS AC ===");
                        System.out.println("1. Tambah Servis");
                        System.out.println("2. Lihat Servis");
                        System.out.println("3. Ubah Servis");
                        System.out.println("4. Hapus Servis");
                        System.out.println("0. Kembali");
                        System.out.print("Pilih menu: ");

                        pilihanService = input.nextInt();
                        input.nextLine();

                        switch (pilihanService) {

                            case 1:
                                System.out.print("Nama Pelanggan: ");
                                String pelanggan = input.nextLine();

                                System.out.print("Jenis AC: ");
                                String jenisAc = input.nextLine();

                                System.out.print("Keluhan: ");
                                String keluhan = input.nextLine();

                                System.out.print("Nama Teknisi: ");
                                String teknisi = input.nextLine();

                                System.out.print("Biaya Servis: Rp ");
                                double biaya = input.nextDouble();

                                daftarService.add(
                                    new Service(
                                        pelanggan,
                                        jenisAc,
                                        keluhan,
                                        teknisi,
                                        biaya
                                    )
                                );

                                System.out.println(
                                    "Data servis berhasil ditambahkan!"
                                );
                                break;

                            case 2:
                                if (daftarService.isEmpty()) {
                                    System.out.println(
                                        "Belum ada data servis."
                                    );
                                } else {
                                    System.out.println(
                                        "\n=== DAFTAR SERVIS AC ==="
                                    );

                                    for (int i = 0;
                                         i < daftarService.size();
                                         i++) {

                                        Service s =
                                            daftarService.get(i);

                                        System.out.println(
                                            (i + 1) + ". " +
                                            s.pelanggan + " | " +
                                            s.jenisAc + " | " +
                                            s.keluhan + " | Teknisi: " +
                                            s.teknisi + " | Rp" +
                                            s.biaya + 00
                                        );
                                    }
                                }
                                break;

                            case 3:
                                if (daftarService.isEmpty()) {
                                    System.out.println(
                                        "Belum ada data servis."
                                    );
                                } else {
                                    System.out.print(
                                        "Nomor servis: "
                                    );
                                    int no = input.nextInt();
                                    input.nextLine();

                                    if (no >= 1 &&
                                        no <= daftarService.size()) {

                                        Service s =
                                            daftarService.get(no - 1);

                                        System.out.print(
                                            "Nama pelanggan baru: "
                                        );
                                        s.pelanggan =
                                            input.nextLine();

                                        System.out.print(
                                            "Jenis AC baru: "
                                        );
                                        s.jenisAc =
                                            input.nextLine();

                                        System.out.print(
                                            "Keluhan baru: "
                                        );
                                        s.keluhan =
                                            input.nextLine();

                                        System.out.print(
                                            "Teknisi baru: "
                                        );
                                        s.teknisi =
                                            input.nextLine();

                                        System.out.print(
                                            "Biaya baru: Rp "
                                        );
                                        s.biaya =
                                            input.nextDouble();

                                        System.out.println(
                                            "Data servis berhasil diubah!"
                                        );

                                    } else {
                                        System.out.println(
                                            "Nomor servis tidak tersedia."
                                        );
                                    }
                                }
                                break;

                            case 4:
                                if (daftarService.isEmpty()) {
                                    System.out.println(
                                        "Belum ada data servis."
                                    );
                                } else {
                                    System.out.print(
                                        "Nomor servis: "
                                    );
                                    int no = input.nextInt();

                                    if (no >= 1 &&
                                        no <= daftarService.size()) {

                                        daftarService.remove(no - 1);

                                        System.out.println(
                                            "Data servis berhasil dihapus!"
                                        );

                                    } else {
                                        System.out.println(
                                            "Nomor servis tidak tersedia."
                                        );
                                    }
                                }
                                break;
                        }

                    } while (pilihanService != 0);

                    break;


                // ================= KELUAR =================
                case 0:
                    System.out.println(
                        "Terima kasih telah menggunakan sistem."
                    );
                    break;

                default:
                    System.out.println(
                        "Pilihan tidak tersedia."
                    );
            }

        } while (pilihan != 0);

        input.close();
    }
}
