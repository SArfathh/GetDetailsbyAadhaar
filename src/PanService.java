import java.util.HashMap;
import java.util.Map;

public class PanService {

    private static Map<String, Pan> panMap = new HashMap<>();
    static {
        panMap.put("ddejaj",new Pan("ddejaj", "1234568", "bob", "dogecoin"));
        panMap.put("janaaa",new Pan("janaaa", "1234569", "bnp", "self"));

    }
    public Pan getPanByAadhaarNumber(String AadhaarNumber ){
        for (Pan pan: panMap.values()) {
            if(pan.getAadhaarNumber().equals(AadhaarNumber)){
                return pan;
            }
        }
        return null;
    }
}
