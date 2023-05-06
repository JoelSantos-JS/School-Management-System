package entities;

public class Teacher {
    private int id;
    private String name;
    private int salary;


    public Teacher() {

    }

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    

    @Override
    public String toString() {
        return "+\n" + " Teacher [ \n" + "id=" + id + "\n" + ", name=" + name + "\n" +", salary="  + salary + "]";
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    
}
