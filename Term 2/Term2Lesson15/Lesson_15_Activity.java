
class Lesson_15_Activity {
  
  
  public static void main(String[] args) { 
    String [] list = { "against" , "forms" , "belief" , "government" , "democratic" , "movement" , "understanding"};
    sortAndPrint(list);
  }
  
  public static void sortAndPrint(String [] list){
    int i, j, minIndex;
    for(i = 0; i < list.length-1; i++){
      minIndex = i;
      for(j = i + 1; j < list.length; j++){

        if (list[j].compareTo(list[minIndex]) < 0){
          minIndex = j;
        }
      }
  String temp = list[i];
      list[i] = list[minIndex];
      list[minIndex] = temp;
}

    for(int k = 0; k < list.length; k++){
        System.out.print(list[k] + " ");
  
  }
  }
}
  