package jhotel;
/**
 * Enumeration class TipeKamar - write a description of the enum class here
 * 
 * @author (Johanes Gunawan)
 * @version (2018-3-8)
 */
public enum TipeKamar
{
    Single("Single"), Double("Double"), Premium("Premium");
    
    private String deskripsi;
    private String string;
    
    TipeKamar(String deskripsi){
        deskripsi =  deskripsi;
    }
    
    String gettype(){
        return deskripsi;
    }
    
    public String toString()
    {
        return string;
    }
}

