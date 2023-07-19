package model;

public class Toy implements Comparable<Toy>{
    public Integer toyId;
    public String toyName;
    public Integer toyPeriodicity;

    public Toy(Integer toyId, String toyName, Integer toyPeriodicity) {
            this.toyId = toyId;
            this.toyName = toyName;
            this.toyPeriodicity = toyPeriodicity;
    }

    public Toy() {
            this.toyId = 0;
            this.toyName = " ";
            this.toyPeriodicity = 0;
    }

    public Integer getToyId() {
        return toyId;
    }
    public void setToyId(Integer toyId) {
        this.toyId = toyId;
    }

    public String getToyName() {
        return toyName;
    }
    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public Integer getToyPeriodicity() {
        return toyPeriodicity;
    }
    public void setToyPeriodicity(Integer toyPeriodicity) {
        this.toyPeriodicity = toyPeriodicity;
    }

    @Override
    public String toString() {
        return toyName;
    }

    @Override
    public int compareTo(Toy o) {
        return this.toyPeriodicity.compareTo(o.toyPeriodicity);
    }

}
