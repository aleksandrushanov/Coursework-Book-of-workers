public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Михаил", "Терешков", "Евгеньевич", 1, 27800);
        employees[1] = new Employee("Александр","Козлов","Викторович",2,32800);
        employees[2] = new Employee("Максим","Шаповалов","Алексеевич",3,54200);
        employees[3] = new Employee("Андрей","Ионов","Викторович",4,31400);
        employees[4] = new Employee("Маргарита","Панихина","Валерьевна",5,40000);
        employees[5] = new Employee("Анна","Капачинских","Анатольевна",1,29000);
        employees[6] = new Employee("Инна","Крекнова","Николавена",3,40200);
        employees[7] = new Employee("Елена","Гребеньщикова","Викторовна",4,49000);
        employees[9] = new Employee("Александр","Ушанов","Евгеньевич",5,38000);

        EmployeeService.listEmployee(employees);
        System.out.println("Сумма затрат за месяц " + EmployeeService.sumSalaryMonth(employees) + " рублей" );
        System.out.println("Минимальная зарплата "  + EmployeeService.minSalary(employees) + " рублей ");
        System.out.println("Масимальная зарплата " + EmployeeService.maxSalary(employees) + " рублей");
        System.out.println("Средняя зарплата " + EmployeeService.averageSalary(employees) + " рублей ");
        EmployeeService.fio(employees);
    }
}

