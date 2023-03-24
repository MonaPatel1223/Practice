package demo_inter;

/*
- We can not have a method body - only method declarations- 100% Abstraction.
- It will define all method in interface with no implementations
- No static methods in interface because we cannot override static.
- We can not create object of interface
-
 */

public class BobBank implements UK,USA,AUs{
    @Override
    public void freeDebitcard() {
        System.out.println("free Debit card");

    }

    @Override
    public void freeSavingAct() {
        System.out.println("Free saving Action");

    }

    @Override
    public void freeCashWith() {
        System.out.println("Free cash withdraw");

    }

    @Override
    public void FreecheBook() {
        System.out.println("Free chebook");

    }
}
