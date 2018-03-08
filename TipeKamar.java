
/**
 * Enumeration class TipeKamar - write a description of the enum class here
 * 
 * @author (Johanes Gunawan)
 * @version (2018-3-8)
 */
public enum TipeKamar
{
    Single("Single"), Double("Double"), Premium("Premium");
    private String type;
    TipeKamar(String k){
        type =  k;
    }
    String gettype(){
        return type;
    }
}

