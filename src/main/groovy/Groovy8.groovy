

//Consider a class Employee with following details * Name * Age * Salary
// Create a list consisting of 10 Employee objects.
//
//        Get a list of employees who earn less than 5000
//Get the name of the youngest employee and oldest employee
//Get the employee with maximum salary
//Get the list of names of all the employees

class Employee{
    String name
    int age
    int salary


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}


Employee employee1 = new Employee(name: "AB", age:21 , salary:4000 )
Employee employee2 = new Employee(name: "BC", age:22, salary:4500 )
Employee employee3 = new Employee(name: "CD", age:19, salary:5500 )
Employee employee4 = new Employee(name: "DE", age:19, salary:7000 )
Employee employee5 = new Employee(name: "EF", age:24, salary:5000 )
Employee employee6 = new Employee(name: "FG", age:23, salary:3800 )
Employee employee7 = new Employee(name: "GH", age:22 , salary:5500 )
Employee employee8 = new Employee(name: "HI", age:20, salary:5200 )
Employee employee9 = new Employee(name: "IJ", age:21, salary:6700 )
Employee employee10 = new Employee(name: "JK", age:23 , salary:9800 )

List<Employee> employeeList = [employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8, employee9,employee10]


println employeeList.groupBy {it.salary<5000}.get(true)*.name

int youngest = employeeList.age.min()
int oldest = employeeList.age.max()

int max=employeeList.salary.max()

employeeList.each {
    if(it.age == youngest)
        println("Youngest: "+it.name)
    if(it.age == oldest)
        println("Oldest: "+it.name)
    if(it.salary == max)
        println("Max salary: "+it.name)
}

println(employeeList)











