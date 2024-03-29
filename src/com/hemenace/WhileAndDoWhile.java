package com.hemenace;

import java.io.IOException;

public class WhileAndDoWhile {

    public static void main(String[] args) {

        int count = 1;
        while (count != 6){
            System.out.println(count);
            count++;
        }

        for (count = 1; count != 6 ; count++) {
            System.out.println(count);
        }

    }

}
//Guess the letter
class Guess4 {
    public static void main(String[] args) throws IOException {

        char ch, ignore, answer = 'k';

        do {
            System.out.println("I'm thinking of a letter between A and Z.");
            System.out.println("Can you guess it?...");

            //read a character
            ch = (char) System.in.read();

            //discard any other characters in the input buffer
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer)
                System.out.println("*** You Got it Right!!! ***");
            else {
                System.out.println("...Sorry you're ");
                if(ch < answer)
                    System.out.println("too low");
                else System.out.println("too high");
                System.out.println("Try Again! \n");
            }
        } while (answer != ch);
    }
}

//Using break to exit a loop
class BreakDemo{
    public static void main(String[] args) {

        int num = 100;

        //loop while i-square is less than num
        for (int i = 0; i < num; i++) {
            if (i * i >= num)
                break; //terminates loop if i*i = 100
            System.out.println(i + " ");
        }
        System.out.println("Loop complete!");
    }

}

//Read input until a 'q' is received
class Break2{

    public static void main(String[] args) throws IOException{

        char ch;
        for (; ; ) {
            ch = (char) System.in.read();
            if (ch == 'q')
                break;
        }
        System.out.println("Nice you pressed q!");
    }
}

//Using break with nested loops
class Break3{
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Outer loop count: " + i);
            System.out.println("        Inner loop count: ");

            int t = 0;

            while (t < 100){
                if ( t == 10) break; //terminates loop if t is 10
                System.out.println(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Loops complete!");
    }
}

//Using break with a label
class  Break4{
    public static void main(String[] args) {
    int i;

        for (i = 1;i < 4; i++) {

            one:{
            two:{
                three:{
                    System.out.println("\ni is " + i);
                    if (i == 1) break one;
                    if (i == 2) break two;
                    if (i == 3) break three;

                    // this is never reached
                    System.out.println("won't print");
                }
                System.out.println("After block three");
            }
                System.out.println("After block two");
            }
            System.out.println("After block one");
        }
        System.out.println("After for");

    }
}

//Another example of using break with a label
class Break5{
    public static void main(String[] args) {

        done:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(k + " ");
                    if (k == 5) break done; //jump to done
                }
                System.out.println("After k loop"); // wont execute
            }
            System.out.println("After j loop"); // wont execute
        }
        System.out.println("After i loop");
    }
}
//Where you put a label is important
class Break6 {
    public static void main(String[] args) {
        int x, y;

        // here label before statement

        stop1:
        for (x = 0; x < 5; x++) {
            for (y = 0; y < 5; y++) {
                if (y == 2) break stop1;
                System.out.println("x and y " + x + " " + y);
            }
        }
        System.out.println();
        //now label before {
        for (x = 0; x < 5; x++) stop2: {
            for (y = 0; y < 5; y++) {
                if (y == 2) break stop2;
                System.out.println("x and y " + x + " " + y);
            }
        }
    }
}