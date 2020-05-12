import java.util.ArrayList;
<<<<<<< Updated upstream

public class Flickr {
    public String title;
    public String link;
    public String description;
    public String modified;
    public String generator;
    ArrayList< Object > items = new ArrayList < Object > ();



    // Getter Methods
=======
import java.util.List;

public class Flickr {
    private String title;
    private String link;
    private String description;
    private String modified;
    private String generator;
    private List<Items> items;

    public Flickr() {
    }

    public Flickr(String title, String link, String description, String modified, String generator, List<Items> items) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.modified = modified;
        this.generator = generator;
        this.items = items;
    }
>>>>>>> Stashed changes

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getDescription() {
        return description;
    }

    public String getModified() {
        return modified;
    }

    public String getGenerator() {
        return generator;
    }

<<<<<<< Updated upstream
    // Setter Methods
=======
    public List<Items> getItems() {
        return items;
    }
>>>>>>> Stashed changes

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public void setGenerator(String generator) {
        this.generator = generator;
    }
<<<<<<< Updated upstream
=======

    public void setItems(List<Items> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Flickr{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", description='" + description + '\'' +
                ", modified='" + modified + '\'' +
                ", generator='" + generator + '\'' +
                ", items=" + items +
                '}';
    }
>>>>>>> Stashed changes
}