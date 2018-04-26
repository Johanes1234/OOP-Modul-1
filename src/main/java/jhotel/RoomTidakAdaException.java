package jhotel;
import java.lang.Exception;

class RoomTidakDitemukanException extends Exception
{
    private Hotel hotel_error;
    private String room_error;

    public RoomTidakDitemukanException(Hotel hotel_input, String room_input)
    {
        super("Kamar yang terletak di");
        room_error = room_input;
        hotel_error = hotel_input;
    }

    public String getPesan()
    {
        return super.getMessage() + hotel_error + "dan dengan nomor kamar" + room_error + "tidak ditemukan.";
    }
}
