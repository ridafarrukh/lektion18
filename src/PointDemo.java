/**
 * created by Rida Warsi
 * Date : 2020-11-02
 * Time : 23:37
 * Project : lektion 18
 * Copyright : MIT
 */

public class PointDemo {
    public static void main(String[] args) {

        //skapa en punkt
        Point p1 = new Point();
        Point.Print(p1);

        // skapa en array som innehåller 5 referensvariabler
        Point[] arr = new Point[5];

        //vi har fått en array med 5 referansvariabler
        for (Point p : arr)
            System.out.println(p);

        // skapa 5 punkter
        for (int i = 0; i < arr.length; i++)
            arr[i] = new Point();

        // skriv ut referenserna
        for (Point p : arr)
            System.out.println(p);

        // skriv ur punkterna med for-loop
        for (Point p : arr)
           Point.Print(p1);

        //skriv ut första punkt i arrayen
        arr[0].x = 3;
        arr[0].y = 5;
        Point.Print(arr[0]);


    }


}
