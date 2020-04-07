package org.ex6.vo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


public class Mayor implements Serializable {
    private int cid;
    private String mName;
    private Integer mAge;
    private String mGender;
    private String mTel;
    private City city;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }


    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }


    public Integer getmAge() {
        return mAge;
    }

    public void setmAge(Integer mAge) {
        this.mAge = mAge;
    }


    public String getmGender() {
        return mGender;
    }

    public void setmGender(String mGender) {
        this.mGender = mGender;
    }


    public String getmTel() {
        return mTel;
    }

    public void setmTel(String mTel) {
        this.mTel = mTel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mayor mayor = (Mayor) o;

        if (cid != mayor.cid) return false;
        if (mName != null ? !mName.equals(mayor.mName) : mayor.mName != null) return false;
        if (mAge != null ? !mAge.equals(mayor.mAge) : mayor.mAge != null) return false;
        if (mGender != null ? !mGender.equals(mayor.mGender) : mayor.mGender != null) return false;
        if (mTel != null ? !mTel.equals(mayor.mTel) : mayor.mTel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cid;
        result = 31 * result + (mName != null ? mName.hashCode() : 0);
        result = 31 * result + (mAge != null ? mAge.hashCode() : 0);
        result = 31 * result + (mGender != null ? mGender.hashCode() : 0);
        result = 31 * result + (mTel != null ? mTel.hashCode() : 0);
        return result;
    }
}
