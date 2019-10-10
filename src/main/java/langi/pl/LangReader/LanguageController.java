package langi.pl.LangReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class LanguageController {

    @Autowired
    LangService langService;

    @RequestMapping("/languages/{name}")
    private HashMap<String, Language> getLang(@PathVariable("name") String name){
        HashMap<String, Language> record = langService.getRecord(name);
        return record;
    }
}
