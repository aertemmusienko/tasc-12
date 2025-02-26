class Employee {
    private String name;
    private double salary;
    private String department;
    private String position; // Додаємо поле для типу працівника (менеджер, інженер тощо)

    public Employee(String name, double salary, String department, String position) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Працівник: " + name + " | Посада: " + position + " | Відділ: " + department + " | Зарплата: " + salary;
    }
}
