

//Write a method which retruns the value of passed key from a search string of the
//form "http://www.google.com?name=johny&age=20&hobby=cricket"

String query = "http://www.google.com?name=johny&age=20&hobby=cricket"
List queries = query.tokenize("?")
List queries2 = queries[1].tokenize("&")
Map map = [:]

int len = queries2.size()
for(int i=0;i<len;i++)
      {
            map.put(queries2[i].tokenize("=")[0], queries2[i].tokenize("=")[1])
       }
println(map.values())


