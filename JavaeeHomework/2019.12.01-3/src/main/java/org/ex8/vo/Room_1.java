package org.ex8.vo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


public class Room_1 implements Serializable {
    private int id;
    private String address;
    private Set person=new HashSet();

    public Set getPerson() {
        return person;
    }

    public void setPerson(Set person) {
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room_1 room_1_ = (Room_1) o;

        if (id != room_1_.id) return false;
        if (address != null ? !address.equals(room_1_.address) : room_1_.address != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
