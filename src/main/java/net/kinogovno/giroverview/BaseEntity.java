package net.kinogovno.giroverview;

public class BaseEntity {

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String toString () {
        return "BaseEntity{" +
                "id=" + id +
                ")";
    }

    public  boolean isNew() {
        return (this.id == 0);
    }
}
