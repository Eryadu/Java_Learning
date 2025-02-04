
## The simplest real-life example of a static variable is supposed to have a class named Student 
that represents the details of any student who took admission to the school.
Now we have to count how many students were admitted to the school.
In this case, the concept of static variables in Java can be used. 
We simply create a static variable named count_student inside the Student class.
Increment the value of count_student inside the constructor for Student class. 
As a result, whenever we create a new instance of Student class, count_student will automatically increase by 1.
In this way, we can count the number of new students admitted to the school.


// Static variable 
// https://www.scaler.com/topics/challenge/279501/static-variable-in-java/?mode=read


//Why can't we use 'this' and 'static' together? 'this' keyword is only applicable where an instance of an object is created. 
Static method has no instance created because static method belongs to the class.