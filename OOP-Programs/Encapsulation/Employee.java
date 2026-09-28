class Employee {
    private double salary;

    public void setSalary(double s) {
        if (s >= 0)
            salary = s;
        else
            System.out.println("Invalid salary");
    }

    public double getSalary() { return salary; }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setSalary(45000);
        System.out.println("Salary: " + e.getSalary());
        e.setSalary(-100);
        System.out.println("After invalid: " + e.getSalary());
    }
}
