/**
 * Created by DELL on 16/12/2022.
 */
public class Q1 {
    public static void main(String[] args) {
        Integer[] integers={10,20,30,40,50,60,70};
        System.out.println("This is array: ");
        for (int i = 0; i <integers.length ; i++) {
            System.out.println(integers[i] + "    ");

        }
        System.out.println("This is array after order");
        for (int j =integers.length-1; j >0 ; j--) {
            System.out.println(integers[j]+"  ");

        }
    }
}
