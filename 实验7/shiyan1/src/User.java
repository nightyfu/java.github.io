import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class User {
    int Fpsw(String Tstirng){
        String regex="[^0123456789]+";
        String PASSWORLD="";
        Tstirng=Tstirng.replaceAll(regex,"#");
        StringTokenizer passworld=new StringTokenizer(Tstirng,"#");
        while(passworld.hasMoreTokens()){
            PASSWORLD=PASSWORLD+passworld.nextToken();
        }
        PASSWORLD=PASSWORLD.substring(0,6);
        int psw= parseInt(PASSWORLD);
        return psw;
    }
}
