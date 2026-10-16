class Employee {
    String name;
    int salary;
    static int count = 0;

    Employee() {
        this("Rahul", 20000);
    }

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        count++;
    }

    void show() {
        System.out.println(name + " " + salary);
    }

    static void total() {
        System.out.println("Employees: " + count);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Aman", 30000);

        e1.show();
        e2.show();
        total();
    }
}
