package demo_absrt;

/*
- It has abstract keyword
- Abstract means method with no body
- Abstract method is final static  method
- It will have abstract and non abstract method

- header
- title
- logo

 */

public abstract class Pages {

    public abstract void header();
    public abstract void title();
    public abstract void logo();

    public void Logout(){
        System.out.println("This is Logout page");

    }


}
