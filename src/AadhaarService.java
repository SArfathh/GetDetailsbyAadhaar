import java.util.HashMap;
import java.util.Map;
public class AadhaarService {

    private static Map<String,Aadhaar> aadhaarMap  = new HashMap<>();
    static{
        aadhaarMap.put("1234568", new Aadhaar("1234568", "ak", "akfather", "bangalore")  );
        aadhaarMap.put("1234569", new Aadhaar("1234569", "szr", "szrfather", "bangalore")  );
    }

    public Aadhaar getAadhaarByNumber(String aadhaarNumber){
        return aadhaarMap.get(aadhaarNumber);
    }
}

