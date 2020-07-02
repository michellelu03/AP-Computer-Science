class Lesson_17_Activity{
        public static boolean isSorted(int [] a){
            boolean flag = true;
            for (int i = 1; i < a.length; i++) {
                 if (a[i] < a[i - 1]) {
                    flag = false;
                    break;
            }
                }
            return flag;
        }
            
        
        public static int binarySearch(int [] a, int b){
            int l = 0;
            int r = a.length-1;
            int m;
            
            while(l < r){
                m = (l+r)/2;
                
                if(a[m] == b){
                    return m;
                }
                if(a[m] < b){
                    l = m +1;
                }
                if(a[m] > b){
                    r = m -1;
                }
                
            }
            return -1;
}
        public static void main(String[] args){
          int[] array = {1,2,3,4,5,6,7,8,9};
          System.out.println(isSorted(array) + "\nSearch: " + binarySearch(array, 9));
        }
}
