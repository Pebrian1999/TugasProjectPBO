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

    public data(String nama, String jeniskelamin, int tinggib, int beratb){
        this.nama = nama;
        this.jeniskelamin = jeniskelamin;
        this.tinggib = tinggib;
        this.beratb = beratb;
    }

    public data(String nama, String kota){
        this.nama =nama;
        this.kota =kota;
    }

    public data(String nama, int tinggib) {
        this.nama = nama;
        this.tinggib = tinggib;
    }

    //Getter
        public String getNama() {
            return nama;
        }

        public String getJeniskelamin() {
            return jeniskelamin;
        }

        public String getKota() {
            return kota;
        }

        public String getNohp() {
            return nohp;
        }

        public int getTinggib() {
            return tinggib;
        }

        public int getBeratb() {
            return beratb;
        }

        public String getStatus() {
            return status;
        }

        public String getPekerjaan() {
            return pekerjaan;
        }

    //Setter
        public void setNama(String nama) {
            this.nama = nama;
        }

        public void setJeniskelamin(String jeniskelamin) {
            this.jeniskelamin = jeniskelamin;
        }

        public void setKota(String kota) {
            this.kota = kota;
        }

        public void setNohp(String nohp) {
            this.nohp = nohp;
        }

        public void setTinggib(int tinggib) {
            this.tinggib = tinggib;
        }

        public void setBeratb(int beratb) {
            this.beratb = beratb;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public void setPekerjaan(String pekerjaan) {
            this.pekerjaan = pekerjaan;
        }
    }
