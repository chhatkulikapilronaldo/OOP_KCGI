package ttwentyfive.spring.oop.groupe1.assignment1.m24w7304;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(sum(6,503)); //497 times

    }

    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }

}
