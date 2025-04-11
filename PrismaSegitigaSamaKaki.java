package utp.shapes;

public class PrismaSegitigaSamaKaki extends BangunRuang {
    private double alas, kaki;

    public PrismaSegitigaSamaKaki(double alas, double kaki, double tinggi) {
        this.alas = alas;
        this.kaki = kaki;
        this.tinggi = tinggi;
        setNama("Prisma Segitiga Sama Kaki");
    }

    public double getLuasPermukaan() {
        return 2 * getLuasAlas() + getKeliling() * tinggi;
    }

    public double getVolume() {
        return getLuasAlas() * tinggi;
    }

    public double getTinggiAlas() {
        return Math.sqrt(Math.pow(kaki, 2) - Math.pow(alas / 2, 2));
    }

    public double getLuasAlas() {
        return getTinggiAlas() * alas / 2;
    }

    public double getKeliling() {
        return 2 * kaki + alas;
    }
}