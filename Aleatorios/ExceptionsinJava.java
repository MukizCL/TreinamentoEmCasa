package Aleatorios;

import java.util.ArrayList;
import java.util.Scanner;

//Try-catch examples

public class ExceptionsinJava {
    public static void main(String[] args) {
        try {
            int[] a = null; // a = {4};
            System.out.println(a[1]);
        } catch (NullPointerException e) {
            System.out.println("Your array is null!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Your index is out of bounds!");
        } catch (Exception e) {
            System.out.println("Something else went wrong!");
        }
    }
}