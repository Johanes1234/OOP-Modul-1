
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
        /*
        Customer cust1 = new Customer(1506725136, "Johanes Gunawan", new GregorianCalendar(2018,03,22).getTime());
        Pesanan cust2 = new Pesanan(1506725136, "Johanes Gunawan", new GregorianCalendar(2018,03,22).getTime());
        Lokasi lokasiid = new Lokasi(3,6,"moduloop");
        Hotel hotelid = new Hotel("kuring",lokasiid,6);
        Room single = new SingleRoom(hotelid, "6969", true, StatusKamar.Booked);
        */
        
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
        /*
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
        */
        //Customer.toString();
        //Lokasi.toString();
        //Hotel.toString();
        //Pesanan.toString();

        DatabaseCustomer.addCustomer(new Customer("Johanes", 14, 04,2018));
        DatabaseCustomer.addCustomer(new Customer("Aria", 23, 07,2018));
        DatabaseCustomer.addCustomer(new Customer("Jan", 13, 05,2018));
        System.out.println("Data ");

        for(Customer coba1: DatabaseCustomer.getCustomerDatabase())
        {
            System.out.println(coba1);
        }

        DatabaseHotel.addHotel(new Hotel ("Ambian", new Lokasi(13,13,"depan"), 5));
        DatabaseHotel.addHotel(new Hotel ("Beethoven", new Lokasi(23,23,"tengah"), 5));
        DatabaseHotel.addHotel(new Hotel ("Canon", new Lokasi(14,14,"belakang"), 5));

        for(Hotel coba2: DatabaseHotel.getHotelDatabase())
        {
            System.out.println(coba2);
        }

        DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "B1"));
        DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(2), "D2"));
        DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(3), "C3"));

        for(Room coba3: DatabaseRoom.getRoomDatabase())
        {
            System.out.println(coba3);
        }

        DatabasePesanan.addPesanan(new Pesanan(21,DatabaseCustomer.getCustomer(1)));
        DatabasePesanan.addPesanan(new Pesanan(42,DatabaseCustomer.getCustomer(2)));
        DatabasePesanan.addPesanan(new Pesanan(33,DatabaseCustomer.getCustomer(3)));

        for(Pesanan coba4: DatabasePesanan.getPesananDatabase())
        {
            System.out.println(coba4);
        }

        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(1)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(1), "B1"));
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(3)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(2), "D2"));
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(2)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(1), "C3"));


        for (Pesanan coba5: DatabasePesanan.getPesananDatabase())
        {
            System.out.println(coba5);
        }

        Administrasi.pesananDibatalkan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(2)));
        Administrasi.pesananSelesai(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(1)));
        Administrasi.pesananSelesai(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(3)));

        for (Pesanan coba6 :DatabasePesanan.getPesananDatabase())
        {
            System.out.println(coba6);
        }
    }
}
