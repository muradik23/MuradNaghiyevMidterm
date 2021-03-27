package web.and.mobile.midterm.library.model.entity;


import javax.persistence.*;

@Entity
@Table(name = "books")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String category;
    private String author;
    private int takenNotTaken;

    public Books(String name, String category, String author, int takenNotTaken) {
        this.name = name;
        this.category = category;
        this.author = author;
        this.takenNotTaken = takenNotTaken;
    }

    public Books() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTakenNotTaken() {
        return takenNotTaken;
    }

    public void setTakenNotTaken(int takenNotTaken) {
        this.takenNotTaken = takenNotTaken;
    }
}
