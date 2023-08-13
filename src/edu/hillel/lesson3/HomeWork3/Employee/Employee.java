package edu.hillel.lesson3.HomeWork3.Employee;

public class Employee {

    private String Name;
    private String Position;
    private String Email;
    private String PhoneNumber;
    private int Age;

    public Employee(String name, String position, String email, String phoneNumber, int age) {
        this.Name = name;
        this.Position = position;
        this.Email = email;
        this.PhoneNumber = phoneNumber;
        this.Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
