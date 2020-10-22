package testOther;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Date form 1 jan 1970 years. It date created unix
 * class Date very bed use for add day or weeks
 * public abstract class "Calendar" not have extends only implaments, private constructor and use with getInstance
 * public abstract class "DateFormat" extends "Format" not have implaments, private constructor for format data out, use with
 * public class "SimpleDateFormat" extends "DateFormat" > "Format"
 * @see Date
 * @see Calendar
 * @see DateFormat
 * @see SimpleDateFormat
 * @author Gavrilov Vasily
 */

public class DataTimeCalendar {
    public static void main(String[] args) throws ParseException {
        Date date = new Date(); //created varable with object class Date
        System.out.println(date); // Thu Oct 22 23:35:48 NOVT 2020
        Date dateStart = new Date(0); // you can send milliseconds for time
        System.out.println(dateStart); // Thu Jan 01 07:00:00 NOVT 1970
        Calendar calendar = Calendar.getInstance(); // start Calendar
        calendar.setTime(date); // put in Calendar variable object Date
        System.out.println(calendar); // java.util.GregorianCalendar[time=1603384923642,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Novosibirsk",offset=25200000,dstSavings=0,useDaylight=false,transitions=69,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=9,WEEK_OF_YEAR=43,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=296,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=42,SECOND=3,MILLISECOND=642,ZONE_OFFSET=25200000,DST_OFFSET=0]
        System.out.println(calendar.getTime()); // Thu Oct 22 23:43:25 NOVT 2020
        calendar.add(Calendar.WEEK_OF_MONTH, 4); // Fri Oct 23 00:05:48 NOVT 2020  we see add + 4 weeks
        System.out.println(calendar.getTime());
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        String dateFormating = dateFormat.format(calendar.getTime()); // Thu Oct 22 23:57:10 NOVT 2020
        System.out.println(dateFormating); // Thu Nov 19 23:57:10 NOVT 2020
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd"); // 19.11.20
        //if need add hours and minutes... then "yyyy-MM-dd HH:mm:ss.SSSZ"
        System.out.println(simpleDateFormat.format(calendar.getTime())); // 2020.11.19
        // reverse conversion data 08/09/1981
        Date newDate = simpleDateFormat.parse("1981.09.08"); // parser work with you time if need convert in Date
        System.out.println(newDate); // Tue Sep 08 00:00:00 NOVST 1981
        calendar.add(Calendar.MINUTE, 15); // if need add 15 minutes
        System.out.println(calendar.getTime());

    }
}
