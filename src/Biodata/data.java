package Biodata;

    public class data {
    public String nama;
    public String jeniskelamin;
    public String kota;
    public String nohp;
    public int tinggib;
    public int beratb;
    public String status;
    public String pekerjaan;

    public void tampildata() {
        System.out.println("Data yang ditampilkan: ");
        System.out.println("Nama :" +nama);
        System.out.println("Jenis Kelamin :" +jeniskelamin);
        System.out.println("Kota :" +kota);
        System.out.println("Nomor HP: " +nohp);
        System.out.println("Tinggi Badan :" +tinggib);
        System.out.println("Berat Badan :" +beratb);
        System.out.println("Status :" +status);
        System.out.println("pekerjaan :" +pekerjaan);
        System.out.println("=======================");
    }

    public void cetakdata(){
        System.out.println("Data yang dicetak: ");
    }

    public void tampilnama(){
        System.out.println("Nama :" +nama);
    }

    public void cetakkota(){
        System.out.println("Kota : " +kota);
    }

    //Constructor
    public data(){
        System.out.println("Konstruktor");
        nama = "Nama Kosong";
        jeniskelamin = "Jenis Kelamin Kosong";
    }

    public data(String nama,String jeniskelamin,int tinggib,int beratb){
    this.nama = nama;
    this.jeniskelamin = jeniskelamin;
    this.tinggib = tinggib;
    this.beratb = beratb;
    }

    public data(String nama,String kota){
    this.nama =nama;
    this.kota =kota;
    }

}
