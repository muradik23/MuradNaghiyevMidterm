package web.and.mobile.midterm.library.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "studentHistory")
public class StudentHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int userId;
    private int bookId;
    private Date pickUp;
    private Date dropOff;

    public StudentHistory(int userId, int bookId, Date pickUp, Date dropOff) {
        this.userId = userId;
        this.bookId = bookId;
        this.pickUp = pickUp;
        this.dropOff = dropOff;
    }

    public StudentHistory() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public Date getPickUp() {
        return pickUp;
    }

    public void setPickUp(Date pickUp) {
        this.pickUp = pickUp;
    }

    public Date getDropOff() {
        return dropOff;
    }

    public void setDropOff(Date dropOff) {
        this.dropOff = dropOff;
    }
}
