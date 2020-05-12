import java.util.ArrayList;

public class Flickr {
    public String title;
    public String link;
    public String description;
    public String modified;
    public String generator;
    ArrayList< Object > items = new ArrayList < Object > ();
    public Flickr() {

    }

    public Flickr(String title, String link, String description, String modified, String generator, ArrayList<Object> items) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.modified = modified;
        this.generator = generator;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getGenerator() {
        return generator;
    }

    public void setGenerator(String generator) {
        this.generator = generator;
    }

    public ArrayList<Object> getItems() {
        return items;
    }

    public void setItems(ArrayList<Object> items) {
        this.items = items;
    }
}