public class Main {

    public static void printSeparator() {
        System.out.println("===========================================================");
    }

    public static void printAllEmployeeRegister(Employee[] employeeRegister) {
        System.out.println("Полный список сотрудников: ");
        int i = 0;
        for (i = 0; i < employeeRegister.length; i++) {
            System.out.println(employeeRegister[i]);
        }
    }

    public static int countSalaryAndAverageSumma(Employee[] employeeRegister) {
        int salarySumma = 0;
        int averageSalary = 0;
        for (int i = 0; i < employeeRegister.length; i++) {
            salarySumma += employeeRegister[i].getSalary();
            averageSalary = salarySumma / employeeRegister.length;
        }
        System.out.println("Сумма затрат на зарплату в месяц: " + salarySumma);
        System.out.println("Средний размер зарплаты за месяц: " + averageSalary);
    return  salarySumma;
    }


    public static int countSalaryMin(Employee[] employeeRegister) {
        int salaryMin = 1_000_000;
        String employeeMin = "";
        for (int i = 0; i < employeeRegister.length; i++) {
            if (salaryMin > employeeRegister[i].getSalary()) {
                salaryMin = employeeRegister[i].getSalary();
                employeeMin = employeeRegister[i].getEmployee();
            }
        }
        System.out.println("Сотрудник " + employeeMin + " получает минимальную " +
                "зарплату в размере " + salaryMin + " рублей.");
        return salaryMin;
    }

    public static int countSalaryMax(Employee[] employeeRegister) {
        int salaryMax = 0;
        String employeeMax = "";
        for (int i = 0; i < employeeRegister.length; i++) {
            if (salaryMax < employeeRegister[i].getSalary()) {
                salaryMax = employeeRegister[i].getSalary();
                employeeMax = employeeRegister[i].getEmployee();
            }
        }
        System.out.println("Сотрудник " + employeeMax + " получает самую высокую зарплату" +
                " в размере " + salaryMax + " рублей.");
        return salaryMax;
    }

    public static void printFullNameEmployees(Employee[] employeeRegister) {
        System.out.println("Ф.И.О. сотрудников:");
        for (int i = 0; i < employeeRegister.length; i++) {
            System.out.println(employeeRegister[i].getEmployee());
        }
    }


    public static void main(String[] args) {
        Employee[] employeeRegister = new Employee[10];

        Employee employee1 = new Employee("Иванов Иван Иванович", 1, 30_000);
        Employee employee2 = new Employee("Иванова Инна Ильинична", 2, 28_000);
        Employee employee3 = new Employee("Петров Петр Петрович", 3, 46_000);
        Employee employee4 = new Employee("Васильев Василий Васильевич", 4, 59_000);
        Employee employee5 = new Employee("Сидоров Сергей Сергеевич", 5, 80_000);
        Employee employee6 = new Employee("Сидорова Снежана Саидовна", 1, 37_000);
        Employee employee7 = new Employee("Петрова Полина Петровна", 2, 46_500);
        Employee employee8 = new Employee("Белов Борис Борисович", 3, 57_200);
        Employee employee9 = new Employee("Аистова Анна Антоновна", 4, 76_000);
        Employee employee10 = new Employee("Поляков Павел Павлович", 5, 62_000);

        employeeRegister[0] = employee1;
        employeeRegister[1] = employee2;
        employeeRegister[2] = employee3;
        employeeRegister[3] = employee4;
        employeeRegister[4] = employee5;
        employeeRegister[5] = employee6;
        employeeRegister[6] = employee7;
        employeeRegister[7] = employee8;
        employeeRegister[8] = employee9;
        employeeRegister[9] = employee10;

        printSeparator();
        printAllEmployeeRegister(employeeRegister);
        printSeparator();

        countSalaryAndAverageSumma(employeeRegister);
        printSeparator();

        countSalaryMin(employeeRegister);
        printSeparator();

        countSalaryMax(employeeRegister);
        printSeparator();

        printFullNameEmployees(employeeRegister);
        printSeparator();
    }



}