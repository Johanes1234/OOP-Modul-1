
/**
 * Class Customer ini memodelkan pelanggan yang membuat pesanan.
 * 
 * @author (Johanes Gunawan) 
 * @version (2018-02-22)
 */
public class Customer
{
    protected static int id;
    protected static String nama;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(int id, String nama)
    {
        id = id;
        nama = nama;
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
}
