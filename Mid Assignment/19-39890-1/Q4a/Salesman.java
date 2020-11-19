public class Salesman {
    private double salary;
    private int person;

    public Salesman(double salary,int person)
    {
        this.salary=salary;
        this.person=person;
    }

    public void setPerson(int person) {
        this.person = person;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getPerson() {
        return person;
    }
    public double getSalary() {
        return salary;
    }

    public double calculateSalesmansYearlySalary()
    {
        return (12*person*salary);// 1 year = 12month
    }

    public void showSalesmansYearlySalary()
    {
        System.out.println("Total Manager:"+person);
        System.out.println("Per Person Salary:"+salary);
        System.out.println("Monthly Salary:"+person*salary);
        System.out.println("Yearly  Salary:"+calculateSalesmansYearlySalary());
        System.out.println("-------------------------------------------");
    }
}
