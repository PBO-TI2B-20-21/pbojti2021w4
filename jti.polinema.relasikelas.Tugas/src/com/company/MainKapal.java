package com.company;

public class MainKapal {

    public static void main(String[] args) {
        Penumpang p = new Penumpang("52341", "Budi");
        Kapal kapal = new Kapal("A10", 20);
        kapal.setPenumpang(p, 1);
        System.out.println(kapal.info());

        Pegawai nahkoda = new Pegawai("456721", "Muhammad Ali");
        Pegawai asisten = new Pegawai("456731", "Sugeng Bandi");
        Kapal p1 = new Kapal("KM KELUD", "Tanjung Priok - Pulau Batam", nahkoda, asisten);
        System.out.println(p1.info1());
    }
}
