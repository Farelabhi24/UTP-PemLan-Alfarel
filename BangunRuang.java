package utp.shapes;

abstract public class BangunRuang {
    private String nama;
    private double tinggi;

    public BangunRuang() {
    }

    public void setNama(String inputNama) {
        this.nama = inputNama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setTinggi(double inputTinggi) {
        this.tinggi = inputTinggi;
    }

    public double getTinggi() {
        return this.tinggi;
    }

    abstract double getLuasPermukaan();

    abstract double getVolume();

    public void printInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("Luas Permukaan: " + getLuasPermukaan());
        System.out.println("Volume: " + getVolume());
    }
}