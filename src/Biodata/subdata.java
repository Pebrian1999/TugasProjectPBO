package Biodata;

public class subdata extends data{
    String namapenerima;
    String jeniskelaminp;
    String pekerjaanp;

    public void namapenerima() {

    }

    public void tampilinfopenerima() {
        System.out.println("Info Penerima: ");
        System.out.println("Nama: "+namapenerima);
        System.out.println("Jenis Kelamin: "+jeniskelaminp);
        System.out.println("Pekerjaan: "+pekerjaanp);
        System.out.println("========================");
    }

    //Getter
    public String getNamapenerima() {
        return namapenerima;
    }

    public String getJeniskelaminp() {
        return jeniskelaminp;
    }

    public String getPekerjaanp() {
        return pekerjaanp;
    }

    //setter
    public void setNamapenerima(String namapenerima) {
        this.namapenerima = namapenerima;
    }

    public void setJeniskelaminp(String jeniskelaminp) {
        this.jeniskelaminp = jeniskelaminp;
    }

    public void setPekerjaanp(String pekerjaanp) {
        this.pekerjaanp = pekerjaanp;
    }

    //Overridding

    @Override
    public void tampildata() {
        super.tampildata();
    }

    @Override
    public void tampilnama() {
        super.tampilnama();
    }
}
