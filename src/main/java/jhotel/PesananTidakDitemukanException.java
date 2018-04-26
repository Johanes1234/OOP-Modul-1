package jhotel;
import java.lang.Exception;

public class PesananTidakDitemukanException extends Exception
{
    private Customer pelanggan_error;
    public PesananTidakDitemukanException(Customer pelanggan_input)
    {
        super("Pesanan yang dipesan oleh");
        pelanggan_error = pelanggan_input;
    }

    public String getPesan()
    {
        return super.getMessage() + pelanggan_error.getNama() + " tidak ditemukan.";
    }
}