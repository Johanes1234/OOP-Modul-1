package jhotel.controller;

import jhotel.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class PesananController
{
    @RequestMapping(value = "/pesanancustomer/{id_customer}", method = RequestMethod.GET)
    public static Pesanan pesananCust(int id_customer)
    {
        Pesanan pescus = DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer));
        return pescus;
    }

    @RequestMapping(value = "/pesanan/{id_pesanan}", method = RequestMethod.GET)
    public static Pesanan getPesanan(int id_pesanan)
    {
        Pesanan pesicus = DatabasePesanan.getPesanan(id_pesanan);
        return pesicus;
    }

    @RequestMapping(value = "/buatpesanan", method = RequestMethod.POST)
    public static Pesanan buatPesanan(@RequestParam(value = "jumlah_hari") int jumlah_hari,@RequestParam(value = "id_customer") int id_customer,@RequestParam(value = "id_hotel") int id_hotel,@RequestParam(value = "nomor_kamar") String nomor_kamar)
    {
        try
        {
            DatabasePesanan.addPesanan(new Pesanan(jumlah_hari, DatabaseCustomer.getCustomer(id_customer)));
        }
        catch (PesananSudahAdaException e)
        {
            e.getPesan();
        }
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer)),DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel),nomor_kamar));
        if(DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel),nomor_kamar)!=null)
        {
            DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer)).setBiaya();
        }
        return DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer));
    }

    @RequestMapping(value = "/cancelpesanan", method = RequestMethod.POST)
    public static Pesanan batalkanPesanan(@RequestParam(value = "id_pesanan") int id_pesanan)
    {
        Administrasi.pesananDibatalkan(DatabasePesanan.getPesanan(id_pesanan));
        return DatabasePesanan.getPesanan(id_pesanan);
    }

    @RequestMapping(value = "/finishpesanan", method = RequestMethod.POST)
    public static Pesanan selesaikanPesanan(@RequestParam(value = "id_pesanan") int id_pesanan)
    {
        Administrasi.pesananSelesai(DatabasePesanan.getPesanan(id_pesanan));
        return DatabasePesanan.getPesanan(id_pesanan);
    }
}
