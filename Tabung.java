package utp.shapes;

public class Tabung extends BangunRuang {
    private double radius;
    private final int PEMBILANG = 22;
    private final int PENYEBUT = 7;

    public Tabung() {
        setNama("Tabung");
    }

    public void setRadius(double inputRadius) {
        this.radius = inputRadius;
    }

    public double getLuasPermukaan() {
        return 2 * getLuasAlas() + getKeliling() * tinggi;
    }

    public double getVolume() {
        return getLuasAlas() * tinggi;
    }

    public double getLuasAlas() {
        return radius * radius * PEMBILANG / PENYEBUT;
    }

    public double getKeliling() {
        return 2 * radius * PEMBILANG / PENYEBUT;
    }
}