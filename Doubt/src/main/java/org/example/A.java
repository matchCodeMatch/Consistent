package org.example;

public class A {
    private int is;
    private String name ;

    public int getIs() {
        return is;
    }

    public void setIs(int is) {
        this.is = is;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    A(int is , String name)
    {
        this.is = is;
        this.name = name;
    }
}
