package Data;

import java.util.Date;

import static java.lang.String.valueOf;

public record Project(String name, java.time.LocalDate startdate) {

     static int i = 000;

    public String id(){
        String id = valueOf(startdate.getYear()) + i;
        i++;

        return id;
    }

}
