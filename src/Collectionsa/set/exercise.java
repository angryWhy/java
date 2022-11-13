package Collectionsa.set;

import java.util.Objects;

public class exercise {
    public static void main(String[] args) {

    }
}
class Exer{
    private String name;
    private int gae;
    public Exer(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exer exer = (Exer) o;
        return gae == exer.gae && Objects.equals(name, exer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gae);
    }
}
