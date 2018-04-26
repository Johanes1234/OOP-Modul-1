package jhotel;
/**
 * Class Customer ini memodelkan pelanggan yang membuat pesanan.
 * 
 * @author (Johanes Gunawan) 
 * @version (2018-02-22)
 */

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.*;
import java.text.*;

public class Customer
{
    protected static int id;
    protected static String nama;
    protected static String email;
    protected static Date dob;
    protected static String string;
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String nama, int tanggal, int bulan, int tahun, String email)
    {
        id = DatabaseCustomer.getLastCustomerID() + 1;
        Customer.nama = nama;
        dob = new Date(tahun, bulan, tanggal);
        //this.tanggal = tanggal;
        //this.bulan = bulan;
        //this.tahun = tahun;
    }
    
    public Customer(int id, String nama, Date dob, String email)
    {
        Customer.id = id;
        Customer.nama = nama;
        Customer.dob = dob;
    }
    
    public Customer()
    {

    }
    
    public static boolean validate(String emailStr) 
    {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
        return matcher.find();
    }
    
    /**
     * Method untuk memasukkan nilai id
     * @param id id pelanggan
     */
    public void setID(int id)
    {
        Customer.id = id;
    }
    
    /**
     * Method untuk memasukkan nilai nama
     * @param nama nama pelanggan
     */
    public void setNama(String nama)
    {
        Customer.nama = nama;
    }
    
    public void setEmail(String email)
    {
        if(validate(email) == true)
        {
            Customer.email = email;
            System.out.println("Valid");
        }
        else
        {
            System.out.println("No Valid");
        }
    }
    
    public void setDOB(Date dob)
    {
        Customer.dob = dob;
    }

    /**
     * Method untuk mendapat nilai id
     * @return id pelanggan
     */
    public int getID()
    {
        return id;
    }
    
    /**
     * Method untuk mendapat nilai nama
     * @return nama pelanggan
     */
    public String getNama()
    {
        return nama;
    }
    
    public static Date getDOB()
    {
        DateFormat sdf = new SimpleDateFormat("'DOB : 'dd-M-yyyy");
        String date = sdf.format(dob);
        System.out.print(date);
        return dob;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String toString()
    {
        if(true){
            return "\nCustomer ID   : " + id +
                   "\nName          : " + nama +
                   "\nE-Mail        : " + email +
                   "\nDate of Birth : " + dob +
                   "\nBooking order is in progress";        
        }
       
        else{
            return "\nCustomer ID   : " + id +
                   "\nName          : " + nama +
                   "\nE-Mail        : " + email +
                   "\nDate of Birth : " + dob;        
        }
    }
    
    public static void printData()
    {
        /*
         * ini digunakan untuk memprint data
         */
        System.out.println("Nama " + nama);
        System.out.println("ID " + id);
    }
}
