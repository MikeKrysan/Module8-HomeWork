import java.util.Calendar;
/*

Лунные магнитики с кодом

Нам известно, что полнолуние бывает раз в 29,52 дня или около того. Полная луна была 11 апреля 2015 года в 09:07.
Необходимо переставить фрагменты кода так, чтобы получилась рабочая Java-программа, которая выведет на экран следующий текст:
"Полнолуние было в воскресенье, 10 мая 09:07 2015" (плюс еще больше дат, когда было полнолуние).
Возможно, вам понадобятся не все магнитики. При необходимости можете добавлять фигурные скобки.

Лунные магнитики с кодом:

long day1 = c.getTimeInMillis();

c.set(2015, 3 , 11 , 9, 07);

Import static java.lang.System.out;

static int DAY_IM = 60 * 60 * 24;

("Полнолуние было в %tc", c));

(c.format

Calendar c = Calendar.getInstance();

class FullMoons {

public static void main(String[] args) {

day1 +=(DAY_IM*29.52);

for(int x = 0; x<60; x++){

static int DAY_IM = 1000 * 60 * 60 * 24;

println

import java io.*;

("full moon on %t" , c));

import java.util.*;

static import java.lang.System.out;

c.set(2015, 4 , 11 , 9, 07);

out println

c.setTimeInMillis(day1);

(String.format

Calendar c = Calendar.getInstance();


Правильное решение:
 */
public class FullMoons {
    static int DAY_IM = 1000 * 60 * 60 * 24;

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();                           //Возваращает экземпляр Calendar, можно задать региональные настройки
        c.set(2015,3 , 11 , 9, 07);   //метод для детальной установки времени
        long day1 = c.getTimeInMillis();

        for(int x = 0; x<60; x++){
            day1 +=(DAY_IM*29.52);
            c.setTimeInMillis(day1);
            System.out.println(String.format("Полнолуние было в %tc", c));
        }
    }
}

/*
Вы могли увидеть, что несколько дат, выдаваемых этой программой, смещены на день. Астрономия - довольно хитрая штука, и если мы сделаем все идеально, это слишком
усложнить упражнение.

Дополнительная задача: одна проблема, которую вы можете решить, проявляется из-за разницы  в часовых поясах. Сможете ли вы это уладить?
 */