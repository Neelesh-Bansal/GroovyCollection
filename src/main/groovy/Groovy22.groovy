
//Conside a class named "Employee" which has the following properties:
//        1) Name 2) Age 3) DepartmentName 4) EmployeeNumber 5) Salary Let's say that there's a list of 50 employees available.
//        Perform the following operations on the list of employees:
//
//        Group the employees on the basis of the bracket in which their salary falls. The ranges are 0-5000, 5001 and 10000, and so on.
//        Get a count of the number of employees in each department
//Get the list of employees whose age is between 18 and 35
//Group the employees according to the alphabet with which
//their first name starts and display the number of employees in each group whose age is greater than
//Group the employees according to their department.


class Employee2{
    String name
    int age
    String departmentName
    int empId
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

Employee2 employee1 = new Employee2(name: "AB", age:21 ,departmentName:"AA", salary:4000 )
Employee2 employee2 = new Employee2(name: "BC", age:22,departmentName:"AA", salary:4500 )
Employee2 employee3 = new Employee2(name: "CD", age:19,departmentName:"BB", salary:5500 )
Employee2 employee4 = new Employee2(name: "DE", age:40,departmentName:"BB", salary:12000 )
Employee2 employee5 = new Employee2(name: "EF", age:24, departmentName:"AA", salary:5002 )


List<Employee2> employeeList2 = [employee1, employee2, employee3, employee4, employee5]
println employeeList2.groupBy {
    it.salary<=5000}.get(true)*.name

//println(employeeList2.departmentName.unique().size())
Map<String,List> map = employeeList2.groupBy {
    it.departmentName
}
map.each {
    println it.key+" "
    println(it.getValue().size())
}

println employeeList2.groupBy {
    it.age>=18&&it.age<=35}.get(true)*.name

Map<String,List> map2 = employeeList2.groupBy {
    it.name.charAt(0)
}
println("----")
println(map2)



//Group the employees according to their department.
println(map)





