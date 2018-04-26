package jhotel;
/**
 * Write a description of class PremiumRoom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PremiumRoom extends Room
{
    // instance variables - replace the example below with your own
    private static double DISCOUNT = 0.3;
    private static final TipeKamar TIPE_KAMAR = TipeKamar.Premium;

    /**
     * Constructor for objects of class PremiumRoom
     */
    public PremiumRoom(Hotel hotel, String nomor_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public TipeKamar getTipeKamar()
    {
        // put your code here
        return TIPE_KAMAR;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double getDiscount()
    {
        // put your code here
        return DISCOUNT;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setDailyTariff(double dailyTariff)
    {
        // put your code here
        Room.dailyTariff = dailyTariff * DISCOUNT;
    }
}
