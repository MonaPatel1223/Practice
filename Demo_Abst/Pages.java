/*package Demo_Abst;
// Abstract class

abstract class Pages {
    // Abstract method (does not have a body)
    //public abstract void header();
   //public abstract void title();
   // public abstract void logo();

    // Regular method
    public void logout() {
        System.out.println("User can Logout");
    }

}

// Subclass (inherit from Animal)
class Page2 extends Pages {
    public void header() {
        // The body of animalSound() is provided here
        System.out.println("The says: wee wee");
    }
}

class Main {
    public static void main(String[] args) {
        //Page2age2 myPig = new Pig(); // Create a Pig object
        //myPig.animalSound();
        //myPig.sleep();

        // create a object for Page2
        Page2 p=new Page2();
        p.header();
        p.logout();

    }
}*/