import java.time.LocalDate;

public class User {
    LocalDate birthday;
    User(int year,int month,int dayofmonth){
        birthday= LocalDate.of(year,month,dayofmonth);
    }
}
