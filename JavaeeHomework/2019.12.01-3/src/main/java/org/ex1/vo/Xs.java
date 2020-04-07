package org.ex1.vo;


import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
import java.sql.Timestamp;


public class Xs implements Serializable {
    private int id;
    private String xh;
    private String xm;
    private Date bir;
    private String xsType;
    private String researchResult;
    private Boolean ky;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }


    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }


    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }


    public String getXsType() {
        return xsType;
    }

    public void setXsType(String xsType) {
        this.xsType = xsType;
    }


    public String getResearchResult() {
        return researchResult;
    }

    public void setResearchResult(String researchResult) {
        this.researchResult = researchResult;
    }


    public Boolean getKy() {
        return ky;
    }

    public void setKy(Boolean ky) {
        this.ky = ky;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Xs xs = (Xs) o;

        if (id != xs.id) return false;
        if (xh != null ? !xh.equals(xs.xh) : xs.xh != null) return false;
        if (xm != null ? !xm.equals(xs.xm) : xs.xm != null) return false;
        if (bir != null ? !bir.equals(xs.bir) : xs.bir != null) return false;
        if (xsType != null ? !xsType.equals(xs.xsType) : xs.xsType != null) return false;
        if (researchResult != null ? !researchResult.equals(xs.researchResult) : xs.researchResult != null)
            return false;
        if (ky != null ? !ky.equals(xs.ky) : xs.ky != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (xh != null ? xh.hashCode() : 0);
        result = 31 * result + (xm != null ? xm.hashCode() : 0);
        result = 31 * result + (bir != null ? bir.hashCode() : 0);
        result = 31 * result + (xsType != null ? xsType.hashCode() : 0);
        result = 31 * result + (researchResult != null ? researchResult.hashCode() : 0);
        result = 31 * result + (ky != null ? ky.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Xs{" +
                "id=" + id +
                ", xh='" + xh + '\'' +
                ", xm='" + xm + '\'' +
                ", bir=" + bir +
                ", xsType='" + xsType + '\'' +
                ", researchResult='" + researchResult + '\'' +
                ", ky=" + ky +
                '}';
    }
}
