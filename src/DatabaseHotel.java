import java.util.ArrayList;
/**
 * Write a description of class DatabaseHotel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseHotel
{
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<Hotel>();
    private static int LAST_HOTEL_ID = 0;
    // instance variables - replace the example below with your own
    private static String[] list_hotel;

    /**
     * Constructor for objects of class DatabaseHotel
     */
    public static ArrayList<Hotel> getHotelDatabase()
    {
        return HOTEL_DATABASE;
    }

    public static int getLastHotelId(){
        return LAST_HOTEL_ID;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  baru  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static boolean addHotel(Hotel baru)
    {
        for (int i = 0; i < HOTEL_DATABASE.size(); i++) {
            Hotel tes = HOTEL_DATABASE.get(i);
            if (tes.getID()==baru.getID()){
                return false;
            }
        }
        LAST_HOTEL_ID=baru.getID();
        HOTEL_DATABASE.add(baru);
        return true;
    }

    public static boolean removeHotel(int id)
    {
        for (int i = 0; i < HOTEL_DATABASE.size(); i++) {
            Hotel tes = HOTEL_DATABASE.get(i);
            if (tes.getID()==id){
                ArrayList<Room> KAMAR_TEST = DatabaseRoom.getRoomsFromHotel(tes);
                for (int x = 0; x < KAMAR_TEST.size(); x++){
                    Room kamar = KAMAR_TEST.get(x);
                    DatabaseRoom.removeRoom(tes, kamar.getNomorKamar());
                }
                if(HOTEL_DATABASE.remove(tes))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static Hotel getHotel(int id){
        for (int i = 0; i < HOTEL_DATABASE.size(); i++) {
            Hotel tes = HOTEL_DATABASE.get(i);
            if (tes.getID()==id){
                return tes;
            }
        }
        return null;
    }
}
