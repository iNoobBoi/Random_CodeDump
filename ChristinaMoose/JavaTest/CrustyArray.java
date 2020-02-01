public class CrustyArray {
  public static void main(String []args) {
    int [] intArray = {4, 3, 2, 1, 0};
    int intArrayThing [] = new int[3];
    
    System.out.println(intArray[0]);
    System.out.println(intArray[1]);
    System.out.print(intArray[2]);
    System.out.println(intArray[3]);
    System.out.print(intArray[4]);
    
    intArray[0] = 0;
    intArray[1] = 1;
    intArray[2] = 2;
    intArray[3] = 3;
    intArray[4] = 4;
    
    System.out.println(intArray[0]);
    System.out.println(intArray[1]);
    System.out.print(intArray[2]);
    System.out.println(intArray[3]);
    System.out.print(intArray[4]);
    }
  }
