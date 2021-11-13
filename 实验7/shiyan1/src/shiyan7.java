import java.util.Scanner;

public class shiyan7 {
    public static void main(String args[]){
        //你知道吗，我是2020年来到这个世界的，那时我才18岁，我喜欢的人已经离开这个世界2年了，我每天都要想念1024遍她的名字。
        System.out.println("请输入你想对NPC说的话：（他的习惯是倒叙复述你所说的的话）");
        System.out.println("你所说的话中的数字将帮助你打开NPC宝箱");
        String istring;
        Scanner input=new Scanner(System.in);
        istring=input.next();
        NPC npc=new NPC();
        User user=new User();
        String Tstring=npc.talk(istring);
        System.out.print("你获得的密码为(6位)：");
        int psw=user.Fpsw(Tstring);
        System.out.println(psw);
        if(npc.open(psw,Tstring)){
            System.out.println("恭喜你成功打开NPC的宝箱！");
        }else System.out.println("打开NPC的宝箱失败！");
    }
}
