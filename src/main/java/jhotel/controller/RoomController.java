package jhotel.controller;

import jhotel.DatabaseHotel;
import jhotel.DatabaseRoom;
import jhotel.Room;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

public class RoomController
{
    @RequestMapping(value = "/vacantrooms/", method = RequestMethod.GET)
    public static ArrayList<Room> vacantRooms()
    {
        ArrayList<Room> rocon = DatabaseRoom.getVacantRooms();
        return rocon;
    }

    @RequestMapping(value = "/room/{id_hotel}/{room_no}", method = RequestMethod.GET)
    public static Room getRoom(int id_hotel, String nomor_kamar)
    {
        Room roomer = DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel), nomor_kamar);
        return roomer;
    }
}
