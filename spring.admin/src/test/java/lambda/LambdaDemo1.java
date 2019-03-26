package lambda;

import org.assertj.core.util.Lists;
import org.springframework.core.convert.converter.Converter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Author: Administrator
 * Date 2019/1/21 0021 下午 7:46
 */
public class LambdaDemo1 {

    static int x = 3, y = 3;

    public static void main(String[] args) {
        List<String> proNames = Arrays.asList(new String[]{"Ni", "Hao", "Lambda"});
        List<String> lowercaseNames2 = proNames.stream().map(name -> name.toLowerCase()).collect(Collectors.toList());
        //方法引用
        System.out.println(proNames.stream().map(String::toLowerCase).collect(Collectors.toList()));
        List<Integer> integers = Lists.newArrayList();
        integers.add(5);
        integers.forEach(i -> {
            i = x + y;
            System.out.println(i);
            return;
        });
        System.out.println(lowercaseNames2);
        String waibu = "lambda :";
        List<String> proStrs = Arrays.asList(new String[]{"Ni", "Hao", "Lambda"});
        List<String> execStrs = proStrs.stream().map(chuandi -> {
            Long zidingyi = System.currentTimeMillis();
            return waibu + chuandi + " -----:" + zidingyi;
        }).collect(Collectors.toList());
        //方法引用
        execStrs.forEach(System.out::println);
        // Stream
        List<Integer> nums = Lists.newArrayList(1,1,null,2,3,4,null,5,6,7,8,9,10);
        System.out.println("sum is:"+
                nums.stream()
                .filter(num -> num != null)
                .distinct().mapToInt(num -> num+1)
                .peek(System.out::println)
                .skip(2)
                .limit(4)
                .sum());

        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Converter<String, Integer> converter2 = Integer::valueOf;
        Integer converted = converter.convert("123");
        Integer converted2 = converter2.convert("345");
        System.out.println(converted);
        System.out.println(converted2);

        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("当前时间: " + currentTime);

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("当前日期date1: " + date1);

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();

        System.out.println("月: " + month +", 日: " + day +", 秒: " + seconds);

        LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
        System.out.println("date2: " + date2);

        // 12 december 2014
        LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
        System.out.println("date3: " + date3);

        // 22 小时 15 分钟
        LocalTime date4 = LocalTime.of(22, 15);
        System.out.println("date4: " + date4);

        // 解析字符串
        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("date5: " + date5);
    }
}
