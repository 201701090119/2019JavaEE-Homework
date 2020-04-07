package org.ex2.vo;

import java.io.Serializable;

public class Bks_ extends Xs_ implements Serializable {
    private int xsId;
    private Boolean ky;


    public int getXsId() {
        return xsId;
    }

    public void setXsId(int xsId) {
        this.xsId = xsId;
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

        Bks_ bks = (Bks_) o;

        if (xsId != bks.xsId) return false;
        if (ky != null ? !ky.equals(bks.ky) : bks.ky != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = xsId;
        result = 31 * result + (ky != null ? ky.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Bks{" +
                "xsId=" + xsId +
                ", ky=" + ky +
                '}';
    }
}
