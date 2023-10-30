import java.util.ArrayList;
import java.util.Collection;

public class Company {
    private int totalIncome = 0;
    private ArrayList<Employee> listOfEmployees = new ArrayList<>();
    ArrayList<Integer> lowestSalaryStaff = new ArrayList<Integer>();
    ArrayList<Integer> topSalaryStaff = new ArrayList<Integer>();
    public void hire (Employee employee) { //без проверки есть ли этот сотрудник в штате
        listOfEmployees.add(employee);
    }
    public void hireAll (Collection<Employee> employes) { //без проверки есть ли эти  сотрудники в штате
        listOfEmployees.addAll(employes);
    }
    public void fire (Employee employee) {
        listOfEmployees.remove(employee);
    }
    public int getIncome() {
        for (Employee employee : listOfEmployees) {
            if (employee instanceof Manager) {
                totalIncome += ((Manager) employee).getAmountOfMoneyForCompany();
            }
        }
        return totalIncome;
    }
    public ArrayList<Employee> getSortedListOfEmployees() { //добавлена сортировка пузырьком
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < listOfEmployees.size(); i++) {
                if (listOfEmployees.get(i).getMonthSalary() <
                        listOfEmployees.get(i - 1).getMonthSalary()) {
                    Employee temp = listOfEmployees.get(i);
                    listOfEmployees.set(i,listOfEmployees.get(i - 1));
                    listOfEmployees.set(i - 1, temp);
                    isSorted = false;
                }
            }
        }

        return listOfEmployees;
    }
    public ArrayList<Integer> getTopSalaryStaff (int count) {
        for (int i = listOfEmployees.size() - 1; topSalaryStaff.size() < count; i--) {
            topSalaryStaff.add((int) listOfEmployees.get(i).getMonthSalary());
        }
        return topSalaryStaff;
    }
    public ArrayList<Integer> getLowestSalaryStaff (int count) {
        for (int i = 0; i < count; i++) {
            lowestSalaryStaff.add((int) listOfEmployees.get(i).getMonthSalary());
        }
        return lowestSalaryStaff;
    }
}