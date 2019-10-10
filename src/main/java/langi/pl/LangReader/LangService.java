package langi.pl.LangReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class LangService {

    @Autowired
    LangDbInMemory langDbInMemory;

    public HashMap<String, Language> getRecord(String name){
        HashMap<String, Language> mapped = new HashMap<>();
        Language record = langDbInMemory.getRecord(name);

        if(record != null){
            mapped.put("record", record);
        }
        return mapped;
    }

    public boolean addRecord (String name, String description, boolean isCool){
        if(langDbInMemory.getRecord(name) != null){
            return false;
        }
        return langDbInMemory.addRecord(name, description, isCool);
    }
}
