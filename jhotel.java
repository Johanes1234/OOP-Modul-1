
/**
 * Class Customer ini memodelkan hotel dimana customer datang membuat pesanan.
 * 
 * @author (Johanes Gunawan) 
 * @version (2018-02-22)
*/
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class JHotel
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class JHotel
     */
    public JHotel()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main(String args[])
    {
        /*
         * membuat objek baru memanggil class lain
         */
        //Customer customerid = new Customer(10,"Johanes");
        Customer cust1 = new Customer(1506725136, "Johanes Gunawan", new GregorianCalendar(2018,03,22).getTime());
        Pesanan cust2 = new Pesanan(1506725136, "Johanes Gunawan", new GregorianCalendar(2018,03,22).getTime());
        Lokasi lokasiid = new Lokasi(3,6,"moduloop");
        Hotel hotelid = new Hotel("kuring",lokasiid,6);
        Room single = new SingleRoom(hotelid, "6969", true, StatusKamar.Booked);
        
        
        //Pesanan pesan = new Pesanan(13, 10000, customerid, single);
        //Pesanan pesananid = new Pesanan(15,1506725136,customerid);
        /*
         * memanggil method print
         */
        //pesananid.printData();
        //hotelid.printData();
        /*
         * mengubah isi dan memprint 
         */
        //customerid.setNama("Nandana");
        //customerid.printData();
        if(single instanceof DoubleRoom)
        {
            System.out.println("Benar DOuble Room");
        }
        else 
        System.out.println("Salah Bukan Double Room");
        
        Hotel.printData();
        Lokasi.printData();
        Customer.printData();
        Room.printData();
        Pesanan.printData();
        //Customer.toString();
        //Lokasi.toString();
        //Hotel.toString();
        //Pesanan.toString();
    }
}
