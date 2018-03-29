
//Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz”
//instead of the number and for the multiples of five print “Buzz”.
//For numbers which are multiples of both three and five print "FizzBuzz".

100.times {
    print(it+1+" ")
}

100.times {
    if((it+1)%3==0) {

        if ((it + 1) % 5 == 0) {
            println("FizzBuzz")
        }
        else {
            println("Fizz")
        }
    }
    else{
        if((it+1)%5==0)
            println("Buzz")
        else
            println(it+1)
    }
}