package com.capg;

public class Country {
    private String code;
    private String name;

    public Country() {
        System.out.println("Inside Country Constructor.");
    }

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
        System.out.println("Inside Country Constructor.");
    }

    public String getCode() {
        System.out.println("Inside Code Getter.");
        return code;
    }

    public void setCode(String code) {
        System.out.println("Inside Code Setter.");
        this.code = code;
    }

    public String getName() {
        System.out.println("Inside Name Getter.");
        return name;
    }

    public void setName(String name) {
        System.out.println("Inside Name Setter.");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
