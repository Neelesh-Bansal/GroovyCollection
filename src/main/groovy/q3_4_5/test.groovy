package q3_4_5


//Q3//
//Given two lists [11, 12, 13, 14] and [13, 14, 15],
//        how would we obtain the list of items from the first that are not in the second?


//List list1 = [11, 12, 13, 14]
//List list2 = [13, 14, 15]

//list1.removeAll(list2)//method 1
//println list1

//println list1-list2 // method2


//Q4//
//Find whether two lists have a common element or not

//List list3 = [11 ,12 ,14,15]
//List list4 = [13, 14, 15]
//println(list3.intersect(list4))


//Q5//
//Remove all records from a list whose index is odd
List list5 = [0,1,2,3,4,5,6,7,8,9]
list5.removeAll{ it%2!=0}
println list5


