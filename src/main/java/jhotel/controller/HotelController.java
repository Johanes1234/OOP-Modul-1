package jhotel.controller;

import jhotel.DatabaseHotel;
import jhotel.Hotel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.stream.Stream;

public class HotelController extends ArrayList<Hotel> {
    @RequestMapping("/hotel/")
    public static ArrayList<Hotel> hotelsList()
    {
        ArrayList<Hotel> test = DatabaseHotel.getHotelDatabase();
        return test;
    }

    @RequestMapping(value = "/hotel/{id_hotel}", method = RequestMethod.GET)
    public static Hotel getHotel(@PathVariable int id_hotel)
    {
        Hotel test = DatabaseHotel.getHotel(id_hotel);
        return test;
    }

    @Override
    public Stream<Hotel> stream() {
        return null;
    }
}
