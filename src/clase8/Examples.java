package src.clase8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Created by Michael Garcia on 26/08/24
 */
public class Examples
{
    public static void main(String[] args) throws InterruptedException
    {
//        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
//        LocalDate localDate = LocalDate.now(zoneId);
        Clock clock = Clock.system(ZoneId.of("Asia/Tokyo"));
        LocalDate localDate = LocalDate.now(clock);
        System.out.println(localDate);
        LocalDate localDateDifferent = LocalDate.of(2024, Month.APRIL, 30);
        System.out.println(localDateDifferent);


//        int i = 10;
//        while (i > 0)
//        {
//            LocalTime localTime = LocalTime.now();
//            Thread.sleep(1000);
//            System.out.println(localTime);
//            i--;
//        }
        LocalTime localTime = LocalTime.of(12, 45, 59);
        LocalTime localTimeAsia = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(localTimeAsia);

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTimeOther = LocalDateTime.of(2023, 3, 3, 3, 3);
        System.out.println(localDateTime);

        //More examples
        LocalDateTime localDateTimeModified = localDateTime.withDayOfMonth(1).withYear(2020);
        System.out.println(localDateTimeModified);


        LocalDateTime localDateTimeModifiedTime = localDateTime.plusYears(1).plusHours(2).minusDays(8);
        System.out.println(localDateTimeModifiedTime);

        long hoursDifferences = localDateTimeModified.until(localDateTimeModifiedTime, ChronoUnit.HOURS);
        System.out.println(hoursDifferences);

//        LocalDate newObject = LocalDate.of(2021, Month.SEPTEMBER, 2);
        LocalDate date = LocalDate.now();
        LocalDateTime time = LocalDateTime.now();
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE;
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd 'de' MMMM 'del' yyyy");
        DateTimeFormatter dateFormatHour = DateTimeFormatter.ofPattern("'Anio' yyyy 'dia' dd 'y mes' MMMM 'hora' h:mm a");
        String formatDate = date.format(dateFormat);
        String formatHour = time.format(dateFormatHour);
        System.out.println(formatHour);
        System.out.println(formatDate);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
        System.out.println(time.format(format));

        String dateString = "2024/12/12";
        LocalDate dateConverted = converToLocalDate(dateString);
        System.out.println(dateConverted);
    }

    private static LocalDate converToLocalDate(String dateString)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate parse = LocalDate.parse(dateString, formatter);
        System.out.println(parse.format(formatter));
        return parse;
    }
}
