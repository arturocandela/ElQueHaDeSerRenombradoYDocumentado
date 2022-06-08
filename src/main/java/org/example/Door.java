package org.example;

public class Door {

    String name;
    boolean closed = true;

    public Door( String name ){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Door{" +
                "name='" + name + '\'' +
                ", closed=" + closed +
                '}';
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }
}
