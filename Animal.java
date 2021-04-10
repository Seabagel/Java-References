// import: adds a library;
import java.util.*; 
import java.math.*;

// public: Anyone can access this; 
// class: A blueprint for an object;
public class Animal { 
   // final: The variable's value cannot be changed
   public final String author = "Timothy"; 
   // private: Only available to members of the Animal class
   private String name; 
   // int: -2^31 to 2^31
   private int weight; 
   // boolean: true or valse
   private boolean hasOwner = false; 
   // byte: -128 to 127
   private byte age; 
   // long: -2^63 to 2^63
   private long uniqueID; 
   // Single character a to Z
   private char favoriteLetter; 
   // We can format decimal numbers with specific decimal places, using .nf, where n is a number
   // double: 64 bit decimal number
   private double speed; 
   // float: 32 bit decimal number
   private float height; 

   // protected: Only members of the same packagee can access this
   // static: This value belongs to this class, and it's shared with every instance.
   //         Works like a global variable for all members of the Animal class. 
   protected static int animalCount = 0; 
   
   static Scanner userInput = new Scanner(System.in);

   // Getter: 
   public String getName() {
      return this.name;
   }
   public long getUniqueID() {
      return this.uniqueID;
   }

   // Setter:
   public void setName(String name) {
      this.name = name;
   }
   public long setUniqueID() {
      long minNumber = 1;
      long maxNumber = 100;

      // (long): Type casting. Math.random() returns a double
      this.uniqueID = minNumber + (long) (Math.random() * ((maxNumber - minNumber) + 1));

      // Long.toString(): Converts a primitive data of type Long to String
      String stringNumber = Long.toString(this.uniqueID);
      
      // Integer.parseInt(): Converts a String into a primitive type of Integer
      int numberString = Integer.parseInt(stringNumber);

      System.out.println(this.name + "'s Unique ID: " + numberString);

      // return: Passes this.uniqueID's value when setUniqueID() is called
      return this.uniqueID;
   }
   public char setFavoriteLetter() {
      // Make a random integer from 0 to 127
      int randomNumber = (int) (Math.random() * 126) + 1;
      this.favoriteLetter = (char) randomNumber;
      // Prints out the value
      System.out.println(this.name + "'s Favorite Letter is " + this.favoriteLetter);
      // returns the value
      return this.favoriteLetter;
   }
   
   // Polymorpism: 
   // Even if you extend Dog from Animal, Dog.makeSound() will still execute the same way.
   public String makeSound(){
      return "Grrrr";
   }
   public static void speakAnimal(Animal x){
      System.out.println("Animal says.. " + x.makeSound());
   }

   // Constructor classes: executed everytime a new Animal object is created
   public Animal() {
      //super(); Animal is the "super-class" of other classes that extends AnimaL
      animalCount++;
      System.out.println("Number of animals: " + animalCount);
      
      // Ask the user for input
      System.out.print("Enter the name: \n");
      if (userInput.hasNextLine()) {
         // then, call setName() to change the new Animal's name
         this.setName(userInput.nextLine());
      }

      // Calls setUniqueID()
      setUniqueID();

      // Calls speakAnimal() and passes the whole object as a parameter
      speakAnimal(this);

      // Prints an empty line
      System.out.println("");
   }

   

   // void: this method returns no value
   public static void main(String[] args) {
      // Initiates two new objects
      Animal theAnimal = new Animal();
      Dog theDog = new Dog();
      
      // Make an array of Animal Objects
      Animal animalArray[] = new Animal[2];
      animalArray[0] = theAnimal;
      animalArray[1] = theDog;

      // Ternary Operator: (value1 > value2) ? output1 : output2
      int whichIsBigger = (theAnimal.getUniqueID() > theDog.getUniqueID()) ? 0 : 1;

      // printf: Formats the output string. %s is a placeholder for strings
      System.out.printf(animalArray[whichIsBigger].getName() + " says.. %s", animalArray[whichIsBigger].makeSound());
   }
}

