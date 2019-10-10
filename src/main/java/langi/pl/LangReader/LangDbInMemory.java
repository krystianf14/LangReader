package langi.pl.LangReader;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class LangDbInMemory {

    private HashMap<String, Language> records = new HashMap<>();

    public boolean addRecord(String name, String description, boolean isColl){
        if(records.get(name) != null){
            return false;
        }
        records.put(name, new Language(name, description, isColl));
        return true;
    }

    public Language getRecord (String name){
        return records.get(name);
    }
}
