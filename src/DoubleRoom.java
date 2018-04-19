
/**
 * Write a description of class DoubleRoom here.
 * 
 * @author (Johanes Gunawan) 
 * @version (2018-3-15)
 */
public class DoubleRoom extends Room
{
    // instance variables - replace the example below with your own
    private static Customer customer2;
    private static final TipeKamar TIPE_KAMAR = TipeKamar.Double;

    /**
     * Constructor for objects of class DoubleRoom
     */
    public DoubleRoom(Hotel hotel, String nomor_kamar)
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
    public Customer getCustomer2()
    {
        // put your code here
        return customer2;
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
    public void setCustomer2(Customer customer2)
    {
        // put your code here
        DoubleRoom.customer2 = customer2;
    }
}
