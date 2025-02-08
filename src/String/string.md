String ?   Sequence of characters
its a non -primitive data type
String is also a class
Character Array

strings are immutable --- cannot change.

two ways to String
1. String literal
2. String by new keyword

//Important for Interview


String s1 ="Pragra"
String s2 ="Pragra"
String s3 ="Pragra"
String s4 ="Pragra"
String s5 ="Pragra"
String s6 ="Pragra"

like s1-s6 all are in stack and "Pragra" goes to heap. All the s1-s6 refrence to same "Pragra" object as heap create 
"String Constant Pool- SCP" means if same string i.e "Pragra" happen multiple times in heap then it create SCP and all
variables s1-s6 are refrenced to same object "Pragra"

s2= "Microsoft"

if we change s2 to "Microsoft", its just disrefrenced the first one "Pragra" and refrenced to new one "Microsoft"
cause it is immutable.

s10= "Microsoft"
it also refrence to same "Microsoft" as refrence by s2 due to SCP.