public class Employee {
    private int id;
    private String employee;
    private int department;
    private int salary;
    private static int idCount = 1;

    public Employee (String employee, int department, int salary) {
        this.id = idCount++;
        this.employee = employee;
        this.department = department;
        this.salary = salary;
    }

    public int getIdCount() {
        return this.idCount;
    }

    public String getEmployee() {
        return this.employee;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setDepartment() {
        this.department = department;
    }

    public void setSalary() {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " " + employee + ", отдел: " + department +
                ", зарплата: " + salary;
    }
}
