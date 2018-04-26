package jhotel;
/**
 * Class yang mengatur administrasi pelanggan.
 * 
 * @author (Johanes Gunawan) 
 * @version (2018-3-8)
 */
public class Administrasi
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Administrasi
     */
    public Administrasi()
    {
       
    }

    /**
     * Method mengatur logika pemesanan dan pembatalan pesanan
     * 
     * @param  pesan   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
       pesan.setStatusSelesai(false);
       pesan.setStatusDiproses(true);
       pesan.setRoom(kamar);
       roomAmbilPesanan(pesan, kamar);
    }
    
    public static void roomAmbilPesanan(Pesanan pesan, Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Booked);
        kamar.setPesanan(pesan);
    }
    
    public static void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Vacant);
        kamar.setPesanan(null);
    }
    
    public static void pesananDibatalkan(Room kamar)
    {
        Pesanan pesanwhile = new Pesanan();
        pesanwhile = kamar.getPesanan();
        pesanwhile.setStatusSelesai(false);
        pesanwhile.setStatusDiproses(false);
        pesanwhile.setStatusAktif(false);
        pesanwhile.setRoom(null);
        kamar.setPesanan(pesanwhile);
        
        roomLepasPesanan(kamar);
    }
    
    public static void pesananDibatalkan(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());
        
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        pesan.setRoom(null);
    }
    
    public static void pesananSelesai(Room kamar)
    {
        Pesanan pesanwhile = new Pesanan();
        pesanwhile = kamar.getPesanan();
        pesanwhile.setStatusSelesai(true);
        pesanwhile.setStatusDiproses(false);
        pesanwhile.setStatusAktif(false);
        pesanwhile.setRoom(null);
        kamar.setPesanan(pesanwhile);
        
        roomLepasPesanan(kamar);
    }
    
    public static void pesananSelesai(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());
        
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        pesan.setRoom(null);
    }
}
