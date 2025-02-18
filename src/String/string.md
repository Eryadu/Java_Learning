
// java8 string documentation ---- to learn about string

String ?   Sequence of characters
its a non -primitive data type
String is also a class
Character Array

strings are immutable --- cannot change .

// Immutable means cannot change previous object as stored in memory just change the refrence in Heap.

// Two ways to create String
1. String literal
2. String by new keyword

//Important for Interview


String s1 ="Pragra"
String s2 ="Pragra"
String s3 ="Pragra"
String s4 ="Pragra"
String s5 ="Pragra"
String s6 ="Pragra"

 // Only in case of literal ------> like s1-s6 all are in "Stack" and "Pragra" goes to "Heap". All the s1-s6 reference to same "Pragra" object as "Heap" create 
"String Constant Pool- SCP" means if same string i.e "Pragra" happen multiple times in "Heap" then it create SCP and all
variables s1-s6 are referenced to same object "Pragra"

s2= "Microsoft"

if we change s2 to "Microsoft", its just dis-referenced the first one "Pragra" and referenced to new one "Microsoft"
because it is "Immutable".

s10= "Microsoft"
it also references to same "Microsoft" as reference by s2 due to SCP.

// In case of new Keyword -----> it create new object outside SCP. ?? all new keyword strings also create same SCP or only literal?


// == -------> check the reference
// .equals() ------> check the content


// Use equals() when comparing the contents of strings (as you would in your ticket price program).
// Use == only to check if two string references point to the same object.
// when input given to string by literal methode, then it create object in same content pool, at that time == use to compare
// e.g String day1 = "Monday" -----literal methode
//     String day2 = "Tuesday" ---- literal methode ---- objects create in same memory pool.
// when input given to string using scanner or new keywords then objects create in different memory pool,
// then we use equal() instead of == to compare contents of string.

//Mutable string

1. StringBuffer -- it is thread safe. e.g if you are on driver seat only you can control car no one other. Sam in java
---- no other process change the object at the same time. iT lit slow cause one thread at onetime.
2. StringBuilder -- it is not thread safe. BUt its faster cause multiple thread work at same time. like on laptop multiple
--- application run at same time.