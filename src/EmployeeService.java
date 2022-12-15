
public class EmployeeService {

    // Вывод сотрудников
    public static void listEmployee(Employee[]employees) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
    public static double sumSalaryMonth(Employee[]employees) {// общая сумма
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    public static double minSalary(Employee[]employees) { // минимальная сумма
        double minSalary = maxSalary(employees);
        for (Employee employee : employees) {
            if (employee != null) {
                if (minSalary > employee.getSalary()) {
                    minSalary = employee.getSalary();
                }
            }
        }
        return minSalary;
    }
    public static double maxSalary(Employee[]employees) {// масимальная сумма
        double maxSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                if (maxSalary < employee.getSalary()) {
                    maxSalary = employee.getSalary();
                }
            }
        }
        return maxSalary;
    }

    public static double averageSalary(Employee[]employees) {// средняя сумма
        double averageSalary = 0;
        double sum = sumSalaryMonth(employees);
        for (Employee employee : employees) {
            if (employee != null) {
                averageSalary = sum / employees.length;
                break;
            }
        }
        return averageSalary;
    }

    public static void fio(Employee[]employees) {// Фио сотрудников
        for (Employee employee : employees) {
            if (employee!=null){
                System.out.println("ФИО сотрудника: " + employee.getName() +" " + employee.getSurname()+ " " + employee.getPatronymic());
            }
        }
    }

}
