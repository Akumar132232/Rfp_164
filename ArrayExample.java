    import java.util.Arrays;

    public class ArrayExample {

        public static void main(String[] args) {
            //syntax
//        int[] arr = new int[5];
            // 0,1,2,3,4
            //[1,2,3,4,5]
            //syntax
//        int ar[] = {1,2,3,4,5};
            int a = 1;
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i] = a;//arr[1] = 2;
//            a++;
//       }
//        System.out.println(Arrays.toString(arr));
//        printArray(arr);

            //2D Array
            //column
            //[1,2,3  //row
            //4,5,6]
            //row //column
            //arr[0][0] = 1; arr[0][1] = 2;

            //syntax
            int[][] arr = new int[2][3];
            for (int i = 0; i < arr.length ; i++) {
                for (int j = 0; j < arr[i].length ; j++) {
                    arr[i][j] = a;
                    a++;
                }
            }
            System.out.println(Arrays.deepToString(arr));
        }

        public static void printArray(int arr[]){

            String print = "{";

            for (int i = 0; i < arr.length; i++) {
                print = print + arr[i] ; //{1->2->3->4->5
                if(i<arr.length-1){
                    print = print + "->";//{1->2->3->4->5
                }
                if(i == arr.length -1){
                    print = print+"}";//{1->2->3->4->5}
                }
            }
            System.out.println(print);
        }
    }

