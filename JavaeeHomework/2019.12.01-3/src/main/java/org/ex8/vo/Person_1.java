package org.ex8.vo;

import org.ex5.vo.Room_;

import java.io.Serializable;


public class Person_1 implements Serializable {
    private int id;
    private String name;
    private Room_1 room;
    //private Integer roomId;
    public Room_1 getRoom() {
        return room;
    }

    public void setRoom(Room_1 room) {
        this.room = room;
    }

    // private Integer roomId;


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

//
//    public Integer getRoomId() {
//        return roomId;
//    }
//
//    public void setRoomId(Integer roomId) {
//        this.roomId = roomId;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person_1 person_1_ = (Person_1) o;

        if (id != person_1_.id) return false;
        if (name != null ? !name.equals(person_1_.name) : person_1_.name != null) return false;
        //if (roomId != null ? !roomId.equals(person_1_.roomId) : person_1_.roomId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
       // result = 31 * result + (roomId != null ? roomId.hashCode() : 0);
        return result;
    }
}
