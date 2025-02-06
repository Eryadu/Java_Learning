
## The simplest real-life example of a static variable is supposed to have a class named Student 
that represents the details of any student who took admission to the school.
Now we have to count how many students were admitted to the school.
In this case, the concept of static variables in Java can be used. 
We simply create a static variable named count_student inside the Student class.
Increment the value of count_student inside the constructor for Student class. 
As a result, whenever we create a new instance of Student class, count_student will automatically increase by 1.
In this way, we can count the number of new students admitted to the school.


// Static variable 
//https://www.scaler.com/topics/java/static-variable-in-java/


//Why can't we use 'this' and 'static' together? 'this' keyword is only applicable where an instance of an object is created. 
Static method has no instance created because static method belongs to the class.

//A static variable is associated with a class rather than an instance. A static field is declared using the static keyword. 
  Static variables are shared across all instances of a class.

//There is only one copy of a static variable per class. Non-static variables cannot be called inside static methods.

//If any class instance modifies a static variable's value, the change is reflected across all class instances. 
  Static variables in Java are memory-efficient as they are not duplicated for each instance.

// Example 
class ABC {

static int number; // Valid declaration

void hello() {
static int number1; // Invalid declaration
}

public static void main(String[] args) {
static String name; // Illegal modifier
}
}   

Explanation:

In Java, static variables can be declared like class members, like static int number, 
which is a valid declaration of the static variable. However, static variables cannot be declared inside any method scope.
The compiler will show a syntax error if we try to declare static variables inside any method.
In the above example, if we try to declare a static variable in the main() method, 
the compiler will show an' illegal modifier' syntax error.