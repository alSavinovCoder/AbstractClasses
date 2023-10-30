public class TopManager implements Employee{
    private final int minimumIncome = 100_000;//местной валюты
    private final int maximumIncome = 300_000;//местной валюты
    private final int baseSalary = (int) (minimumIncome + Math.random() * maximumIncome);//местной валюты
    private final double interestRate = 1.5d;//бонус который получит работник если компания заработает более 10млн
    private final double bonusSalary = baseSalary * interestRate;//местной валюты
    Company company = new Company();
    @Override
    public double getMonthSalary() {
        if (company.getIncome() <= 10_000_000) {
            return baseSalary;
        } else {
            return baseSalary + (int) bonusSalary;
        }

    }

}
