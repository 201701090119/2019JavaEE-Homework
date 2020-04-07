package ex2.vo;

import java.io.Serializable;


public class StudentClass implements Serializable {
    private Integer classId;
    private String className;
    private String classMajor;
    private String classCollege;

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }


    public String getClassMajor() {
        return classMajor;
    }

    public void setClassMajor(String classMajor) {
        this.classMajor = classMajor;
    }


    public String getClassCollege() {
        return classCollege;
    }

    public void setClassCollege(String classCollege) {
        this.classCollege = classCollege;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentClass that = (StudentClass) o;

        if (classId != that.classId) return false;
        if (className != null ? !className.equals(that.className) : that.className != null) return false;
        if (classMajor != null ? !classMajor.equals(that.classMajor) : that.classMajor != null) return false;
        if (classCollege != null ? !classCollege.equals(that.classCollege) : that.classCollege != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = classId;
        result = 31 * result + (className != null ? className.hashCode() : 0);
        result = 31 * result + (classMajor != null ? classMajor.hashCode() : 0);
        result = 31 * result + (classCollege != null ? classCollege.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                ", classMajor='" + classMajor + '\'' +
                ", classCollege='" + classCollege + '\'' +
                '}';
    }
}
