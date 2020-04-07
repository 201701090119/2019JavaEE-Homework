package org.ex2.vo;

import java.io.Serializable;

public class Yjs_ extends Xs_ implements Serializable {
    private int xsId;
    private String researchResult;


    public int getXsId() {
        return xsId;
    }

    public void setXsId(int xsId) {
        this.xsId = xsId;
    }


    public String getResearchResult() {
        return researchResult;
    }

    public void setResearchResult(String researchResult) {
        this.researchResult = researchResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Yjs_ yjs = (Yjs_) o;

        if (xsId != yjs.xsId) return false;
        if (researchResult != null ? !researchResult.equals(yjs.researchResult) : yjs.researchResult != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = xsId;
        result = 31 * result + (researchResult != null ? researchResult.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Yjs{" +
                "xsId=" + xsId +
                ", researchResult='" + researchResult + '\'' +
                '}';
    }
}
