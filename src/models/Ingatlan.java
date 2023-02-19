// Farkas Csaba
// 2023-002-19
// SZOFT II/N
// Dolgozat IV
package models;

public class Ingatlan {
    String name;
    String city;
    double salary;

    public Ingatlan(String name, String city, double salary) {
        this.name = name;
        this.city = city;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
