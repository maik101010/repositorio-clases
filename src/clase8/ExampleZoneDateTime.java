package src.clase8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Created by Michael Garcia on 26/08/24
 */
public class ExampleZoneDateTime
{
    public static void main(String[] args)
    {
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        LocalDate localDateAsia = LocalDate.now(zoneId);
        LocalTime localTime = LocalTime.now(zoneId);
        System.out.println(localDateAsia);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateAsia, localTime, zoneId);
        System.out.println(zonedDateTime);
    }
}
