package langi.pl.LangReader;

public class Language {

    private String name;
    private String description;
    private boolean isColl;

    public Language(String name, String description, boolean isColl) {
        this.name = name;
        this.description = description;
        this.isColl = isColl;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isColl() {
        return isColl;
    }
}
