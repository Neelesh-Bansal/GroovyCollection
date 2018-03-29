

//Consider the following piece of code: String s = "this string needs to be split"
//
//println s.tokenize(" ")
//println s.tokenize()
//
//Compare this with the following code:
//
//        String s = "this string needs to be split"
//println s.split(" ")
//println s.split(/\s/) (Try Same Parameter with tokenize)
//
//Also try the following exercise:
//
//String s = "are.you.trying.to.split.me.mister?"
//s.tokenize(".") s.split(".")

String s = "this string needs to be split"
println s.tokenize(" ")
println s.tokenize()

String s1 = "this string needs to be split"
println s1.split(" ")
println s1.split(/\s/)

String s2 = "are.you.trying.to.split.me.mister?"
println(s2.split("."))
println(s2.tokenize(".") )



