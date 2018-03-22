
/**
 * Class ini menunjukkan lokasi hotel berada.
 * 
 * @author (Johanes Gunawan) 
 * @version (2018-03-01)
 */
public class Lokasi
{
    private static float x_coord;
    private static float y_coord;
    private static String deskripsiLokasi;
    private static String string;

    /**
     * Constructor for objects of class Lokasi
     */
    public Lokasi(float x_coord, float y_coord, String deskripsiLokasi)
    {
        x_coord = x_coord;
        y_coord = y_coord;
        deskripsiLokasi = deskripsiLokasi;
    }

    /**
     * Method untuk memasukkan nilai x_coord
     * @param x_coord koordinat x hotel
     */
    public void setX(float x_coord)
    {
        Lokasi.x_coord = x_coord;
    }
    
    /**
     * Method untuk memasukkan nilai y_coord
     * @param y_coord koordinat y hotel
     */
    public void setY(float y_coord)
    {
        Lokasi.y_coord = y_coord;
    }
    
    /**
     * Method untuk memasukkan nilai deskripsiLokasi
     * @param deskripsiLokasi deskripsi mengenai hotel
     */
    public void setDeskripsi(String deskripsi)
    {
        Lokasi.deskripsiLokasi = deskripsiLokasi;
    }
    
    /**
     * Method untuk mendapat nilai x_coord
     * @return koordinat x hotel
     */
    public float getX()
    {
        return x_coord;
    }
    
    /**
     * Method untuk mendapat nilai y_coord
     * @return koordinat y hotel
     */
    public float getY()
    {
        return y_coord;
    }
    
    /**
     * Method untuk mendapat nilai deskripsiLokasi
     * @return deskripsi hotel
     */
    public String getDeskripsi()
    {
        return deskripsiLokasi;
    }
    
    public String toString()
    {
        return string;
    }
    
    public static void printData()
    {
        System.out.println("Koordinat X " + x_coord);
        System.out.println("Koordinat Y " + y_coord);
        System.out.println("Deskripsi Lokasi " + deskripsiLokasi);
    }
}
