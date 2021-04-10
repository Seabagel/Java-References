// extends: Dog copies everything inside Animal.
//          We can build upon the Animal and add more variables.
public class Dog extends Animal {
   // Whatever methods or variables with the same name in Animal, ie.makeSound(),
   // its value and code will be overidden.
   public String makeSound(){
      return "Woof!";
   }
}