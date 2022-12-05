package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    private double result(int salary, int rate) {
        double result = salary - salary * 1.0 * rate / 100;
        return result;
    }
    public void calculateSalary(int salary) {
        if (salary < 0) {
            System.out.println("wrong input!");
        } else if (salary <= 10000) {
            System.out.println(this.result(salary, 15));
        } else if (salary > 10000 && salary <= 20000) {
            System.out.println(this.result(salary, 18));
        } else if (salary > 20000) {
            System.out.println(this.result(salary, 20));
        }
    }
}
