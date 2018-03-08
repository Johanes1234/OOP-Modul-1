
/**
 * Class yang mengatur administrasi pelanggan mengenai ruangan.
 * 
 * @author (Johanes Gunawan) 
 * @version (2018-3-8)
 */
public class Room
{
    // instance variables - replace the example below with your own
    private static Hotel hotel;
    private static int id;
    private static String nomor_kamar;
    private static boolean isAvailable;
    private static Customer customer;
    private static double dailyTariff;
    private static StatusKamar status_kamar;
    private static Pesanan pesan;
    /**
     * Constructor for objects of class Room
     */
    public Room()
    {
       
    }

    /**
     * Method mengatur logika pemesanan dan pembatalan pesanan
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
       pesan.setStatusSelesai(false);
       pesan.setStatusDiproses(true);
       pesan.setRoom(kamar);
       roomAmbilPesanan(pesan, kamar);
    }
    
    public void roomAmbilPesanan(Pesanan pesan, Room kamar)
    {
        
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    public boolean getStatusAvailable()
    {
        return isAvailable;
    }
    
    public Hotel getHotel()
    {
        return hotel;
    }
    
    public int getID()
    {
        return id;
    }
    
    public String getNomorKamar()
    {
        return nomor_kamar;
    }
    
    public StatusKamar getStatusKamar()
    {
        return status_kamar;
    }
    
    public Pesanan getPesanan()
    {
        return pesan;
    }
    
    public void setHotel(Hotel hotel)
    {
        Room.hotel = hotel;
    }
    
    public void setID(int id)
    {
        Room.id = id;
    }
    
    public void setNomorKamar(String nomor_kamar)
    {
        Room.nomor_kamar = nomor_kamar;
    }
    
    public void setStatusAvailable(boolean isAvailable)
    {
        Room.isAvailable = isAvailable;
    }
    
    public void setCustomer(Customer customer)
    {
        Room.customer = customer;
    }
    
    public void setDailyTariff(double dailyTariff)
    {
        Room.dailyTariff = dailyTariff;
    }
    
    public void setStatusKamar(StatusKamar status_kamar)
    {
        Room.status_kamar = status_kamar;
    }
    
    public void setPesanan(Pesanan pesan)
    {
        Room.pesan = pesan;
    }
    
    public void printData()
    {
        
    }
}
