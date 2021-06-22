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
    }
}
