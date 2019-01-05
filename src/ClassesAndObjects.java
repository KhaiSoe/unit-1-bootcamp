
public class ClassesAndObjects {


  public boolean isOlder (Cat cat1, Cat cat2) {
    if(cat1.getAge() > cat2.getAge()) {
      return true;
    }
    return false;
  }

  public static void makeBestFriends (Cat cat2, Cat cat3) {
    cat2.setFavoriteFood("flan");
    cat3.setFavoriteFood("flan");
  }

  public static String makeKitten (Cat cat1, Cat cat3) {
    Cat kitten = new Cat ();
    kitten.setName(cat1.getName() + cat3.getName());
    kitten.setAge(0);
    String catString = "a " + kitten.getClass().getSimpleName() + " name \" " + kitten.getName() + " with age " + kitten.getAge();
    return catString;
  }

  public static void adoption (Cat cat1, Person person1) {

    cat1.setOwner(person1);
    System.out.println(person1.getName() + " is now " + cat1.getName() + " owner.");
  }

  public static boolean isFree(Cat cat1) {
    if(!cat1.getOwner().equals(null)) {
      return true;
    }
      return false;
  }

  public static boolean isSibling(Cat cat1, Cat cat2) {
    if(cat1.getOwner().equals(cat2.getOwner())) {
      return true;
    }
    return false;
  }


  public static void main (String args[]) {
    Cat garfield = new Cat ("Garfield");
    garfield.setFavoriteFood("Lasagna");
    garfield.setAge(3);

    Cat pinkPanther = new Cat ("Pink Panther");
    pinkPanther.setFavoriteFood("crimes");
    pinkPanther.setAge(5);

    Cat catwoman = new Cat("CatWoman");
    catwoman.setFavoriteFood("jewlery");
    catwoman.setAge (4);

    Person jon = new Person ("Jon");



  }
}
