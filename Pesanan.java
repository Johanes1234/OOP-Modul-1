
/**
 * Class Customer ini memodelkan pesanan yang dibuat oleh customer.
 * 
 * @author (Johanes Gunawan) 
 * @version (2018-02-22)
 */

import java.util.Date;

public class Pesanan
{
    private static double biaya;
    private static boolean isDiproses;
    private static boolean isSelesai;
    private static Customer pelanggan;
    private static Room kamar;
    private static double jumlahHari;
    private static Date tanggalPesan;
    private static String string;
    
    /**
     * Constructor for objects of class Pesanan
     */
    public Pesanan(double jumlahHari, double biaya, Customer pelanggan, Room kamar)
    {
        this.biaya = biaya;
        this.pelanggan = pelanggan;
        this.jumlahHari = jumlahHari;
        this.kamar = kamar;
        biaya = kamar.getDailyTariff() * jumlahHari;
    }
    
    public Pesanan()
    {
       
    }
    
    /**
     * Method untuk memasukkan nilai biaya
     * @param biaya biaya yang ditagih
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
    
    /**
     * Method untuk memasukkan nilai pelanggan
     * @param pelanggan pelanggan yang mendaftar
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
     * @param isDiproses status pesanan pelanggan yang mendaftar
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
     * @param isSelesai status pesanan pelanggan yang selesai
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
     * @param jumlah hari pelanggan yang mendaftar
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
        return string;
    }
    
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
}
