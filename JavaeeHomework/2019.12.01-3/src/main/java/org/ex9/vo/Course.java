package org.ex9.vo;


import java.io.Serializable;


public class Course implements Serializable {
    private int id;
    private String cnumber;
    private String cname;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getCnumber() {
        return cnumber;
    }

    public void setCnumber(String cnumber) {
        this.cnumber = cnumber;
    }


    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        if (id != course.id) return false;
        if (cnumber != null ? !cnumber.equals(course.cnumber) : course.cnumber != null) return false;
        if (cname != null ? !cname.equals(course.cname) : course.cname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (cnumber != null ? cnumber.hashCode() : 0);
        result = 31 * result + (cname != null ? cname.hashCode() : 0);
        return result;
    }
}
