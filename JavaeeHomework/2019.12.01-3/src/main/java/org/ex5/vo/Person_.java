package org.ex5.vo;




import java.io.Serializable;


public class Person_ implements Serializable {
    private int id;
    private String name;

    public Room_ getRoom() {
        return room;
    }

    public void setRoom(Room_ room) {
        this.room = room;
    }

    // private Integer roomId;
    private Room_ room;


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



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person_ person = (Person_) o;

        if (id != person.id) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
