public class Operator implements Employee{
    private final int minimumIncome = 20_000;//местной валюты
    private final int maximumIncome = 40_000;//местной валюты
    private final int baseSalary = (int) (minimumIncome + Math.random() * maximumIncome);//местной валюты
    @Override
    public double getMonthSalary() {
        return baseSalary;
    }
}
