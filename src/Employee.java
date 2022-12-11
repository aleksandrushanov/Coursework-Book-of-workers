import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private String patronymic;
    private int department;
    private double salary;
    private static int counter = 1;
    private int id;



    public Employee(String name, String surname,String patronymic,int department,int salary) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = counter;
        counter++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }


    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getCounter() {
        return counter;
    }
    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Фио сотрудника: "
                 + name + " " + surname+ " " + patronymic +
                ", Отдел=" + department +
                ", Зарплата=" + salary + " Рублей " +
                ", Id" + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

