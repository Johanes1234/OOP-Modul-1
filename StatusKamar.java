
/**
 * Enumeration class StatusKamar - write a description of the enum class here
 * 
 * @author (Johanes Gunawan)
 * @version (2018-3-8)
 */
public enum StatusKamar
{
    Booked("Booked"), Processed("Processed"), Vacant("Vacant");
    private String type;
    StatusKamar(String h){
        type =  h;
    }
    String gettype(){
        return type;
    }
}
