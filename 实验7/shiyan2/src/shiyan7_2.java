import java.time.LocalDate;
import java.util.Scanner;

public class shiyan7_2 {
    public static void main(String args[]){
        LocalDate datenow=LocalDate.now();
        System.out.println("请输入你的生日：（例如： 2002 9 4）");
        Scanner input=new Scanner(System.in);
        int year=input.nextInt();
        int month=input.nextInt();
        int dayofmonth=input.nextInt();
        User user=new User(year,month,dayofmonth);
        if(user.birthday.getMonthValue()==datenow.getMonthValue()&&user.birthday.getDayOfMonth()==datenow.getDayOfMonth()){
            System.out.println("今天是你的生日，生日快乐！系统将赠送给你游戏积分！");
            system system=new system();
            System.out.println("你获得的游戏积分为："+system.gift(user.birthday));
        }else System.out.println("很抱歉今天不是你的生日，不能获得积分增送");
    }
}
