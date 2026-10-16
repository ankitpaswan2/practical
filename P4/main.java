

class Calculator {

    // Overloaded method: adds two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method: adds three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method: adds two double values
    double add(double a, double b) {
        return a + b;
    }
}

// Base class
class Employee {
    double calculatePay() {
        return 0.0;
    }
}

// Derived class 1
class FullTimeEmployee extends Employee {
    double calculatePay() {
        return 50000.0;
    }
}

// Derived class 2
class PartTimeEmployee extends Employee {
    double calculatePay() {
        return 20000.0;
    }
}

public class Main {
    public static void main(String[] args) {

        // Method Overloading
        Calculator calc = new Calculator();

        System.out.println("Sum of two integers: "
                           + calc.add(10, 20));

        System.out.println("Sum of three integers: "
                           + calc.add(10, 20, 30));

        System.out.println("Sum of two doubles: "
                           + calc.add(10.5, 20.5));

        // Method Overriding
        Employee emp;

        emp = new FullTimeEmployee();
        System.out.println("Full-time employee pay: "
                           + emp.calculatePay());

        emp = new PartTimeEmployee();
        System.out.println("Part-time employee pay: "
                           + emp.calculatePay());
    }
}

