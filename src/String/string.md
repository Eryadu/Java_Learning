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
it also reference to same "Microsoft" as refrence by s2 due to SCP.

// In case of new Keyword -----> it create new object outside SCP. ?? all new keyword strings also create same SCP or only literal?


// == -------> check the reference
// .equals() ------> check the content