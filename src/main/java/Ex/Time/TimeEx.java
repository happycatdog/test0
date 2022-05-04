package Ex.Time;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeEx {

    public static void main(String[] args){

        Instant i1 = Instant.now();
        Instant i2 = Instant.ofEpochMilli(1600705425827L);
        long l = i2.toEpochMilli();

        ZonedDateTime z1 = ZonedDateTime.now();
        ZonedDateTime z2 = ZonedDateTime
                .of(2022,1,2,3,4,5,6,
                        ZoneId.of("Asia/Tokyo"));

        Instant i3 = z2.toInstant();
        ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

        System.out.println("Tokyo:" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
        System.out.println("London:" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());

        if(z2.isEqual(z3)) System.out.println("IsEqual is True");
        if(!z2.equals(z3)) System.out.println("Equal is False");

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate ldate = LocalDate.parse("2022/05/04",fmt);

        LocalDate ldatep = ldate.plusDays(1000);
        String str = ldatep.format(fmt);
        System.out.println("1000Days After is " + str);

        LocalDate now = LocalDate.now();
        if(now.isAfter(ldatep)) System.out.println("1000Days is passing day");

        LocalDate d1 = LocalDate.of(2022,5,4);
        LocalDate d2 = LocalDate.of(2022,5,7);

        Period p1 = Period.ofDays(3);
        Period p2 = Period.between(d1,d2);

        LocalDate d3 = d2.plus(p2);
        System.out.println(p1 + " : " + p2 + " : " + d3);
    }
}
