import java.util.Random;

/**
 * Created by DELL on 16/12/2022.
 */
public class Q3 {
    public static void main(String[] args) {

        int array[]={10,20,30,40,50};
        removeElement(array);

    }
    public static void removeElement(int[] array)
    {
        Random r=new Random();
        while (array.length>0){
            int index=r.nextInt(array.length);
            System.out.println("index"+index+"Element"+array[index]);
            int[] array1=new int[array.length-1];
            for (int i = 0; i <index ; i++) {
                array1[i]=array[i];
                for (int j = index; j <array.length-1 ; j++) {
                    array1[i]=array[i+1];
                    array=array1;

                }

            }
        }
    }

}
