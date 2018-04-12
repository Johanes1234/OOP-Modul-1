
/**
 * Class yang mengatur administrasi pelanggan mengenai ruangan.
 * 
 * @author (Johanes Gunawan) 
 * @version (2018-3-8)
 */
public abstract class Room
{
    // instance variables - replace the example below with your own
    private static Hotel hotel;
    private static String nomor_kamar;
    //private static boolean isAvailable;
    private static Customer customer;
    protected static double dailyTariff;
    private static StatusKamar status_kamar;
    private static Pesanan pesan;
    private static String string;
    
    /**
     * Constructor for objects of class Room
     */
    public Room(Hotel hotel, String nomor_kamar, StatusKamar status_kamar)
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
    
    //public boolean getStatusAvailable()
    //{
    //    return isAvailable;
    //}
    
    public Hotel getHotel()
    {
        return hotel;
    }
    
    public String getNomorKamar()
    {
        return nomor_kamar;
    }
    
    public double getDailyTariff()
    {
        return dailyTariff;
    }
    
    public StatusKamar getStatusKamar()
    {
        return status_kamar;
    }
    
    public Pesanan getPesanan()
    {
        return pesan;
    }
    
    public abstract TipeKamar getTipeKamar();
    
    public void setHotel(Hotel hotel)
    {
        Room.hotel = hotel;
    }
    
    public void setNomorKamar(String nomor_kamar)
    {
        Room.nomor_kamar = nomor_kamar;
    }
    
    //public void setStatusAvailable(boolean isAvailable)
    //{
    //    Room.isAvailable = isAvailable;
    //}
    
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
    
    public String toString()
    {
        if(true){
            return "\nNama Hotel   : " + hotel +
                   "\nTipe kamar          : " +getTipeKamar()+ 
                   "\nHarga        : " + dailyTariff +
                   "\nStatus Kamar : " + status_kamar +
                   " ";        
        }
       
        else{
            return "\nNama Hotel   : " + hotel +
                   "\nTipe kamar          : " +getTipeKamar()+
                   "\nHarga        : " + dailyTariff +
                   "\nStatus Kamar : " + status_kamar +
                   "\nPelanggan    : " + customer +
                   " ";
                }
    }
    public static void printData()
    {
        System.out.println("Hotel " + hotel);
        System.out.println("Nomor Kamar " + nomor_kamar);
        System.out.println("Kamar Tersedia " + status_kamar);
        System.out.println("Harga " + dailyTariff);
        System.out.println("Kamar " + status_kamar);
    }
}
