import java.util.ArrayList;

public class DatabaseRoom {
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<Room>();

    /**
     * Method yang digunakan untuk mengembalikan database kamar.
     *
     * @return ArrayList<Room> mengembalikan database kamar.
     */

    public static ArrayList<Room> getRoomDatabase() {
        return ROOM_DATABASE;
    }

    /**
     * Method yang digunakan untuk menambahkan kamar kedalam database.
     *
     * @param baru input customer yang akan dimasukkan kedalam database
     * @return boolean mengembalikan apakah penambahan berhasil atau tidak.
     */

    public static boolean addRoom(Room baru) {
        for (Room kamar : ROOM_DATABASE) {
            if (!kamar.getHotel().equals(baru.getHotel()) &&
                    !kamar.getNomorKamar().equals(baru.getNomorKamar())) {
                ROOM_DATABASE.add(baru);
                return true;
            }
        }

        return false;
    }

    /**
     * Method yang digunakan untuk mencari kamar dari database.
     *
     * @param hotel, nomor_kamar input customer yang akan dimasukkan kedalam database
     * @return Room mengembalikan kamar.
     */

    public static Room getRoom(Hotel hotel, String nomor_kamar) {
        for (Room kamar : ROOM_DATABASE) {
            if (kamar.getHotel().equals(hotel) &&
                    kamar.getNomorKamar().equals(nomor_kamar)) {
                return kamar;
            }
        }

        return null;
    }

    /**
     * Method yang digunakan untuk mencari kamar dari database berdasarkan hotel.
     *
     * @param hotel, nomor_kamar input customer yang akan dimasukkan kedalam database
     * @return Room mengembalikan kamar.
     */

    public static ArrayList<Room> getRoomsFromHotel(Hotel hotel) {
        ArrayList<Room> tempRoom = new ArrayList<Room>();

        for (Room kamar : ROOM_DATABASE) {
            if (kamar.getHotel().equals(hotel)) {
                tempRoom.add(kamar);
            }
        }

        return tempRoom;
    }

    /**
     * Method yang digunakan untuk mencari kamar kosong dari database.
     *
     * @return ArrayList<Room> mengembalikan kamar.
     */

    public static ArrayList<Room> getVacantRooms() {
        ArrayList<Room> tempRoom = new ArrayList<Room>();

        for (Room kamar : ROOM_DATABASE) {
            if (kamar.getStatusKamar().equals(StatusKamar.Vacant)) {
                tempRoom.add(kamar);
            }
        }

        return tempRoom;
    }

    /**
     * Method yang digunakan untuk menghapus kamar dari dalam database.
     *
     * @param hotel, nomor_kamar input nomor kamar yang akan dihapus dari database
     * @return boolean mengembalikan apakah penghapusan berhasil atau tidak.
     */

    public static boolean removeRoom(Hotel hotel, String nomor_kamar) {
        for (Room kamar : ROOM_DATABASE) {
            if (kamar.getHotel().equals(hotel) &&
                    kamar.getNomorKamar().equals(nomor_kamar)) {
                Administrasi.pesananDibatalkan(kamar);
                if (ROOM_DATABASE.remove(kamar)) {
                    return true;
                }
            }
        }
        return false;
    }
}

