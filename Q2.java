/**
 * Created by DELL on 16/12/2022.
 */
public class Q2 {
    public static void main(String[] args) {

        int a[]={10,30,40};
        int b[]=new int[a.length];
        b = a;

        System.out.println("Component is array a[]");
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);



        }
        System.out.println("Component is array b[]");
        for (int j = 0; j <b.length ; j++) {
            System.out.println(b[j]);
        }
    }
}
