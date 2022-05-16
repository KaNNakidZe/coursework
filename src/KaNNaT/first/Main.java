package KaNNaT.first;

public class Main {

    // - ** Базовая сложность **
// 1. Создать класс Employee, который содержит информацию о Ф.И.О., отделе и зарплате сотрудника. Отделы для простоты должны быть названы от 1 до 5.
// 2. Добавить статическую переменную-счетчик, которая будет отвечать за id.
// 3. Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
// 4. Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
// 5. Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
// 6. По умолчанию все поля должны передавать через конструктор (кроме id) и заполняться в нем (включая id, который нужно получить из счетчика).
// 7. Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.
// 8. Создать статические методы, которые будут взаимодействовать с массивом и предоставлять результат:
      // 1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
      // 2. Посчитать сумму затрат на зарплаты в месяц.
      // 3. Найти сотрудника с минимальной зарплатой.
      // 4. Найти сотрудника с максимальной зарплатой.
      // 5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
      // 6. Получить Ф. И. О. всех сотрудников (вывести в консоль).

// 1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).

    public static void typeAllWorker(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
// 2. Посчитать сумму затрат на зарплаты в месяц.

    public static int ollWokerSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalaryWorker();
        }
        System.out.println("Сумма затрат на зарплату сотрудников за месяц составляет: " + sum + " руб.");
        return sum;
    }

// 3. Найти сотрудника с минимальной зарплатой.

    public static void minSalaryWorker(Employee[] employees){
        Employee minSalaryEmployee = employees[0];
        for (Employee e : employees) {
            if(e.getSalaryWorker() < minSalaryEmployee.getSalaryWorker()){
                minSalaryEmployee = e;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: "
                + minSalaryEmployee.getSalaryWorker() + " руб. "
                + minSalaryEmployee.getSurnameName()
                + minSalaryEmployee.getFirstName()
                + minSalaryEmployee.getSecondName());
    }

// 4. Найти сотрудника с максимальной зарплатой.

    public static void maxSalaryWorker(Employee[] employees) {
        Employee maxSalaryEmployee = employees[0];
        for (Employee d : employees) {
            if (d.getSalaryWorker() > maxSalaryEmployee.getSalaryWorker()) {
                maxSalaryEmployee = d;
            }
        }
        System.out.println("Сотрубник с максимальной зарплатой: "
                + maxSalaryEmployee.getSalaryWorker() + " руб. "
                + maxSalaryEmployee.getSurnameName()
                + maxSalaryEmployee.getFirstName()
                + maxSalaryEmployee.getSecondName());

    }

// 5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).

    public static void averageWokerSalary(Employee[] employees) {
        int sum = ollWokerSalary(employees);
        int averageSum = sum / employees.length;
        System.out.println("Средняя заработная плата составялет " + averageSum + " руб.");

    }

// 6. Получить Ф. И. О. всех сотрудников (вывести в консоль).

    public static void dataOllWoker(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println("Ф. И. О. сотрудника: "
                    + employee.getSurnameName()
                    + employee.getFirstName()
                    + employee.getSecondName());
        }
    }



    public static void main(String[] args) {

        Employee [] employee =new Employee[10];
        employee[0] = new Employee("Григорий ", "Петрович", "Костин ", 30000, 5);
        employee[1] = new Employee("Вячеслав ", "Игоревич", "Соенов ", 32000, 4);
        employee[2] = new Employee("Никита ", "Олегович", "Козвонин ", 34000, 3);
        employee[3] = new Employee("Валерий ", "Владимирович", "Шумкин ", 36000, 2);
        employee[4] = new Employee("Александр ", "Васильевич", "Ермолаев ", 40000, 1);
        employee[5] = new Employee("Адель ", "Ярулович", "Бетрединов ", 39000, 5);
        employee[6] = new Employee("Владимир ", "Леонидович", "Гоман ", 37000, 4);
        employee[7] = new Employee("Алексей ", "Александрович", "Абрамов ", 35000, 3);
        employee[8] = new Employee("Николай ", "Борисович", "Бодров ", 33000, 2);
        employee[9] = new Employee("Юрий ", "Валентинович", "Акулов ", 31000, 1);

// 1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).

        typeAllWorker(employee);

// 2. Посчитать сумму затрат на зарплаты в месяц.

        ollWokerSalary(employee);

// 3. Найти сотрудника с минимальной зарплатой.

        minSalaryWorker(employee);

// 4. Найти сотрудника с максимальной зарплатой.

        maxSalaryWorker(employee);

// 5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).

        averageWokerSalary(employee);

// 6. Получить Ф. И. О. всех сотрудников (вывести в консоль).

        dataOllWoker(employee);


    }
}
