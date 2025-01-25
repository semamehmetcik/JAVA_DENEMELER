package soruCozumu;

import java.util.Arrays;

public class soruCozumu {
    public static void main(String[] args) {

        /*
        Verilen bir int array'in tüm elemanlarını 2 artırıp bize döndüren bir method oluşturun.
        Eski array'i yeni haliyle kaydedin
         */

        int arr [] ={1,3,5,78,12,56,41,23,4,9,7,30};

        arr = arrayArtir(arr,3);
        System.out.println(Arrays.toString(arr));



    }
    public  static  int[] arrayArtir (int[] arr, int artirmaMiktari){
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = arr[i] + artirmaMiktari;

        }return  arr;
    }
}
