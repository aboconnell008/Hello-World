
package Chapter7;
import java.util.Arrays;
public class ArrayPractice2 {
    public static void main(String[]args){
        //step 1: declare a variable
        int x;
        int[] numbers1= new int[5];// an int aray of size five
        //step 2: initialize the variable
        x = 5;
        System.out.println(Arrays.toString(numbers1));
        for(int i=0; i<5; i++){
            numbers1[i]= i+1;
        }
        System.out.println(Arrays.toString(numbers1));
        //or
        int y=5;

        int [] numbers2={1,2,3,4,5};
        System.out.println(Arrays.toString(numbers2));
    }
}
