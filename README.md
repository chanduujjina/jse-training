# jse-training
Oops started
con


what is factor

PrimeNumber : A number having factor count is  exactly 2

1 - its not a prime
2(1,2)- Its a prime
3(1,3)- - Its a prime
4(1,2,4) - not a prime
5(1,5) -its a prime

Object is super class for all custom objects
Operators:
For loop,Switch block

5/10/2021:
-------------------
Object methods in java

1.HashCode
2.Equals
3.toString
5.wait(2 methods)
6.notify(3 methods)
7.getClass

what is the use of hashCode and equals:
-------------------------------------
1.To avoid the duplicate data in the object for that you need to override the hash code and equals method in your pojo class
POJO-->Plain old java object

when we can call a class as a pojo class:
----------------------------------------
A class which is not extend or implements any other class that class we can call it as pojo class.


what is the need of toString:
---------------------------


In C language you have pass by value and pass by reference

but in java we don't have pass by reference we have only pass by value

Method:
------

two types of methods:
1.Method with return type
2.Void method(method with out return type)

OOPs(Object Oriented Programing)

Has a relationShip
is a relationship

1.Inheritance
2.Polymorphism
3.Encapsulation

primitive
Wraper



int(0) -->Integer(null)
String(null)-->String(null)
long(0)->Long(null)
double(0) -->Double(null)
decimal-->Decimal

What is inheritance?
Aquaring properties/behaviour from parent class to child class

Base Class to Derivied class
Super class to subclass

Anu:
---------

ATT
Verizon

Base class Name : Carrier

ATT
---------

private String carrierName;;
private String carrierId;

private String planType;

private String planDetails

private String attCrrierCenter;
private String attNetworkInfo


Verizon Data:

private String carrierName;;
private String carrierId; 

private String planType;

private String planDetails

private String verizonCrrierCenter;
private String verizonNetworkInfo

Akshara also involving in   discussion

1.How to call parent class constructor from child class ?
2.How to call a constructor from another constructor of current class ?

how to access variables and methods of parent class from subclass

How to call a method from another method

Inheritance rules:
Child can inherit parent propeties and behaviours
Parent cannot inherit child properties




Is java will support multiple inheritance


C extends A  m1(),String name="test"
C extends B  m1() String name ="test"






Debugging short cuts
F6 -->Cursor will Go to the next line

F5-->Inside method

F8 -->will go to next debug point


To inspect or see the value of current varible 


ctr+shift+i

Rules of  inheritance:
--------------------------
Child can inherit properties or behaviour from  parent  class

Parent  is not  supposed to  inherit  child data
With Super class reference you can  hold sub class object when the  two objects having is a relationship


Child child = new Child();

Parent1 parent1 = new Child(); 

what is a final keyword in java?

how  a class can  inherit other class?

Use extends key word(Needs to extend parent from child)

c1 ,c2 ->p1(possible scenarios)-->Single level inheritance

c1->p1
c1->p2

Multiple inheritance

Is Java will support multiple inheritance?
if no why its not supporting
public clss parent1 {

public void m1(){
}
}

public clss parent2 {

public void m1(){
}
}

public child extends Parent1,Parent2{

   public void  m2(){
     m1();
   }
}

PolyMorphism:
-------------

Appearing a functionality in diffrent forms.

Types of PolyMorphism:
------------------

CompileTime PolyMorphism(Method overloading)

Runtime PolyMorphism(Method overriding)


Method overloading:
-----------------
1.you can overload a method inside a class only
2.Method name should be same but there might be a diffrence as below

.Diffrence in arguement list(parameters)
.diffrence in data types for arguements/return type

Method overriding:
-----------------
It deals with inheritance

Encapsulation:
Abstract class
_-------------------


Abstract class:
-----------

an abstract class can have atleast one abstract method and may have one more concrete methods is called abstract class

how we can declare abstract class:
-----------------------------

public abstract class Test{

}

what is an abstract method:
----------------------
a method which is having definition but don't have body is called abstract method

how we can declare a abstract method

abstract void m1();

what is an concrete method;
-------------------------
A method which is having a body is called concrete method

public void m1(){
}

Abstract class Assignment:
-------------------------

Organization
 
 IT,

 Admin,
 
 
 public Abstarct class Organization{
  public String getOrganizationDetails(){
     return "Infosys STP Hyderabad";
  }
  
  abstarct String getTeamDetails();
 
 }

------------------------------

public Abstarct class College {
   public String getCollegeDetails(){
   }
   
   abstarct String getBrachDetails();
}

ECE,IT,CSE
soon will complete assignment2 and will rise PR


Tools:
GIT,Maven

Code  governanace tools:
Sonar,JUNit,refacroring procudure


Logging:
---------

Log4j,
Audting:
-----------Spring AOP


Interface:
----------

what is an interface?

Interface is class which has only abstract methods

To inherit interface to class we can use implements keyword

How to achieve 100% abstraction ?
Using interface


what is cloning ?
cloning is nothing but copying object

Two types of cloning:
1.Shallow cloning(both refrences pointing to the same object data)
2.Deep cloning(maintaining diffrent copies)

what is a marker interface?
An interface don't have any abstarct methods resides in it is called as marker interface.

what is use of marker interface?
Marker interface will give Object information



what are the marker interfaces in java.lang package ?
1.Cloneable interface
2.Serilizable interface
3.Remote interface

What is Serilization ?
Object data needs to serilized(converting into byte code) when sending out of JVM is called Serilization

what is final keyword in java?

final keyword we can apply at below places
1.Class level
if the class declared as final
a).Cannot inherit that class
b).Cannot re-intialize the same 
2.Variable level
a)Cannot re-intialize that
3.Method level
cannot override that method

What is Immutable class?
How to create Custom immutable class

1.Your class should be final
2.Every variable in a class must be final
3.You should have public constructor
4.Needs to create getters and don't have setters



04Jun:
String Handlers:

Why String is immutable class?
What is String pool

How to copy data from heap area to pool area

String Buffer and String Builder:


Name id age salary,gender,dept

Fetch all employees
select * from employee

select * from employee where id =?

select * from employee where age>? and salary ?

select * from employee where gender ='Female'

Chandu@129

1.Password must be strong means 8 digit or more
2.it contains numeric and atleast one capital and special character

Anu:
Validate Student object
student_Id
student_Name
gender
sSn
Akshra Assign
sample_Id
sample_Name
lab_Name
diagnosisCode

what is serilization?

it is a process of converting java object to byte code
what is the need of serilization ?
when your sending data out of jvm that needs to serilized

what is marker interface ?
an interface don't have any methods is called marker interface

it will provide oject information


which  interface are marker interface in java.lang package?

1.Cloneable interface
2.Serilizable interface
3.Remote interface
io streams means input output streams 










