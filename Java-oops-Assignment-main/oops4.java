4)

1.If any class has any of its abstract then you must declare entire as abstract.

YES IF  ANY CLASS HAS ANY OF ITS METHOD ABSTRACT THEN WE MUST DECLARE ENTIRE CLASS AS ABSTRACT

EXAMPLE:


public  class Practice
   {                                           //it must be abstract class//

    abstract void();                           //abstarct mehod//
        {

        }

    }
}

*in above program ,when we run the program it shows compile time error ,because we are not declaring class Practicebstract as abstract


2.Abstract class cannot be instantiated.

An abstract class is a class which doesnt have an implementation for one or more methods. It means that the jvm doesnt have any direction of what to do in case if someone calls the method which is abstract. So if you are able to create an object for the abstract class and call any abstract method of it the jvm will not be able to decide what to do and hence it my be crashed. So to avoid this situation we are restricted to instantiate a abstract class. If you need a object for that abstract class create a concrete subclass and create an object for it and use it.

EXAMPLE:


public abstract class ClassOne {

	public void printSomething()
	{
		System.out.println("Hello in abstract class");
	}
}
class CreateClassOne {

	public static void main(String[] args)
	{
		// instance of abstract
		// class "ClassOne"
		ClassOne obj = new ClassOne(); //abstarct class cant be instantiated so it throws error??
	}
}

ERROR :
------
prog.java:17: error: ClassOne is abstract; cannot be instantiated
        ClassOne obj = new ClassOne();
                       ^
1 error



3.When we extend an abstract class, we must either override all the abstract methods in sub class or declare sub class as abstract.

solution: when we extend an abstarct class ,we must override the all the super class methods in sub class or we must declare the sub class as abstarct  because an abstract class is class which does not have any implementations so we need provide implementation by over riding super class method  or we can declare subclass abstract and we have provide implememntation by using another sub classs

EXAMPLE:


import java.io.IOException;
abstract class abc {
   public abstract void display();
   public abstract void setName(String name);
   public abstract void setAge(int age);
}
public class AbstractClassExample extends abc 
   {                                                                            //NOT DECLARING THE SUB CLASS AS ABSTRACT SO IT SHOWS COMPILE TIME ERROR//
   public void display(){ 
      System.out.println("This is the subclass implementation of the display method ");
   }
   public static void main(String args[]) {
      new AbstractClassExample().display();
   }
}

SO To make this program to be work  either need to override all the abstract methods of the super-class or, make the subclass abstract as shown below −

SOLUTION:

abstract class abc 
  {
   public abstract void display();
   public abstract void setName(String name);
   public abstract void setAge(int age);
  }
public abstract class AbstractClassExample extends abc{
   public void display()
  {
      System.out.println("This is the subclass implementation of the displaymethod ");
   }
}


4.Abstract class cannot be private.
Private methods are private to the class only. They are not polymorphic in nature i.e. we cannot inherit them, so it makes no sense to make a private method abstract. Making a method abstract means we have to override and implement it in a subclass, but since we can’t override private methods, we can’t make them abstract either.

EXAMPLE:


abstract class Display {
   private abstract void display();
}
 
public class Main extends Display {
    void display() {
         System.out.println("Inside display method");
    }
   public static void main(String args[]) {
     System.out.println("Inside main class");
   }
}

IN ABOVE PROGRAM WE ARE MAKING ABSTRACT METHOD AS PRIVATE AND IT THROWS THE BELOW ERROR

Main.java:9: error: illegal combination of modifiers: abstract and private
   private abstract void display();
                         ^
Main.java:12: error: Main is not abstract and does not override abstract method display() in Display
public class Main extends Display {
       ^
2 errors



5.Abstract class cannot be final.

No, we cannot make an abstract class or method final in Java because the abstract and final are mutually exclusive concepts. An abstract class is incomplete and can only be instantiated by extending a concrete class and implementing all abstract methods, while a final class is considered complete and cannot be extended further. This means when you make an abstract class final, it cannot be extended hence it cannot be used and that's why the Java compiler throws a compile-time error when you try to make an abstract class final in Java. In short, an abstract class cannot be final in Java, using both abstract and final modifiers with a class is illegal in Java. 

EXAMPLE:

abstract final class ImAnAbstractClass{

}

Error: "The class ImAnAbstractClass can be either abstract or final, not both"



6.You can declare a class abstract without having any abstract method.
yes, you can . Once you declare a class abstract it indicates that the class is incomplete and, you cannot instantiate it.

EXAMPLE:


abstract class abc 
   {
     public void display() 
      {                                                                                 //non abstarct method with abstract clas//
      System.out.println("This is a method of abstract class");
       }
    }
public class AbstractClass extends abc
  {
    public static void main(String args[]) 
    {
      new AbstractClass().display();
     }
  }

OUTPUT:

This is a method of abstract class


