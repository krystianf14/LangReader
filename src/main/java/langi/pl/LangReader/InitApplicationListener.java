package langi.pl.LangReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class InitApplicationListener implements ApplicationRunner {

    @Autowired
    private LangService langService;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception{
        langService.addRecord("C++", "Szybki drażliwy bez sensu", false);
        langService.addRecord("Phyton", "Taki jak poprzedni do przżycia", true);
        langService.addRecord("Java", "Tege sie uczymy najlepszy", true);
    }
}
