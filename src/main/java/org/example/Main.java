package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String greetingAndName = "Hello Tawanda";
        int birthYear = 1995;
        String birthYearString = "I was born in the year: ";
        double pi = 3.14;
        boolean isLearningJava = true;
        String favouriteFilm = "Fast & Furious";
        String favouriteFilmString = "My favourite film is ";
        String firstName = "Tawanda";

        System.out.println(greetingAndName);
        System.out.println( birthYearString + birthYear);
        System.out.println(isLearningJava);
        System.out.println(favouriteFilmString + favouriteFilm);

        favouriteFilm = "Hannah Montana: The Movie";

        System.out.println(favouriteFilmString + favouriteFilm);

        printGreeting(firstName);

        System.out.println(subtract(10, 4));

        System.out.println(isStringLonger("Hello", 6));

        System.out.println(isStringLonger("Hello", 3));
    }

    private static void printGreeting(String name){
        String helloString = "Hello, ";
        System.out.println(helloString + name);
        return;
    }

    private static int subtract(int a, int b){
        return a - b;
    }

    private static boolean isStringLonger(String word, int number) {
        return word.length() > number;
    }

}