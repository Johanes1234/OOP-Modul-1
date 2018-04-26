package jhotel;
/**
 * Enumeration class StatusKamar - write a description of the enum class here
 * 
 * @author (Johanes Gunawan)
 * @version (2018-3-8)
 */
public enum StatusKamar
{
    Booked("Booked"), Processed("Processed"), Vacant("Vacant");
    private String deskripsi;
    private String string;
    
    StatusKamar(String deskripsi){
        string =  deskripsi;
    }
    
    String gettype(){
        return deskripsi;
    }
    
    public String toString()
    {
        return string;
    }
}
