import java.util.*;

public class usingSwitch{
    public static void main(String[] avge){
        System.out.print("請輸入1到5其中一個數字");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch(num) {
            case 1:
                System.out.print("你輸入的為1");
                break;
            case 2:
                System.out.print("你輸入的為2");
                break;
            case 3:
                System.out.print("你輸入的為3");
                break;  
            case 4:
                System.out.print("你輸入的為4");
                break;
            case 5:
                System.out.print("你輸入的為5");
                break;
            default:
                System.out.print("輸入錯誤");
        }
    }
}