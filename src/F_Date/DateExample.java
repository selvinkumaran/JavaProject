package F_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date date =new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("MMMM EEEE  d/MM/yyyy");
        System.out.println(simpleDateFormat.format(date));
    }
}
