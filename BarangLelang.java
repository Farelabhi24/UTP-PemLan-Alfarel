package lelang;

public class BarangLelang {
    private String namaBarang;
    private double hargaAwal;
    private double penawaranTertinggi = 0;
    private Peserta pemenang;
    private boolean statusLelang = false;

    public BarangLelang(String namaBarang, double hargaAwal) {
        this.namaBarang = namaBarang;
        this.hargaAwal = hargaAwal;
        this.penawaranTertinggi = hargaAwal;
    }

    public void mulaiLelang() {
        statusLelang = true;
        System.out.println("Lelang untuk " + namaBarang + " telah dimulai dengan harga awal Rp" + hargaAwal);
    }

    public void terimaPenawaran(Peserta peserta, double jumlah) {
        if (!statusLelang) {
            System.out.println(peserta.getNama() + " menawar Rp" + jumlah);
            System.out.println("Penawaran tidak valid! Lelang sudah ditutup");
            return;
        }

        System.out.println(peserta.getNama() + " menawar Rp" + jumlah);

        if (jumlah <= penawaranTertinggi) {
            System.out.println("Penawaran tidak valid! penawaran harus lebih tinggi dari Rp" + penawaranTertinggi);
        } else if (peserta.getSaldo() < jumlah) {
            System.out.println("Penawaran tidak valid! Saldo " + peserta.getNama() + " tidak mencukupi");
        } else {
            penawaranTertinggi = jumlah;
            pemenang = peserta;
            System.out.println("Penawaran disetujui!");
        }
    }

    public void tutupLelang() {
        statusLelang = false;
        if (pemenang != null) {
            pemenang.setSaldo(pemenang.getSaldo() - penawaranTertinggi);
            System.out.println("Lelang ditutup! " + namaBarang + " terjual dengan harga " + penawaranTertinggi + " kepada " + pemenang.getNama());
            System.out.println("Sisa saldo " + pemenang.getNama() + ": Rp" + pemenang.getSaldo());
        } else {
            System.out.println("Lelang ditutup! Tidak ada pemenang.");
        }
    }
}
