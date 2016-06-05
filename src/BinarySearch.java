/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IAlsmadi
 */
public class BinarySearch {
  
  /** Use binary search to find the key in the list */
  public int binarySearch(int[] list, int key) {
    int low = 0;
    int high = list.length - 1;
    //  A
    System.out.println("I am in A");
    while (high >= low) {
        // B
      System.out.println("I am in B");
        // list.length - 1 >= low
      int mid = (low + high) / 2;
      if (key < list[mid]){
          // C
       System.out.println("I am in C");
        high = mid - 1;
      //  list.length - 1 >= low && key < list[mid]
      }
      else if (key == list[mid]){
          // D
        System.out.println("I am in D");
      //    list.length - 1 >= low && key == list[mid]
        return mid;
      }
      else{
          // E
       System.out.println("I am in E");
        low = mid + 1;
        // list.length - 1 >= low && low == (low + list.length - 1) / 2
      }
      // F
        System.out.println("I am in F");
    }
   // G
      System.out.println("I am in G");
    return -low - 1; // Now high < low
  }

}
