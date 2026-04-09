class Employee {
    String name;
    int salary;

    void display() {
        System.out.println("Employee Name: " + name);
    }
}class Permanent extends Employee {
    void calculateSalary() {
        salary = 30000;
        System.out.println("Permanent Salary: " + salary);
    }
}class Contract extends Employee {
    void calculateSalary() {
        salary = 20000;
        System.out.println("Contract Salary: " + salary);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Permanent permanentEmployee = new Permanent();
        permanentEmployee.name = "Kowsikan";
        permanentEmployee.display();
        permanentEmployee.calculateSalary();
        System.out.println();
        Contract contractEmployee = new Contract();
        contractEmployee.name = "Arun";
        contractEmployee.display();
        contractEmployee.calculateSalary();
    }
} 