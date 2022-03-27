            Generalization
- Type/Subtype Relationship
- "IS A " Relationship
- One class has many subclasses
- General class can have many Special classes as 
   subclasses
- General names can be used to Address special names
- Top to bottom hierarchy goes towards specialization
- Bottom to top Hierarchy goes towards generalization


e.g         Soap  
  Bath Soap and Washing Soap is a subclass of Soap
 see UML Diagram on board

e.g COldDrink
  Pepsi      Team

- Cold Drink is a general class
- Pepsi and team are special classes

e.g    Person

Teacher       Student
 see UML Diagram on board
e.g            Car
    Sedan           Hatchback
Honda   Suzuki     Suzuki   Toyota
civic    Liana      Alto      vitz
 see UML Diagram on board
....................................................\
Some Examples from Nature

e.g.               Animal
           Mammals            Reptiles 

  Human           Cow	     Snake         Croc

Student Teacher             Cobra Python    

 see UML Diagram on board
e.g                     Fruits
     Mango       Orange       Banana     Strawberry

 see UML Diagram on board
..................................................
Some Examples from Kitchen


e.g            Cutlery
     fork                Spoon     Knife
.................................................

Some Examples from Library

e.g  
                    Book
      Social Science            Natural Science


.................................................
Some Examples from Computer Lab

e.g                     Computer
       Desktop                         Laptop
   Compaq                                HP


e.g                    Printer
        Laser     Inkjet          DotMatrix

....................................................

Some Examples from Car Parking

e.g               vehicle

   Car          bike        Van      Truck

...............................................
 Types Of Generalization

1- Inheritance
2- Realization

................................................

Example

                   person 

    faculty                        Student




class Person {


}


class Faculty extends Person{


}


class Students extends Person{


}
class Resturent{

void booking(Person p){

}
}

class Test{

public static void main(String o[]){
Student st=new Student();
Faculty ft=new Faculty();
......
r.booking(st);
r.booking(ft);

}
}





         








































