

//We have a sorted list of alphabets a-z, print all alphabets appearing after j

List list = 'a'..'z'
println(list)

list.findAll{
    if(it>='j')
        println(it)
}
