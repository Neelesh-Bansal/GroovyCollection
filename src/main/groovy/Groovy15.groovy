

//Consider a class named "Stack" that holds a list of objects and has the following operations associated:
//
//POP - Pops the last element off the stack
//PUSH - Pushes an element on top of the stack
//TOP - Returns the element at the top of the list Implement the aforesaid class

List<Integer> list = []
Scanner scanner = new Scanner(System.in)
int ans
while (true) {
    println("1.for push\n 2.for pop\n 3.for top\n 4.Display all\n 5.for exit")
    ans = scanner.nextInt()
    if (ans == 1) {
        println("Enter item to push")
        int item = scanner.nextInt()
        list.push(item)
    } else if (ans == 2) {
        list.pop()
    } else if (ans == 3) {
        println(list.last())
    } else if (ans == 4) {
        println(list)
    } else
        break
}