import java.util.Scanner;

/**
 * test
 */
public class login {

    public static void main(String[] args) {
        String oKuser = "jinyang";
        String oKpasswd = "123456";
        System.out.println("你好，欢迎你~~~~~~~~~~~~~~~~");
        
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入账号和密码！");
        String account = sc.next();
        String password = sc.next();
            if (account.equals(oKuser) && password.equals(oKpasswd)) {
                System.out.println("恭喜你，登录成功！");
                break;
            } else {
                System.out.println("登录失败，请重试！");
            }
        }
        sc.close();
        
        
    }
}