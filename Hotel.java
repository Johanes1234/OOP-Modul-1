
/**
 * Class ini menunjukkan sedikit informasi tentang hotel seperti nama, lokasi dan kualitas.
 * 
 * @author (Johanes Gunawan) 
 * @version (2018-03-01)
 */
public class Hotel
{
    private static String nama;
    private static Lokasi lokasi;
    private static int bintang;

    /**
     * Constructor for objects of class Hotel
     */
    public Hotel(String nama, Lokasi lokasi, int bintang)
    {
        nama = nama;
        lokasi = lokasi;
        bintang = bintang;
    }

    /**
     * Method untuk memasukkan nilai bintang
     * @param bintang hotel bintang ... 
     */
    public  void setBintang(int bintang)
    {
        Hotel.bintang = bintang;
    }
    
    /**
     * Method untuk memasukkan nilai nama
     * @param nama nama hotel 
     */
    public  void setNama(String nama)
    {
        Hotel.nama = nama;
    }
    
    /**
     * Method untuk memasukkan nilai lokasi
     * @param lokasi lokasi hotel 
     */
    public  void setLokasi(Lokasi lokasi)
    {
        Hotel.lokasi = lokasi;
    }
    
    /**
     * Method untuk mendapat nilai bintang
     * @return hotel bintang ... 
     */
    public  int getBintang()
    {
        return bintang;
    }
    
    /**
     * Method untuk mendapat nilai nama
     * @return nama hotel 
     */
    public  String getNama()
    {
        return nama;
    }
    
    /**
     * Method untuk mendapat nilai lokasi
     * @return lokasi hotel 
     */
    public  Lokasi getLokasi()
    {
        return lokasi;
    }
    
    public void printData()
    {
        
    }
}
