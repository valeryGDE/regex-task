package com.learn.java.basic;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    //        Дана строка 'ahb acb aeb aeeb adcb axeb'. Напишите регулярку, которая найдет строки
//        ahb, acb, aeb по шаблону: буква 'a', любой символ, буква 'b'.
    @Test
    public void task1() {
        Pattern pattern = Pattern.compile("a.b");
        Matcher matcher = pattern.matcher("ahb acb aeb aeeb adcb");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    //      Дана строка 'aba aca aea abba adca abea'. Напишите регулярку, которая найдет строки
//      abba adca abea по шаблону: буква 'a', 2 любых символа, буква 'a'.
    @Test
    public void task2() {
        Pattern pattern = Pattern.compile("a.{2}a");
        Matcher matcher = pattern.matcher("aba aca aea abba adca abea");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    //    Дана строка 'aba aca aea abba adca abea'. Напишите регулярку, которая найдет строки
//    abba и abea, не захватив adca.
    @Test
    public void task3() {
        Pattern pattern = Pattern.compile("ab.a");
        Matcher matcher = pattern.matcher("aba aca aea abba adca abea");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    //    Дана строка 'aa aba abba abbba abca abea'. Напишите регулярку, которая найдет строки
//    aba, abba, abbba по шаблону: буква 'a', буква 'b' любое количество раз, буква 'a'.
    @Test
    public void task4() {
        Pattern pattern = Pattern.compile("ab+a");
        Matcher matcher = pattern.matcher("aa aba abba abbba abca abea");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    //    Дана строка 'aa aba abba abbba abca abea'. Напишите регулярку, которая найдет строки
//    aa, aba, abba, abbba по шаблону: буква 'a', буква 'b' любое количество раз (в том числе ниодного раза), буква 'a'.
    @Test
    public void task5() {
        Pattern pattern = Pattern.compile("ab*a");
        Matcher matcher = pattern.matcher("aa aba abba abbba abca abea");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    //    Дана строка 'aa aba abba abbba abca abea'. Напишите регулярку, которая найдет строки
//    aa, aba по шаблону: буква 'a', буква 'b' один раз или ниодного, буква 'a'.
    @Test
    public void task6() {
        Pattern pattern = Pattern.compile("ab?a");
        Matcher matcher = pattern.matcher("aa aba abba abbba abca abea");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    //    Дана строка 'aa aba abba abbba abca abea'. Напишите регулярку, которая найдет строки
//    aa, aba, abba, abbba, не захватив abca abea.
    @Test
    public void task7() {
        Pattern pattern = Pattern.compile("ab*a");
        Matcher matcher = pattern.matcher("aa aba abba abbba abca abea");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    //    Дана строка 'ab abab abab abababab abea'. Напишите регулярку, которая найдет строки по шаблону:
//    строка 'ab' повторяется 1 или более раз.
    @Test
    public void task8() {
        Pattern pattern = Pattern.compile("(ab)+(\\w*)");
        Matcher matcher = pattern.matcher("ab abab abab abababab abea");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    //    Дана строка 'a.a aba aea'. Напишите регулярку, которая найдет строку a.a, не захватив остальные.
    @Test
    public void task9() {
        Pattern pattern = Pattern.compile("a\\.a");
        Matcher matcher = pattern.matcher("a.a aba aea");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    //    Дана строка '2+3 223 2223'. Напишите регулярку, которая найдет строку 2+3, не захватив остальные.
    @Test
    public void task10() {
        Pattern pattern = Pattern.compile("2\\+3");
        Matcher matcher = pattern.matcher("2+3 223 2223");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    //    Дана строка '23 2+3 2++3 2+++3 345 567'. Напишите регулярку, которая найдет строки
//    2+3, 2++3, 2+++3, не захватив остальные (+ может быть любое количество).
    @Test
    public void task11() {
        Pattern pattern = Pattern.compile("2\\++3");
        Matcher matcher = pattern.matcher("23 2+3 2++3 2+++3 345 567");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    //    Дана строка '23 2+3 2++3 2+++3 445 677'. Напишите регулярку, которая найдет строки
//    23, 2+3, 2++3, 2+++3, не захватив остальные.
    @Test
    public void task12() {
        Pattern pattern = Pattern.compile("2\\+*3");
        Matcher matcher = pattern.matcher("23 2+3 2++3 2+++3 445 677");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    //    Дана строка '*+ *q+ *qq+ *qqq+ *qqq qqq+'. Напишите регулярку, которая найдет строки
//    *q+, *qq+, *qqq+, не захватив остальные.
    @Test
    public void task13() {
        Pattern pattern = Pattern.compile("\\*q+\\+");
        Matcher matcher = pattern.matcher("*+ *q+ *qq+ *qqq+ *qqq qqq+");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    //    Дана строка 'aba accca azzza wwwwa'. Напишите регулярку, которая найдет все строки
//    по краям которых стоят буквы 'a', и заменит каждую из них на '!'. Между буквами
//    a может быть любой символ (кроме a).
    @Test
    public void task14() {
        Pattern pattern = Pattern.compile("a\\w+?a");
        Matcher matcher = pattern.matcher("aba accca azzza wwwwa");
        while (matcher.find()) {
            System.out.println(matcher.group().replaceAll("a", "!"));
        }
    }
}
