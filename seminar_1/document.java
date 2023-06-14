package seminar_1;

import java.lang.reflect.Array;
import java.util.Arrays;

/**смешение 3 в конец массива.
 * document
 */
public class document {

   public static void main(String[] args) {
//         int[] array = {3,2,4,3,3,1,5,3,3,2,3};
//         int value = 3;
//         int count = 0;
//         for (int i = 0; i < array.length; i++) {
//             if (array[i] != value){
//                 array[count] = array[i];
//                 array[i] = value;
//                 count +=1;
//             }

//         }
//         System.out.println(Arrays.toString(array));
//    }


   int [] array = new int [] {1,1,0,1,1,1,0,1,1,1};
   int count = 0;
   int max = 0;
   for (int i :array ) {
        if(i == 1){
            count+=1;
        }
        if(max < count){
            max = count;
        }
        if(i == 0){
            count = 0;
        }
   }System.out.println(max);
   }

}
