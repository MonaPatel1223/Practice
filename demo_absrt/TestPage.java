package demo_absrt;

public class TestPage {
    public static void main(String[] args) {
        Login_Page lp=new Login_Page();
        lp.header();
        lp.title();
        lp.logo();
        lp.login("Mona","1234");
        lp.Logout();
    }
}
