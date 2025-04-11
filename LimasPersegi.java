package utp.shapes;

public class LimasPersegi extends BangunRuang {
    private double sisi;

    public LimasPersegi(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
        setNama("Limas Persegi");
    }

    public double getLuasPermukaan() {
        return 4 * getLuasSegitiga() + getLuasAlas();
    }

    public double getVolume() {
        return getLuasAlas() * tinggi / 3;
    }

    public double getTinggiSegitiga() {
        return Math.sqrt(Math.pow(tinggi, 2) + Math.pow(sisi / 2, 2));
    }

    public double getLuasSegitiga() {
        return getTinggiSegitiga() * sisi / 2;
    }

    public double getLuasAlas() {
        return sisi * sisi;
    }
}