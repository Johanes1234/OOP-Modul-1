import java.util.ArrayList;
/**
 * Class Customer ini memodelkan data-data yang berhubungan dengan customer.
 * 
 * @author (Johanes Gunawan) 
 * @version (2018-02-22)
 */
public class DatabaseCustomer
{
    protected String[] list_customer;
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID = 0;

    /**
     * Constructor for objects of class DatabaseCustomer
     */
    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }

    public static int getLastCustomerID() {
        return LAST_CUSTOMER_ID;
    }

    public static boolean addCustomer(Customer baru) throws PelangganSudahAdaException
    {
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++) {
            Customer tes = CUSTOMER_DATABASE.get(i);
            if (tes.getID()==baru.getID()){
                //return false;
                throw new PelangganSudahAdaException(baru);
            }
        }
        CUSTOMER_DATABASE.add(baru);
        LAST_CUSTOMER_ID=baru.getID();
        return true;
    }


    /**
     * method ini digunakan untuk menghapus customer dari database berdasarkan
     * id
     *
     * @param id
     * @return false
     */
    public static Customer getCustomer(int id)
    {
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++) {
            Customer tes = CUSTOMER_DATABASE.get(i);
            if (tes.getID()==id){
                return tes;
            }
        }
        return null;
    }


    public static boolean removeCustomer(int id) throws PelangganTidakDitemukanException
    {
        for (int i = 0; i < CUSTOMER_DATABASE.size(); i++) {
            Customer tes = CUSTOMER_DATABASE.get(i);
            if (tes.getID() == id){
                Pesanan pesan = DatabasePesanan.getPesananAktif(tes);
                try
                {
                    DatabasePesanan.removePesanan(tes);
                }catch(PesananTidakDitemukanException e)
                {
                    System.out.println(e.getPesan());
                }
                if(CUSTOMER_DATABASE.remove(tes))
                {
                    return true;
                }
            }
        }
        //return false;
        throw new PelangganTidakDitemukanException(id);
    }
}
