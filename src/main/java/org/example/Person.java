package org.example;

public class Person {
    String name;
    String gender;
    String tcNumber;
    int age;
    String email;
    String gsm;
    double wage;

    void bilgiGetir (){
        System.out.println("Personel Bilgisi");
        System.out.println("Personel Adı: "+ name +"\n" + "Personel Cinsiyeti: "+ gender +"\n" +"Personel TC: "+ tcNumber +"\n"
                +"Personel Yası: "+ age +"\n" +"Personel Email: "+ email +"\n" +"Personel No: "+ gsm +"\n" +"Personel Maaş: "+ wage);
        System.out.println("---------------------------------");
    }
}
