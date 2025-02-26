class Company {
    private Employee[] employees;
    private int count;

    public Company(int size) {
        employees = new Employee[size];
        count = 0;
    }

    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count++] = employee;
            System.out.println("Додано працівника: " + employee.getName());
        } else {
            System.out.println("Компанія досягла ліміту працівників.");
        }
    }

    public void removeEmployee(String name) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getName().equalsIgnoreCase(name)) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[count - 1] = null;
                count--;
                System.out.println("Працівника " + name + " видалено.");
                return;
            }
        }
        System.out.println("Працівника не знайдено.");
    }

    public double getTotalSalary() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += employees[i].getSalary();
        }
        return total;
    }

    public double getAverageSalary() {
        if (count == 0) {
            return 0;
        }
        return getTotalSalary() / count;
    }

    public void displayEmployees() {
        if (count == 0) {
            System.out.println("Компанія не має працівників.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(employees[i]);
            }
        }
    }
}
