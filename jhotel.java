
/**
 * Class Customer ini memodelkan hotel dimana customer datang membuat pesanan.
 * 
 * @author (Johanes Gunawan) 
 * @version (2018-02-22)
 */
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
        Customer customerid = new Customer(10,"Johanes");
        Lokasi lokasiid = new Lokasi(3,6,"moduloop");
        Hotel hotelid = new Hotel("kuring",lokasiid,6);
        Pesanan pesananid = new Pesanan(1506725136,customerid);
        /*
         * memanggil method print
         */
        pesananid.printData();
        hotelid.printData();
        /*
         * mengubah isi dan memprint 
         */
        customerid.setNama("Nandana");
        customerid.printData();
    }
}
