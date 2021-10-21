package com.wizard;

public class Customer {
    private int id;
    private String Name;
    private Integer age;

    public Customer(int id,String Name, Integer age) {
        this.id=id;
        this.Name = Name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String fName) {
        this.Name = fName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}
