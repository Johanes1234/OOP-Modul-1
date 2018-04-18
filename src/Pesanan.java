
/**
 * Class Customer ini memodelkan pesanan yang dibuat oleh customer.
 * 
 * @author (Johanes Gunawan) 
 * @version (2018-02-22)
 */

import java.util.Date;

public class Pesanan
{
    private static String nama;
    private static int id = DatabasePesanan.getLastPesananID() + 1;
    private static Date dob;
    private static double biaya;
    private static boolean isDiproses;
    private static boolean isSelesai;
    private static boolean isAktif;
    private static Customer pelanggan;
    private static Room kamar;
    private static double jumlahHari;
    private static Date tanggalPesan;
    private static String string;

    /**
     * Constructor for objects of class Pesanan
     */
    public Pesanan(double jumlahHari, double biaya, Customer pelanggan)
    {
        this.biaya = biaya;
        this.pelanggan = pelanggan;
        this.jumlahHari = jumlahHari;
        //this.kamar = kamar;
        biaya = kamar.getDailyTariff() * jumlahHari;
    }
    
    public Pesanan(int id, String nama, int tanggal, int bulan, int tahun)
    {
        this.id = id;
        this.nama = nama;
        this.isAktif = true;
        //dob = new Date(tahun, bulan, tanggal);
        //this.tanggal = tanggal;
        //this.bulan = bulan;
        //this.tahun = tahun;
    }
    
    public Pesanan(int id, String nama, Date dob)
    {
        this.id = id;
        this.nama = nama;
        this.dob = dob;
    }
    
    public Pesanan()
    {
       
    }

    public static int parsePesanan(Object o) { return 0;
    }

    /**
     * Method untuk memasukkan nilai biaya
     */
    public void setBiaya()
    {
        /*
         * ini digunakan untuk memasukkan nilai biaya
         * nilai berupa double
         */
        biaya = kamar.getDailyTariff() * jumlahHari;
    }
    
    /**
     * Method untuk mendapat nilai room
     * @return room pelanggan yang mendaftar
     */
    public void setRoom(Room kamar)
    {
        /*
         * ini digunakan untuk memasukkan nilai room
         */
        Pesanan.kamar = kamar;
    }

    public void setID(int id)
    {
        /*
         * ini digunakan untuk memasukkan nilai id
         */
        Pesanan.id = id;
    }

    public void setStatusAktif(boolean aktif)
    {
        /*
         * ini digunakan untuk memasukkan nilai status
         */
        Pesanan.isAktif = aktif;
    }
    
    /**
     * Method untuk memasukkan nilai pelanggan
     * @param baru pelanggan yang mendaftar
     */
    public void setPelanggan (Customer baru)
    {
        /*
         * ini digunakan untuk memasukkan nilai pelanggan
         */
        Pesanan.pelanggan = pelanggan;
    }
    
    /**
     * Method untuk memasukkan nilai isDiproses
     * @param diproses status pesanan pelanggan yang mendaftar
     */
    public void setStatusDiproses (boolean diproses)
    {
        /*
         * ini digunakan untuk memasukkan nilai isDiproses
         * nilai berupa boolean
         */
        Pesanan.isDiproses = isDiproses;
    }
    
    /**
     * Method untuk memasukkan nilai isSelesai
     * @param diproses status pesanan pelanggan yang selesai
     */
    public void setStatusSelesai (boolean diproses)
    {
        /*
         * ini digunakan untuk memasukkan nilai isSelesai
         * nilai berupa boolean
         */
        Pesanan.isSelesai = isSelesai;
    }
    
    /**
     * Method untuk memasukkan nilai jumlah hari
     * @param jumlahHari hari pelanggan yang mendaftar
     */
    public void setJumlahHari(double jumlahHari)
    {
        /*
         * ini digunakan untuk memasukkan nilai jumlahHari
         * nilai berupa double
         */
        Pesanan.jumlahHari = jumlahHari;
    }
    
    public void setTanggalPesan(Date tanggalPesan)
    {
        /*
         * ini digunakan untuk memasukkan nilai jumlahHari
         * nilai berupa double
         */
        Pesanan.tanggalPesan = tanggalPesan;
    }
    
