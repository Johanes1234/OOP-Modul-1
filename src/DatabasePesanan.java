import java.util.ArrayList;

/**
 * Class Customer ini memodelkan data-data yang berhubungan dengan pesanan.
 * 
 * @author (Johanes Gunawan) 
 * @version (2018-02-22)
 */
public class DatabasePesanan
{
    private static final Object ArrayList;
    protected String[] list_pesanan;
    private static ArrayList<Pesanan>PESANAN_DATABASE;
    public static int LAST_PESANAN_ID = 0;

    /**
     * Constructor for objects of class DatabasePesanan
     */
    public ArrayList<Pesanan> getPesananDatabase()
    {
        return ArrayList;
    }

    public int getLastPesananID()
    {
        return LAST_PESANAN_ID;
    }

    public boolean addPesanan(Pesanan baru)
    {
        return Boolean.parseBoolean(null);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @return     the sum of x and y
     */
    public boolean removePesanan()
    {
        return false;
    }

    public Pesanan getPesanan(Room kamar)
    {
        return Pesanan.parsePesanan(Pesanan.parsePesanan(null));
    }

    public Pesanan getPesanan(int id)
    {
        return 0;
    }

    public Pesanan getPesananAktif(Customer pelanggan)
    {
        return pelanggan;
    }

    public boolean removePesanan(Pesanan pesan)
    {
        return pesan;
    }

    public void pesananDibatalkan(Pesanan pesan)
    {
        
    }
}
