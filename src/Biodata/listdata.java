package Biodata;

public class listdata {
    public static void main(String[] args) {
        data ryan = new data();
        ryan.nama = "Akhmad Pebrian Yuniarso";
        ryan.jeniskelamin = "laki - laki";
        ryan.kota = "Martapura";
        ryan.nohp = "081313133";
        ryan.tinggib = 70;
        ryan.beratb = 50;
        ryan.status = "belum menikah";
        ryan.pekerjaan = "mahasiswa";
        ryan.tampildata();

        subdata penerima = new subdata();
        penerima.namapenerima = "Pebrian";
        penerima.jeniskelaminp = "Laki -  Laki";
        penerima.pekerjaanp = "Mahasiswa";
        penerima.tampilinfopenerima();

        //object dari class 1
        data data1 = new data("Joni", "Laki-laki", 69, 50);
        data data2 = new data("Jono", "Laki-laki", 70, 52);
        data data3 = new data("Joni","Solo");
        data data4 = new data("Jono","Solo");
        data data5 = new data("Joni",69);
        data data6 = new data("Jono",70);
    }
}
