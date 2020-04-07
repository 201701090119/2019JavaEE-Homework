package org.ex6.vo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


public class City implements Serializable {
    private int cid;
    private String cName;
    private Double cArea;
    private Integer cPopulation;

    public Mayor getMayor() {
        return mayor;
    }

    public void setMayor(Mayor mayor) {
        this.mayor = mayor;
    }

    private Mayor mayor;


    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }


    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }


    public Double getcArea() {
        return cArea;
    }

    public void setcArea(Double cArea) {
        this.cArea = cArea;
    }


    public Integer getcPopulation() {
        return cPopulation;
    }

    public void setcPopulation(Integer cPopulation) {
        this.cPopulation = cPopulation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        if (cid != city.cid) return false;
        if (cName != null ? !cName.equals(city.cName) : city.cName != null) return false;
        if (cArea != null ? !cArea.equals(city.cArea) : city.cArea != null) return false;
        if (cPopulation != null ? !cPopulation.equals(city.cPopulation) : city.cPopulation != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cid;
        result = 31 * result + (cName != null ? cName.hashCode() : 0);
        result = 31 * result + (cArea != null ? cArea.hashCode() : 0);
        result = 31 * result + (cPopulation != null ? cPopulation.hashCode() : 0);
        return result;
    }
}
