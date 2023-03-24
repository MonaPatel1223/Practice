package demo_absrt;

public class Login_Page extends Pages {
    @Override
    public void header() {
        System.out.println("this is a header page");

    }

    @Override
    public void title() {
        System.out.println("this is title page");

    }

    @Override
    public void logo() {
        System.out.println("this is logo page");

    }
    public void login(String Uname,String pwd){
        System.out.println("UserNAMe:"+Uname);
        System.out.println("Password:"+pwd);

    }
}
