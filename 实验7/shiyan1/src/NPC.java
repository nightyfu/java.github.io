public class NPC {
    String talk(String a){
        StringBuffer stringBuffer=new StringBuffer(a);
        stringBuffer.reverse();
        String  Tstring=new String(stringBuffer);
        System.out.println("NPC说："+Tstring);
        return Tstring;
    }
    boolean open(int psw,String Tstring){
        User user = new User();
        if(psw==user.Fpsw(Tstring)) return true;
        else return false;
    }
}
