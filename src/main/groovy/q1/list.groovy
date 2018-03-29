package q1


// Initialize an empty list and give the output of the following code:
//
//        l[11] = "myelement"
//println l[11]
//println l.get(5)
//println l
//Initialize a list using a range and find all elements which are even.


List list=[]

list[11]="myelement"  //size 12 at this point
println list[11]
println list.get(5)
println list

List list2=1..10
println list2

list2.size().times{
    if(list2[it]%2==0)
        println list2[it]

}


