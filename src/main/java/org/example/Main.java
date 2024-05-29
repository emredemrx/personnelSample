package org.example;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
            person1.name = "Ahmet";
            person1.gender = "Erkek";
            person1.tcNumber = "25565485755";
            person1.age = 33;
            person1.email = "test@test.com";
            person1.gsm = "5318758869";
            person1.wage = 50000;
            person1.bilgiGetir();

        Person person2 = new Person();
            person2.name = "Ayse";
            person2.gender = "Kadın";
            person2.tcNumber = "26565485755";
            person2.age = 35;
            person2.email = "test@deneme.com";
            person2.gsm = "5318758562";
            person2.wage = 60000;
            person2.bilgiGetir();

    }
}