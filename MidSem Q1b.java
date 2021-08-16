
package midsem;
import java.util.Random;

public class MidSemAns {
    public static void main(String[] args) {
        int[] array = { 7, 6, 2,5, 4, 8, 3, 0, 2, 1 };
           remElmts(array);
    }
    static void remElmts(int[] array) {
        Random r = new Random(); //my code dey bee
        while (array.length > 0) {
        int index = r.nextInt(array.length);
        System.out.println("index = " + index + ", element = " + array[index]);
        int[] array4life = new int[array.length - 1];
        for (int i = 0; i < index; i++)
        array4life[i] = array[i];
        for (int i = index; i < array.length - 1; i++)
        array4life[i] = array[i + 1];
        array = array4life;
}
}
}