    /**
     * Method untuk mendapat nilai biaya
     * @return biaya yang ditagih
     */
    public double getBiaya()
    {
        /*
         * ini digunakan untuk mendapat nilai biaya
         * nilai berupa double
         */
        return biaya;
    }
    
    /**
     * Method untuk mendapat nilai pelanggan
     * @return nama pelanggan yang mendaftar
     */
    public Customer getPelanggan()
    {
        /*
         * ini digunakan untuk mendapat nilai pelanggan
         */
        return pelanggan;
    }
    
    /**
     * Method untuk mendapat nilai isDiproses
     * @return status pesanan pelanggan yang mendaftar
     */
    public boolean getStatusDiproses()
    {
        /*
         * ini digunakan untuk mendapat nilai isDiproses
         * nilai berupa boolean
         */
        return isDiproses;
    }
    
    /**
     * Method untuk mendapat nilai isSelesai
     * @return status pesanan pelanggan yang selesai
     */
    public boolean getStatusSelesai()
    {
        /*
         * ini digunakan untuk mendapat nilai isSelesai
         * nilai berupa boolean
         */
        return isSelesai;
    }

    public boolean getStatusAktif()
    {
        /*
         * ini digunakan untuk mendapat nilai status aktif
         * nilai berupa boolean
         */
        return isAktif;
    }

    public int getID()
    {
        /*
         * ini digunakan untuk mendapat nilai id
         * nilai berupa integer
         */
        return id;
    }
    
    /**
     * Method untuk mendapat nilai room
     * @return room pelanggan yang mendaftar
     */
    public Room getRoom()
    {
        /*
         * ini digunakan untuk mendapat nilai room
         */
        return kamar;
    }
    
    /**
     * Method untuk mendapat nilai jumlah hari
     * @return jumlah hari pelanggan yang mendaftar
     */
    public double getJumlahHari()
    {
        /*
         * ini digunakan untuk mendapat nilai room
         */
        return jumlahHari;
    }
    
    public Date getTanggalPesan()
    {
        /*
         * ini digunakan untuk memasukkan nilai jumlahHari
         * nilai berupa double
         */
        return tanggalPesan;
    }

    public String toString()
    {
        // digunakan untuk menampilkan nilai biaya pada terminal

        String final_status = "KOSONG";

        if(isDiproses == true && isSelesai == false){
            final_status = "DIPROSES";
        }
        else if(isDiproses == false && isSelesai == false){
            final_status = "KOSONG";
        }
        else if(isDiproses == false && isSelesai == true){
            final_status = "SELESAI";
        }

        return "\n\nDibuat oleh " + pelanggan.getNama() +
                ". Proses booking untuk " + kamar.getHotel() +
                " kamar nomor " + kamar.getNomorKamar() +
                " dengan tipe kamar yang diinginkan " + kamar.getTipeKamar() +
                ". Status : " + final_status + ".";

    }
    /*
    public String toString()
    {
        if(true){
            return "\nCustomer ID   : " + id +
                   "\nName          : " + nama +
                   "\nBiaya        : " + biaya +
                   "\nDate of Birth : " + dob +
                   "\nKamar         : " + kamar +
                   "\nJumlah Hari   : " + jumlahHari +
                   "\nTanggal Pesan : " + tanggalPesan +
                   "\nBooking order is in progress";        
        }
       
        else{
            return "\nCustomer ID   : " + id +
                   "\nName          : " + nama +
                   "\nBiaya        : " + biaya +
                   "\nDate of Birth : " + dob +
                   "\nKamar         : " + kamar +
                   "\nJumlah Hari   : " + jumlahHari +
                   "\nTanggal Pesan : " + tanggalPesan +
                   " ";
                }
    }
    */
    public static void printData()
    {
        /*
         * ini digunakan untuk memprint data
         */
        System.out.println("Biaya " + biaya);
        System.out.println("Status " + isDiproses);
        System.out.println("Status " + isSelesai);
        System.out.println("Nama " + pelanggan);
        System.out.println("Jumlah Hari " + jumlahHari);
    }

    public boolean getId() {
        return false;
    }
}
