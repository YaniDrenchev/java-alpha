package models.base;

public class Item implements Comparable{
    private String title;
    private String description;
    public Item(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int compareTo(Object o) {
        return this.getTitle().compareTo(((Item) o).getTitle());
    }
}
