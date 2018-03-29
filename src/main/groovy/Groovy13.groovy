

//Find the number of occurences of a character in a string

String s= "hellojikaisanva"

int count=0
s.findAll{
    if(it=='a')
        count++
}
println(count)