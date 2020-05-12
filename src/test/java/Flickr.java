import java.util.ArrayList;

public class Flickr {
    public String title;
    public String link;
    public String description;
    public String modified;
    public String generator;
    ArrayList< Object > items = new ArrayList < Object > ();



    // Getter Methods

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

    // Setter Methods

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
}