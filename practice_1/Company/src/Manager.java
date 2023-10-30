public class  Manager implements Employee{
    private final int baseSalary = 50_000; //местной валюты
    private final int minimumIncome = 115_000;//местной валюты
    private final int maximumIncome = 140_000;//местной валюты
    private final double interestRate = 0.05d;//процент от принесённого дохода, который получает работник
    private final double amountOfMoneyForCompany = minimumIncome + Math.random() * maximumIncome;//местной валюты
    private final double bonusIncome = interestRate * amountOfMoneyForCompany;//местной валюты
    private final double finalSalary = baseSalary + bonusIncome;//местной валюты
    @Override
    public double getMonthSalary() {
        return finalSalary;
    }
    public double getAmountOfMoneyForCompany() {
        return amountOfMoneyForCompany;
    }

}
