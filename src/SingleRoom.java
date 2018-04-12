
/**
 * Write a description of class SingleRoom here.
 * 
 * @author (Johanes Gunawan) 
 * @version (2018-3-15)
 */
public class SingleRoom extends Room
{
    // instance variables - replace the example below with your own
    private static final TipeKamar TIPE_KAMAR = TipeKamar.Single;

    /**
     * Constructor for objects of class SingleRoom
     */
    public SingleRoom(Hotel hotel, String nomor_kamar, boolean isAvailable, StatusKamar status_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar, isAvailable, status_kamar);
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
}
