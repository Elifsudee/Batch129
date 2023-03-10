package day37lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda03 {

    public static void main(String[] args) {

        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

        List<Course> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        //1- Tum "averageScore" larin 91 den buyuk olup olmadigini kontrol eden kodu yaziniz

      boolean result1=  coursesList.stream().allMatch(t-> t.getAverageScore()>91);
        System.out.println(result1);//true

      //2)Kurs isimlerinden en az birinin "Turkish" kelimesini icerip icermedigini kontrol eden kodu yaziniz

     boolean result2=   coursesList.stream().anyMatch(t->t.getCourseName().contains("Turkish"));

        System.out.println(result2);//true

//3-"averageScore" u en yuksek olan kursun ismini consale yazdiran kodu yaziniz

    String name1=    coursesList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore).//siralama yap ortalama notlara gore
                reversed()).
                findFirst().//ilkini al
                get().
                getCourseName();

        System.out.println(name1);


//tum corse objectlerini "averageScore" a gore kucukten buyuge diziniz ve ilk ikisi haric liste halinde console `a yazdiriniz

       List<Course> myList = coursesList.stream().
                sorted(Comparator.comparing(Course::getAverageScore)).
                skip(2).//ilkm ikisini bos verdi
                collect(Collectors.toList());//list yapti
        System.out.println(myList);


        //tum course objectlerini aveage score`a gore kucukten buyuge diziniz ve ilk ucunu liste halinde console`a yazdiriniz

        List<Course> yourList=  coursesList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore)).
                limit(3).//ilk 3 unu yazdi
                collect(Collectors.toList());
        System.out.println(yourList);

        //tum course objectlerini aveage score`a gore kucukten buyuge diziniz ve ucuncuyu consale yaziniz


        Course ourList=  coursesList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore)).
               skip(2).limit(1).findFirst().get();

        System.out.println(ourList);



    }
}
