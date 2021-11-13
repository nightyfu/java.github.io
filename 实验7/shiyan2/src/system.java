import java.time.LocalDate;

public class system {
    int gift(LocalDate a){
        LocalDate datenow=LocalDate.now();
            int age=datenow.getYear()-a.getYear();
            return age*10;
    }
}
